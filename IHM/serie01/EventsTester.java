import javax.swing.*;
import java.awt.event.*;

public class EventsTester implements ActionListener {
	// ATTRIBUTS
	private JFrame mainFrame;
	private JFrame testFrame;
	private JButton btnNewTestFrame;
	
	// CONSTRUCTEUR 
	public EventsTester() {
		this.mainFrame = new JFrame("Tests sur les evenements - Zone d'AFFICHAGE");
		
		// LES DIFFERENTS MODES 
			// - DO_NOTHING_ON_CLOSE ---- aucune action
			// - HIDE_ON_CLOSE ---- mode par défaut
			// - DISPOSE_ON_CLOSE ---- fermer l'interface et le programme associé
			// - EXIT_ON_CLOSE ---- recommander pour un projet ou plusieurs fenetre est affichée
		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.btnNewTestFrame = new JButton("Nouvelle fenetre");
		this.testFrame = null;
		this.mainFrame.add(this.btnNewTestFrame);	
		this.btnNewTestFrame.addActionListener(this);

		
	}
	
	// METHODES COMMANDES

	// Fonction démarrant l'application
	public void start() {
		this.mainFrame.pack();

		this.mainFrame.setVisible(true);
	}
	
	// Crée une nouvelle fenetre qui a pour titre Zone de texte
	public void createNewTestFrame() {
		if (this.testFrame != null) {
			this.testFrame.setVisible(false);
			this.testFrame.dispose();
			this.testFrame = null;
		}
		this.testFrame = new JFrame("Zone de test");
		this.testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.testFrame.setSize(200, 100);
		//this.testFrame.pack();
		this.testFrame.setVisible(true);
	}
	
	// Fonction qui cible si une action a eu lieu sur le bouton
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("Nouvelle fenetre")) {
			createNewTestFrame();
			//System.exit(0);
		}
	}
	
	// FONCTION PRINCIPALE
	public static void main(String[] args) {
		EventsTester e = new EventsTester();	
		e.start();
	}
}
