import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class PageDeConnexion extends JFrame implements ActionListener {
	//tous ce qui sera ajouter a la premiere fenetre se trouve dans cette premiere partie en dehors du constructeur principal
	private static JLabel nomUtilisateurLabel;
	private static JLabel motDePasseLabel;
	private static JLabel succes;
	private static JTextField textUtilisateur;
	private static JPasswordField textMotDePasse;
	private static JButton bouton;

	PageDeConnexion() {
		//le constructeur de la premiere partie
		//Cette premiere parti du code sert a ouvrir un fenetre et lui donner des dimenssions
    	JPanel panel = new JPanel();
		
		
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(panel);
		
		
		//Le premier texte qui dit qu'il faut entrer un nom d'utilisateur
		nomUtilisateurLabel = new JLabel("Utilisateur:");
		nomUtilisateurLabel.setBounds(10, 20, 80, 25);
		panel.add(nomUtilisateurLabel);
		
		//Le bloc ou on peut entrer un text pour le nom d'utilisateur
		textUtilisateur = new JTextField(20);
		textUtilisateur.setBounds(120, 20, 165, 25);
		panel.add(textUtilisateur);
		
		//Le deuxieme texte qui dit qu'il faut un mot de passe
		motDePasseLabel = new JLabel("Mot de passe:");
		motDePasseLabel.setBounds(10, 50, 80, 25);
		panel.add(motDePasseLabel);
		
		//Le bloc ou on peut entrer un text pour le mot de passe
		textMotDePasse = new JPasswordField(20);
		textMotDePasse.setBounds(120, 50, 165, 25);
		panel.add(textMotDePasse);
		
		//Le bouton qui permet d'entrer dans l'application
		bouton = new JButton("Login");
		bouton.setBounds(10, 90, 80, 25);
		bouton.addActionListener(this);
		panel.add(bouton);
		
		//Le texte qui dirat si le mot de passe est juste ou non
		succes = new JLabel("");
		succes.setBounds(10, 110, 300, 25);
		panel.add(succes);
			
		
		setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    	//Ceci commence le code quand le bouton est appuyer
    	//Les deux strings vont aller chercher ce qu'il y avait ecrit dans les boites
    	String utilisateur = textUtilisateur.getText();
		String motDePasse = textMotDePasse.getText();
		
		
		if(utilisateur.equals("Tech") && motDePasse.equals("pauld")) {
			//ceci sert a determiner si le mot de pass est juste ou pas
			this.dispose();
            Hello hh = new Hello();
            hh.setVisible(true);
            succes.setText("Bienvenue!");
			
		} else {
			succes.setText("Le mot de passe ou l'utilisateur est invalide.");
		}
		
    }

    public static void main(String args[]) {
    	PageDeConnexion premierePage = new PageDeConnexion();
    }
}
