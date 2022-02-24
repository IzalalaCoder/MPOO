package serie01.model;

import serie01.util.Currency;

/**
 * Spécifie un modèle de conversion monétaire.
 * Ce modèle gère un nombre quelconque de monnaies et les montants associés.
 * Les montants sont toujours équivalents modulo le taux de change entre
 *  les devises.
 * Il est possible de changer :
 * <ul>
 *  <li>chacune des devises ;</li>
 *  <li>chacun des montants ;</li>
 *  <li>le taux de change (par rapport à l'Euro) d'une devise
 *   quelconque ;</li>
 * </ul>
 * @inv <pre>
 *     getCurrencyNb() >= 2
 *     forall i,j in [0..getCurrencyNb() - 1] :
 *         getCurrency(i) != null
 *         getExchangeRate(i, j) ==
 *             getCurrency(j).getExchangeRate()
 *                 / getCurrency(i).getExchangeRate()
 *         getAmount(j) == getAmount(i) * getExchangeRate(i, j) </pre>
 * 
 * @cons
 * $DESC$
 *     Le modèle est initialisé avec des montants nuls, des devises toutes à
 *      l'euro.
 * $ARG$
 *     int n
 * $PRE$
 *     n >= 2
 * $POST$
 *     getCurrencyNb() == n
 *     forall i in [0..n - 1] :
 *         getCurrency(i) == Currency.get(CurrencyId.EUR)
 *         getAmount(i) == 0.0
 */
public interface MultiConverter {

    // REQUETES
    /**
     * Indique la valeur mémorisée par le modèle, convertie dans la monnaie
     *  enregistrée à l'index <code>index</code>.
     * @pre <pre>
     *     0 <= index < getCurrencyNb() </pre>
     */
    double getAmount(int index);

    /**
     * La devise mémorisée à l'index <code>index</code>.
     * @pre <pre>
     *     0 <= index < getCurrencyNb() </pre>
     */
    Currency getCurrency(int index);
    
    /**
     * Le nombre total de devises dans ce modèle.
     */
    int getCurrencyNb();
    
    /**
     * Le taux de change entre les devises d'index précisés pour ce modèle.
     * @pre <pre>
     *     0 <= index1 < getCurrencyNb()
     *     0 <= index2 < getCurrencyNb() </pre>
     */
    double getExchangeRate(int index1, int index2);

    // COMMANDES
    /**
     * Fixe la valeur mémorisée par le modèle au montant <code>amount</code>
     *  pour la devise enregistrée au rang <code>index</code>. 
     * @pre <pre>
     *     0 <= index < getCurrencyNb()
     *     amount >= 0.0 </pre>
     * @post <pre>
     *     getAmount(index) == amount </pre>
     */
    void setAmount(int index, double amount);

    /**
     * Enregistre la devise <code>c</code> auprès du modèle
     *  au rang <code>index</code>.
     * @pre <pre>
     *     0 <= index < getCurrencyNb()
     *     c != null </pre>
     * @post <pre>
     *     getCurrency(index) == c </pre>
     */
    void setCurrency(int index, Currency c);
}
