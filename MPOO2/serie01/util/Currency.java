package serie01.util;

import java.util.EnumMap;

import util.Contract;

/**
 * Une devise permet d'accéder à un enregistrement dans la base de données.
 * C'est par le biais d'une devise que les classes externes au paquetage
 *  <code>util</code> peuvent consulter ou modifier la base de données.
 * @inv <pre>
 *     getId() != null
 *     getExchangeRate() > 0
 *     getIsoCode() != null && getIsoCode().length() == 3
 *     getCountry() != null
 *     getName() != null </pre>
 */
public final class Currency {
    
    // ATTRIBUTS
    
    /**
     * Base de données associée aux devises, déterminée par setDB (voir
     *  à la fin).
     */
    private static CurrencyDB currencyDB;
    
    /**
     * Cache des devises créées.
     */
    private static final EnumMap<CurrencyId, Currency> CURRENCIES =
            new EnumMap<CurrencyId, Currency>(CurrencyId.class);
    
    /**
     * Identificateur de la devise.
     */
    private CurrencyId id;
    
    // CONSTRUCTEURS
    
    /**
     * Une devise d'identificateur id.
     * @pre <pre>
     *     id != null </pre>
     * @post <pre>
     *     getId() == id </pre>
     */
    private Currency(CurrencyId id) {
        assert id != null;
        this.id = id;
    }
    
    /**
     * La devise d'identificateur id.
     * @pre <pre>
     *     id != null </pre>
     * @post <pre>
     *     result.getId() == id </pre>
     */
    public static Currency get(CurrencyId id) {
        Contract.checkCondition(id != null,
                "l'identificateur de monnaie ne peut être null");

        Currency c = CURRENCIES.get(id);
        if (c == null) {
            c = new Currency(id);
            CURRENCIES.put(id, c);
        }
        return c;
    }

    // REQUETES
    
    /**
     * L'identificateur de la devise.
     */
    public CurrencyId getId() {
        return id;
    }
    
    /**
     * Le taux de change de la devise.
     */
    public double getExchangeRate() {
        return currencyDB.getExchangeRate(id);
    }
    
    /**
     * Le code ISO de la devise.
     */
    public String getIsoCode() {
        return currencyDB.getIsoCode(id);
    }
    
    /**
     * Le pays où a cours la devise.
     */
    public String getCountry() {
        return currencyDB.getCountry(id);
    }
    
    /**
     * Le nom de la devise.
     */
    public String getName() {
        return currencyDB.getName(id);
    }

    // COMMANDES
    
    /**
     * Modifie le taux de change de la devise.
     * @pre <pre>
     *     rate > 0 </pre>
     * @post <pre>
     *     getExchangeRate() == rate </pre>
     */
    public void setExchangeRate(double rate) {
        Contract.checkCondition(rate > 0,
                "le taux doit être positif (" + rate + ")");

        currencyDB.setExchangeRate(id, rate);
    }

    // OUTILS
    
    /**
     * Fixe la base de données sous-jacente aux devises.
     * @pre <pre>
     *     db != null </pre>
     * @post <pre>
     *     la base de données utilisée en interne est db </pre>
     */
    static void setDB(CurrencyDB db) {
        Contract.checkCondition(db != null);

        currencyDB = db;
    }
}
