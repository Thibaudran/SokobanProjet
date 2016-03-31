/**
 * Represents a Sokoban game. Link to the rules of the game :
 * https://en.wikipedia.org/wiki/Sokoban
 * 
 * @author Thibaut & Audran
 */

public class SokobanGame
{ 
	 /**
	 * Value of the empty hut.
	 */
	public final static int VOID = -1;
	 /**
	 * Value of the hut representing a wall, which is impossible to move.
	 */
	public final static int WALLS = 8;
	 /**
	 * Value of the hut representing a box, which can be moved.
	 */
	public final static int BOX = 0;
	 /**
	 * Value of the hut representing the target area.
	 */
	public final static int AREA = 1;
	 /**
	 * Value of the hut representing the player, who move to move boxes.
	 */
	public final static int PLAYER = 3;
	/**
	 * Value of the hut representing a box on a target area.
	 */
	public final static int BOXINPLACE= 2;
	
	/**
	 * 
	 */
	public int rack[][] = new int[8][8];
	
	/**
	 * Represents the Sokoban game, ready to be played. Ready to be played : the
	 * rack is generated, boxes are placed randomly around the rack and the
	 * character is created and placed randomly.
	 */
	public SokobanGame()
	{
		int i, j;
		for(i=0; i<8; i++)
		{
			for(j=0; j<8; j++)
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
	 

	public void play()
	{

	}
*/
}
