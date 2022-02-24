package serie01.util;

/**
 * Base de données concernant les monnaies du monde.
 * Cette BdD est complète (à ma connaissance, au 31/12/2001) et provient de
 *  plusieurs documents trouvés sur le Ouèbe :
 * <ul>
 * <li>Codes ISO : http://www.oanda.com/site/help/iso_code.shtml</li>
 * <li>Taux de change donné au BULLETIN OFFICIEL DES IMPÔTS, DIRECTION
 *  GÉNÉRALE DES IMPÔTS, 5 F-14-02, N° 62 du 29 MARS 2002 :
 *  http://www11.minefi.gouv.fr/boi/boi2002/5fppub/textes/5f1402/5f1402.htm</li>
 * </ul>
 * <p>
 * <i>Nota : des informations plus précises sont disponibles sur wikipedia
 *  (http://fr.wikipedia.org/wiki/Codes_des_monnaies).</i>
 * </p>
 */
public enum CurrencyId {
    AED(3.23105, "Dirham", "Emirats arabes unis"),
    AFA(4158.2, "Afghani", "Afghanistan"),
    ALL(121.808, "Lek", "Albanie"),
    AMD(494.879, "Dram", "Arménie"),
    ANG(1.56587, "Florin des Antilles néerlandaises",
            "Antilles néerlandaises"),
    AON(27.514, "Nouveau Kwanza", "Angola"),
    ARS(1.38805, "Peso argentin", "Argentine"),
    ATS(13.7603, "Schilling", "Autriche"),
    AUD(1.728, "Dollar australien", "Australie et Océanie"),
    AWG(1.56587, "Florin d'Aruba", "Aruba"),
    AZM(4200.17, "Manat azerbaïdjanais", "Azerbaïdjan"),
    BAM(1.93926, "Mark convertible", "Bosnie-Herzégovine"),
    BBD(1.7552, "Dollar de la Barbade", "Barbade"),
    BDT(50.3686, "Taka", "Bangladesch"),
    BEF(40.3399, "Franc belge", "Belgique"),
    BGL(1.9463, "Lev", "Bulgarie"),
    BHD(0.33167, "Dinar bahreïni", "Bahreïn"),
    BIF(748.173, "Franc du Burundi", "Burundi"),
    BMD(0.8813, "Dollar des Bermudes", "Bermudes"),
    BND(1.62609, "Dollar de Brunei", "Brunei Darussalam"),
    BOB(5.99144, "Boliviano", "Bolivie"),
    BRL(2.04246, "Réal", "Brésil"),
    BSD(0.8813, "Dollar des Bahamas", "Bahamas"),
    BTN(42.4679, "Ngultrum", "Bhoutan"),
    BWP(6.08858, "Pula", "Botswana"),
    BYB(1390.08, "Rouble biélorusse", "Biélorussie (Belarus)"),
    BZD(1.7596, "Dollar de Belize", "Belize"),
    CAD(1.4077, "Dollar canadien", "Canada"),
    CDF(280.096, "Franc congolais", "Congo, République démocratique"),
    CHF(1.4829, "Franc suisse", "Suisse, Liechtenstein"),
    CLP(574.312, "Peso chilien", "Chili"),
    CNY(7.28114, "Renminbi Yuan", "Chine"),
    COP(2060.26, "Peso colombien", "Colombie"),
    CRC(300.022, "Colon", "Costa Rica"),
    CUP(0.8813, "Peso cubain", "Cuba"),
    CVE(105.309, "Escudo du Cap-Vert", "Cap-Vert"),
    CYP(0.57504, "Livre cypriote", "Chypre"),
    CZK(31.962, "Couronne tchèque", "République tchèque"),
    DEM(1.95583, "Mark allemand", "Allemagne"),
    DJF(149.443, "Franc de Djibouti", "Djibouti"),
    DKK(7.4365, "Couronne danoise", "Danemark, Féroé, Groenland"),
    DOP(14.2731, "Peso dominicain", "République dominicaine"),
    DZD(67.9294, "Dinar algérien", "Algérie"),
    ECS(0.8813, "Sucre", "Equateur"),
    EEK(15.6466, "Couronne estonienne", "Estonie"),
    EGP(4.02903, "Livre égyptienne", "Egypte"),
    ERN(8.35909, "Nafka", "Erythrée"),
    ESP(166.386, "Peseta", "Espagne, Andorre"),
    ETB(7.43786, "Birr", "Ethiopie"),
    EUR(1.0, "Euro", "UEM (dès le 1.1.1999)"),
    FIM(5.94573, "Mark finlandais", "Finlande"),
    FJD(2.0293, "Dollar fidjien", "Fidji"),
    FKP(0.4039, "Livre des îles Falkland",
            "Îles Malouines (Falkland)"),
    FRF(6.55957, "Franc français",
            "France, Andorre, Monaco, France d'outre-mer"),
    GBP(0.6085, "Livre sterling", "Grande-Bretagne"),
    GEL(1.82098, "Lari", "Géorgie"),
    GHC(6509.78, "Cedi", "Ghana"),
    GIP(0.6085, "Livre de Gibraltar", "Gibraltar"),
    GMD(15.1748, "Dalasi", "Gambie"),
    GNF(1731.6, "Franc guinéen", "Guinée"),
    GRD(340.75, "Drachme", "Grèce"),
    GTQ(6.9411, "Quetzal", "Guatemala"),
    GYD(158.786, "Dollar de Guyana", "Guyana"),
    HKD(6.8723, "Dollar de Hong-Kong", "Hong-Kong, Zone administrative"),
    HNL(13.9001, "Lempira", "Honduras"),
    HRK(7.28761, "Kuna", "Croatie"),
    HTG(23.0385, "Gourde", "Haïti"),
    HUF(245.18, "Forint", "Hongrie"),
    IDR(9214.86, "Rupiah", "Indonésie"),
    IEP(0.787564, "Livre irlandaise", "Irlande"),
    ILS(3.8698, "Nouveau shekel", "Israël"),
    INR(42.4631, "Roupie indienne", "Inde"),
    IQD(0.27667, "Dinar irakien", "Irak"),
    IRR(1541.67, "Rial", "Iran, République islamique"),
    ISK(91.48, "Couronne islandaise", "Islande"),
    ITL(1936.27, "Lire", "Italie, Saint-Marin, Vatican"),
    JMD(42.3576, "Dollar de la Jamaïque", "Jamaïque"),
    JOD(0.62353, "Dinar jordanien", "Jordanie"),
    JPY(115.33, "Yen", "Japon"),
    KES(68.9685, "Shilling du Kenya", "Kenya"),
    KGS(42.2124, "Som du Kirghizistan", "Kirghizistan"),
    KHR(3387.23, "Riel", "Cambodge"),
    KMF(491.96775, "Franc comorien", "Comores"),
    KPW(1161.55, "Won (Corée du sud)",
            "Corée, République populaire démocratique"),
    KRW(1.93534, "Won (Corée du nord)", "Corée, République"),
    KWD(0.27033, "Dinar koweïtien", "Koweït"),
    KYD(0.70551, "Dollar des îles Caïmans", "Îles Caïmans"),
    KZT(132.131, "Tenge", "Kazakhstan"),
    LAK(6680.53, "Kip", "Laos"),
    LBP(1330.99, "Livre libanaise", "Liban"),
    LKR(81.8121, "Roupie de Sri-Lanka", "Sri Lanka (Ceylan)"),
    LRD(39.6585, "Dollar libérien", "Libéria"),
    LSL(10.5168, "Loti", "Lesotho"),
    LTL(3.5228, "Litas", "Lituanie"),
    LUF(40.3399, "Franc luxembourgeois", "Luxembourg"),
    LVL(0.5563, "Lats", "Lettonie"),
    LYD(0.56398, "Dinar libyen", "Libye, Jamahirija arabe populaire"),
    MAD(10.223, "Dirham", "Maroc"),
    MDL(11.5179, "Leu de Moldavie", "Moldavie, République"),
    MGF(5682.86, "Franc malgache", "Madagascar"),
    MKD(60.109, "Denar", "Macédoine"),
    MMK(5.71805, "Kyat", "Myanmar (Birmanie)"),
    MNT(967.67, "Tughrik", "Mongolie"),
    MOP(7.06509, "Pataca", "Macao"),
    MRO(232.241, "Ouguiya", "Mauritanie"),
    MTL(0.3994, "Livre maltaise", "Malte"),
    MUR(26.6637, "Roupie mauricienne", "Maurice"),
    MVR(10.3541, "Rufiyaa", "Maldives"),
    MWK(58.5264, "Kwacha du Malawi", "Malawi"),
    MXN(8.04059, "Peso mexicain", "Mexique"),
    MYR(3.34286, "Ringgit", "Malaysia"),
    MZM(19353.4, "Metical", "Mozambique"),
    NAD(10.5168, "Dollar namibien", "Namibie"),
    NGN(102.925, "Naira", "Nigeria"),
    NIO(12.1047, "Cordoba", "Nicaragua"),
    NLG(2.20371, "Florin", "Pays-Bas"),
    NOK(7.9515, "Couronne norvégienne", "Norvège, Svalbard"),
    NPR(66.9276, "Roupie népalaise", "Népal"),
    NZD(2.1215, "Dollar néo-zélandais", "Nouvelle-Zélande, Océanie"),
    OMR(0.32858, "Riyal omanais", "Oman"),
    PAB(0.8813, "Balboa", "Panama"),
    PEN(3.02837, "Nouveau sol", "Pérou"),
    PGK(3.27026, "Kina", "Papouasie-Nouvelle-Guinée"),
    PHP(45.5245, "Peso philippin", "Philippines"),
    PKR(52.826, "Roupie pakistanaise", "Pakistan"),
    PLN(3.4953, "Zloty", "Pologne"),
    PTE(200.482, "Escudo", "Portugal"),
    PYG(4077.41, "Guarani", "Paraguay"),
    QAR(3.20176, "Riyal qatari", "Qatar"),
    ROL(27817.0, "Leu", "Roumanie"),
    RUB(26.8352, "Rouble", "Fédération de Russie"),
    RWF(396.384, "Franc rwandais", "Rwanda"),
    SAR(3.29923, "Riyal saoudien", "Arabie Saoudite"),
    SBD(4.95324, "Dollar des îles Salomon", "Salomon"),
    SCR(5.04948, "Roupie seychelloise", "Seychelles"),
    SDD(226.444, "Dinar soudanais", "Soudan"),
    SEK(9.3012, "Couronne suédoise", "Suède"),
    SGD(1.6306, "Dollar de Singapour", "Singapour"),
    SHP(0.6085, "Livre de Sainte-Hélène", "Sainte-Hélène"),
    SIT(218.8364, "Tolar", "Slovénie"),
    SKK(42.78, "Couronne slovaque", "Slovaquie"),
    SLL(1737.41, "Leone", "Sierra Leone"),
    SOS(2293.29, "Shilling somali", "Somalie"),
    SRG(1921.09, "Guinée du Surinam", "Surinam"),
    STD(7822.73, "Dobra", "Sao Tomé et Principe"),
    SVC(7.69737, "Colon", "Salvador"),
    SYP(43.0754, "Livre syrienne", "Syrie"),
    SZL(10.5168, "Lilangeni", "Swaziland"),
    THB(38.8915, "Baht", "Thaïlande"),
    TJR(2.24323, "Somoni", "Tadjikistan"),
    TMM(4574.44, "Manat du Turkménistan", "Turkménistan"),
    TND(1.29479, "Dinar tunisien", "Tunisie"),
    TOP(1.92408, "Pa'anga", "Tonga"),
    TRL(1269500.0, "Livre turque", "Turquie"),
    TTD(5.38376, "Dollar de Trinidad et Tobago", "Trinidad et Tobago"),
    TWD(30.8335, "Nouveau dollar de Taiwan", "Chine (Taiwan)"),
    TZS(806.245, "Shilling tanzanien", "Tanzanie"),
    UAH(4.65643, "Grivna", "Ukraine"),
    UGX(1521.88, "Schilling ougandais", "Ouganda"),
    USD(0.8813, "Dollar US",
            "Etats-Unis, Îles Marshall, Panama, Porto Rico"),
    UYU(12.2243, "Peso uruguayen", "Uruguay"),
    UZS(604.266, "Sum", "Ouzbékistan"),
    VEB(671.739, "Bolivar", "Vénézuela"),
    VND(13249.6, "Dong", "Viêtnam"),
    VUV(129.58, "Vatu", "Vanuatu"),
    WST(3.13954, "Tala", "Samoa-Occidentales"),
    XAF(655.957, "Franc CFA BEAC",
            "Guinée équatoriale, Gabon, Cameroun, Congo (Brazzaville),"
            + " Tchad, République centrafricaine"),
    XCD(2.37519, "Dollar des Caraïbes de l'Est",
            "Anguilla, Antigua-et-Barbuda, Dominique, Grenade, Montserrat,"
            + " Saint-Kitts-et-Nevis, Sainte-Lucie,"
            + " Saint-Vincent-et-les Grenadines"),
    XOF(655.957, "Franc CFA BCEAO",
            "Bénin, Burkina Faso, Côte-d'Ivoire, Guinée-Bissau, Mali,"
            + " Niger, Sénégal, Togo"),
    XPF(119.3317422, "Franc CFP",
            "Polynésie française, Nouvelle-Calédonie, Wallis-et-Futuna"),
    YER(149.461, "Riyal yéménite", "Yémen"),
    YUM(58.1103, "Nouveau dinar yougoslave",
            "Yougoslavie (Serbie - Monténégro)"),
    ZAR(10.4302, "Rand", "Afrique du Sud, Lesotho, Namibie"),
    ZMK(3551.79, "Kwacha", "Zambie"),
    ZRN(280.096, "Franc congolais", "Congo, République démocratique"),
    ZWD(48.3835, "Dollar de Zimbabwe", "Zimbabwe");

    private final double rate;
    private final String denomination;
    private final String location;
    
    CurrencyId(double rate, String denomination, String countries) {
        this.rate = rate;
        this.denomination = denomination;
        this.location = countries;
    }

    double rateForYear2001() {
        return rate;
    }

    String isoCode() {
        return name();
    }

    String denomination() {
        return denomination;
    }

    String location() {
        return location;
    }
}
