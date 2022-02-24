import java.util.Random;

/**
 * Propriétés invariantes.
 * - la durée de vie d'un tamagotchi est strictement positive :
 *       0 < this.lifeTime()
 * - l'âge d'un tamagotchi est compris entre 0 et sa durée de vie :
 *     0 <= this.age() <= this.lifeTime()
 * - l'énergie minimale d'un tamagotchi est strictement positive et strictement
 *   inférieure à son énergie maximale :
 *     0 < this.minEnergy() < this.maxEnergy()
 * - l'énergie d'un tamagotchi est strictement positive :
 *     0 <= this.energy()
 * - un tamagotchi est vivant tant que son énergie ne dépasse pas le maximum,
 *   et que son espérance de vie est strictement supérieure à sa dette
 *   énergétique :
 *     this.isAlive()
 *         <==> this.energy() <= this.maxEnergy()
 *              && this.lifeTime() - this.age() > this.energyDebt()
 * - un tamagotchi est affamé ssi il est vivant et que son énergie est
 *   inférieure ou égale à son minimum d'énergie :
 *     this.isStarved() <==> this.isAlive() && this.energy() <= this.minEnergy()
 */
public class Tamagotchi {

    // ATTRIBUTS STATIQUES

    /**
     *  L'accroissement maximal d'énergie apporté par un repas.
     */
    public static final int ENERGY_GAIN = 5;

    // ATTRIBUTS

    /**
     * La durée de vie de ce tamagotchi.
     */
    private final int lifeTime;
    

    /**
     * L'énergie maximale de ce tamagotchi.
     */
    private final int maxEnergy;

    /**
     * L'énergie minimale de ce tamagotchi.
     */
    private final int minEnergy;
    
    /**
     * L'âge de ce tamagotchi.
     */
    private int age;

    /**
     * La dette énergétique de ce tamagotchi.
     */
    private int energyDebt;

    /**
     * L'énergie de ce tamagotchi.
     */
    private int energy;

    // CONSTRUCTEURS

    /**
     * Un tamagotchi qui vient de naître.
     * En entrée
     * - lifeTime doit être strictement positif : 0 < lifeTime
     * - min doit être strictement positif et strictement plus petit que max :
     *     0 < min < max
     * En sortie
     * - ce tamagotchi a un âge égal à 0 : this.age() == 0
     * - ce tamagotchi a une durée de vie égale à lifeTime :
     *     this.lifeTime() == lifeTime
     * - ce tamagotchi a une énergie minimale égale à min :
     *     this.minEnergy() == min
     * - ce tamagotchi a une énergie maximale égale à max :
     *     this.maxEnergy() == max
     * - ce tamagotchi a une énergie entre min et la moyenne de min et max :
     *     min <= this.energy() <= (min + max) / 2
     * - ce tamagotchi n'a pas de dette énergétique :
     *     energyDebt() == 0
     */
    public Tamagotchi(int lifeTime, int min, int max) {
        if (lifeTime <= 0) {
            throw new AssertionError();
        }
        if (min <= 0 || min >= max) {
            throw new AssertionError();
        }
        this.age = 0;
        this.lifeTime = lifeTime;
        this.minEnergy = min;
        this.maxEnergy = max;
        this.energy = alea(min, (min + max) / 2);
        this.energyDebt = 0;
    }

    // REQUETES

    /**
     * L'âge de ce tamagotchi.
     */
    public int age() {
        return this.age;
    }

    /**
     * L'énergie de ce tamagotchi.
     */
    public int energy() {
        return this.energy;
    }
    
    /**
     * La dette énergétique de ce tamagotchi.
     */
    public int energyDebt() {
        return this.energyDebt;
    }

    /**
     * La durée de vie de ce tamagotchi.
     */
    public int lifeTime() {
        return this.lifeTime;
    }

    /**
     * L'énergie maximale de ce tamagotchi.
     */
    public int maxEnergy() {
        return this.maxEnergy;
    }

    /**
     * L'énergie minimale de ce tamagotchi.
     */
    public int minEnergy() {
        return this.minEnergy;
    }

    /**
     * Indique si ce tamagotchi est bien vivant.
     */
    public boolean isAlive() {
        return this.energy <= this.maxEnergy && this.lifeTime - this.age > this.energyDebt;
    }

