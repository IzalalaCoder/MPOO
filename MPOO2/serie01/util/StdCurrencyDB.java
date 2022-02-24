public class StdCurrencyDB implements CurrencyDB {
    // REQUETES
    /**
     * Le taux de change de la monnaie d'identificateur <code>id</code> par
     *  rapport à l'euro.
     * @pre <pre> id != null </pre>
     */
    public double getExchangeRate(CurrencyId id) {
        return id.rate;
    }

    /**
     * Le code ISO (chaîne de caractères) de la monnaie d'identificateur
     *  <code>id</code>.
     * @pre <pre> id != null </pre>
     */
    public String getIsoCode(CurrencyId id) {
        return id.
    }
    
    /**
     * Le pays dans lequel la monnaie d'identificateur <code>id</code> 
     *  a cours.
     * @pre <pre> id != null </pre>
     */
    String getCountry(CurrencyId id);
    
    /**
     * Le nom de la monnaie d'identificateur <code>id</code>.
     * @pre <pre> id != null </pre>
     */
    String getName(CurrencyId id);

    // COMMANDES
    /**
     * Fixe à <code>rate</code> le taux de change de la monnaie 
     *  d'identificateur <code>id</code>.
     * @pre <pre>
     *     id != null
     *     rate > 0 </pre>
     * @post <pre>
     *     getExchangeRate(id) == rate </pre>
     */
    void setExchangeRate(CurrencyId id, double rate);
}
