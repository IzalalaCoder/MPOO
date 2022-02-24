package serie01;

import util.TPTester;

public final class TP01Test {
    private TP01Test() {
        // rien
    }
    public static void main(String[] args) {
        TPTester t = new TPTester(
                serie01.util.StdCurrencyDBTest.class,
                serie01.model.StdMultiConverterTest.class
        );
        int exitValue = t.runAll();
        System.exit(exitValue);
    }
}
