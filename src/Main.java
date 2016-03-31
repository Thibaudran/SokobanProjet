
/**
 * Application that launches a Sokoban game
 * 
 * @author Thibaut & Audran
 * 
 */

public class Main
{
	
	 /**
	 * Value of the empty hut.
	 */
	public final static int VOID = -1;
	/**
	 * Application's main
	 * new SokobanGame().play();
	 * @param args
	 *            command-line arguments (unused)
	 */
	public static void main(String[] args)
	{
		int rack[][]= new int[8][8];
		int i, j;
		for(i=0; i<8; i++)
		{
			for(j=0; j<8; j++)
			{
				rack[i][j] = VOID;
				System.out.println(rack[i][j]);
			}
		}
	}	
	
}