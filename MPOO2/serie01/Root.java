package serie01;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import serie01.gui.Converter;
import serie01.util.DBFactory;

public final class Root {
    
    private static State state;

    private Root() {
        // rien ici
    }
    
    private static void initDBType() {
        state = State.INIT;
        while (state != State.DB_OK && state != State.CANCEL) {
            DBTypes selection = (DBTypes) JOptionPane.showInputDialog(
                    null,
                    "Choisissez la source des données :",
                    "Création de la base de données",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    DBTypes.values(),
                    DBTypes.INTERNAL);
            if (selection != null) {
                try {
                    selection.createDB();
                    state = State.DB_OK;
                } catch (Exception e) {
                    dbCreationError(e.getMessage());
                    state = State.DB_ERROR;
                }
            } else {
                state = State.CANCEL;
            }
        }
    }
    
    private static void dbCreationError(String msg) {
        JOptionPane.showMessageDialog(
                null,
                "Message d'erreur : " + msg,
                "Erreur lors de la création de la base de données",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    private enum DBTypes {
        INTERNAL("Tableau mémoire") {
            @Override void createDB() {
                DBFactory.createInternalDB();
            }
        },
        LOCAL("Fichier local") {
            @Override void createDB() throws Exception {
                JFileChooser jfc = new JFileChooser();
                int returnVal = jfc.showOpenDialog(null);
                if (returnVal != JFileChooser.APPROVE_OPTION) {
                    throw new Exception("Action annulée par l'utilisateur !");
                }
                File f = jfc.getSelectedFile();
                DBFactory.createLocalDB(f);
            }
        },
        REMOTE("SGBD distant") {
            @Override void createDB() throws Exception {
                String data = (String) JOptionPane.showInputDialog(
                        null,
                        "Données de connexion :",
                        "Tentative de connexion à la base de données",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        "hostname|dbname|login|pwd");
                if (data == null) {
                    throw new Exception("Action annulée par l'utilisateur !");
                }
                String[] parts = data.split("|");
                DBFactory.createRemoteDB(parts);
            }
        };
        
        private final String name;
        DBTypes(String name) {
            this.name = name;
        }
        
        @Override public String toString() {
            return name;
        }
        
        abstract void createDB() throws Exception;
    }
    
    private enum State {
        INIT, DB_OK, DB_ERROR, CANCEL;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initDBType();
                if (state == State.DB_OK) {
                    new Converter(5).display();
                } else {
                    System.out.println("Pas de BD, pas de jouet !");
                }
            }
        });
    }
}