    /**
     * Indique si ce tamagotchi est affamé.
     */
    public boolean isStarved() {
        return this.isAlive() && this.energy <= this.minEnergy;
    }

    // COMMANDES

    /**
     * Nourrit ce tamagotchi en lui donnant mealNb plats qui vont chacun
     *  augmenter son niveau d'énergie d'au plus ENERGY_GAIN.
     * En entrée
     * - ce tamagotchi doit être vivant : this.isAlive()
     * - le nombre de plats doit être strictement positif : mealNb > 0
     * En sortie
     * - l'énergie de ce tamagotchi a augmenté d'une valeur égale à la somme
     *   de mealNb valeurs aléatoires comprises entre 1 et ENERGY_GAIN :
     *     Let n ::= old this.energy()
     *         this.energy() in [n + mealNb .. n + mealNb * ENERGY_GAIN]
     * - l'âge, la dette énergétique, la durée de vie et les minimum et maximum
     *   d'énergie n'ont pas changé :
     *     this.age() == old this.age()
     *     this.energyDebt() == old this.energyDebt()
     *     this.lifeTime() == old this.lifeTime()
     *     this.minEnergy() == old this.minEnergy()
     *     this.maxEnergy() == old this.maxEnergy()
     */
    public void eat(int mealNb) {
        if (!this.isAlive()) {
            throw new AssertionError("Votre tama est dead");
        }
        if (mealNb <= 0) {
            throw new AssertionError();
        }
        int n = this.energy;
        this.energy = (n + mealNb) * alea(1, ENERGY_GAIN);
    }

    /**
     * Passe un tour de jeu pour ce tamagotchi, qui reste éveillé sans rien
     *  faire.
     * En entrée
     * - ce tamagotchi doit être vivant : this.isAlive()
     * En sortie
     * - l'âge de ce tamagotchi a augmenté de 1 :
     *     this.age() == old this.age() + 1
     * - ce tamagotchi a perdu une unité d'énergie durant le tour, de plus
     *   s'il avait suffisamment d'énergie pour survivre et que sa dette
     *   énergétique était strictement positive, alors il a remboursé cette
     *   dernière d'autant que son niveau d'énergie le lui a permis :
     *     old this.energy() == 0
     *         ==> this.energy() == 0
     *             this.energyDebt() == old this.energyDebt() + 1
     *     old this.energy() == 1
     *         ==> this.energy() == 0
     *             this.energyDebt() == old this.energyDebt()
     *     old this.energy() >= 2
     *         ==> this.energyDebt() ==
     *                 old (this.energyDebt() - min(this.energyDebt(), this.energy() - 1))
     *             this.energy() ==
     *                 old (this.energy() - 1
     *                     - min(this.energyDebt(), this.energy() - 1))
     * - la durée de vie et les minimum et maximum d'énergie n'ont pas changé :
     *     this.lifeTime() == old this.lifeTime()
     *     this.minEnergy() == old this.minEnergy()
     *     this.maxEnergy() == old this.maxEnergy()
     */
    public void evolve() {
        if (!this.isAlive()) {
            throw new AssertionError();
        }
        this.age += 1;
        if (this.energy == 0) {
            this.energyDebt += 1;
        } else if (this.energy == 1) {
            this.energy = 0;
        } else if (this.energy >= 2) {
            this.energyDebt = this.energyDebt - mini(this.energyDebt, this.energy - 1);
            this.energy = this.energy - mini(this.energyDebt, this.energy - 1) - 1;
        }
    }

    // OUTILS

    /**
     * Une description textuelle de ce tamagotchi pour jouer sous BlueJ.
     * En sortie
     * - la valeur retournée est une chaîne de caractères de la forme
     *     Tamagotchi[âge:a(A) ; énergie:e(m/M)]
     *   où a et A représentent l'âge et l'âge maximal du tamagotchi, et m, e,
     *   et M représentent respectivement son énergie minimale, son énergie
     *   et son énergie maximale
     */
    public String toString() {
        return "Tamagotchi[âge:" + this.age + "(" 
                + this.lifeTime + "); énergie:" 
                + this.energy + "(" + this.minEnergy 
                + "/" + this.maxEnergy + ")]";
    }

    private int alea(int a, int b) {
        Random random = new Random();
        int nb;
        nb = a + random.nextInt(b - a);
        return nb;
    }

    private int mini(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }
}

