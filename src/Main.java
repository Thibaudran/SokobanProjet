import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Application that launches a Sokoban game
 * 
 * @author Thibaut Audran
 * 
 */
public class Main
{

	
	/**
	 * Application's main
	 * new SokobanGame().play();
	 * @param args
	 *        command-line arguments (unused)
	 */
	public static void main(String[] args)
	{
		new SokobanGame().play();
		/*
		int[][] rack= new int[8][8];
		int i, j;
		for(i=0; i<8; i++)
		{
			for(j=0; j<8; j++)
			{
				rack[i][j] = VOID;
				System.out.println(rack[i][j]);
			}
		}
		
	    JLabel text = new JLabel();
	    text.setText("Sokoban");
	    
	    JFrame fenetre = new JFrame();
	    fenetre.setTitle("Sokoban");
	    fenetre.setSize(1000, 600);
	    fenetre.getContentPane().add(text);
		fenetre.setLocationRelativeTo(null);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setVisible(true);
		 */	    
	    
	}
}