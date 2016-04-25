/**
 * Represents a Sokoban game. Link to the rules of the game :
 * https://en.wikipedia.org/wiki/Sokoban
 * 
 * @author Thibaut Audran
 */
public class SokobanGame
{
	
	/**
	 * The rack of the sokoban level.
	 */
	public int[][] rack;
	
	/**
	 * Represents the Sokoban game, ready to be played. Ready to be played : the
	 * rack is generated, boxes are placed randomly around the rack and the
	 * character is created and placed randomly.
	 */
	public SokobanGame()
	{
		int i, j;
		int[][] this.rack[DIMENSION][DIMENSION];
		for(i=0; i<DIMENSION; i++)
		{
			for(j=0; j<DIMENSION; j++)
			{
				this.rack[i][j] = VOID;
			}
		}
		
		
		
		/*
		 * create table of 64 cases, 8x8. Define the field, placing boxes and
		 * walls (=> to define the difficulty) and even targets area and
		 * character's site
		 * 
		 * use the rack define in the class Rack
		 * 
		 * this.box1 = new box(); this.box2 = new box(); this.box3 = new box();
		 * this.character = new character();
		 */
	

	}

/*  // detail comment (main algorithm)
	/**
	 * Method to play the game. It represents the progress of the game, from the
	 * beginning to the end.
	 
*/
	/**
	 * Plays the game
	 * ...
	 * 
	 */
	public void play()
	{

	}

}
