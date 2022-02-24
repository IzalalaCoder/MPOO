package serie01.util;

import java.io.File;
import java.io.IOException;

import util.Contract;

public final class DBFactory {
    private DBFactory() {
       // rien 
    }
    
    public static void createInternalDB() {
        Currency.setDB(new StdCurrencyDB());
    }
    
    public static void createLocalDB(File f) throws IOException {
        Contract.checkCondition(f != null);

        throw new UnsupportedOperationException("Type non implémenté !");
    }
    
    public static void createRemoteDB(String... data) throws Exception {
        throw new UnsupportedOperationException("Type non implémenté !");
    }
}
