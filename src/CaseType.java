/**
 * Represents all the constants of the Sokoban project
 * @author Thibaut Audran
 *
 */
public enum CaseType
{
		 /**
		 * Value of the empty hut.
		 */
		VOID(-1),
		
		 /**
		 * Value of the hut representing a wall, which is impossible to move.
		 */
		WALL(1),
		
		 /**
		 * Value of the hut representing a box, which can be moved.
		 */
		BOX(4),
		
		 /**
		 * Value of the hut representing the target area.
		 */
		AREA(0),
		
		/**
		 * Value of the hut representing a box on a target area.
		 */
		BOXINPLACE(7);
		
		// TODO add javadoc comment
		private int value;

		// TODO finish writing javadoc comment
		/**
		 * @param value
		 */
		private CaseType(int value) 
		{
	        this.value = value;
	    }
}
