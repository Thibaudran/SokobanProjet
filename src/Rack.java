import java.util.Arrays;

// TODO (done) write comment
/**
 * A rack of one level of the Sokoban game.
 * 
 * @author Thibaut Audran
 *
 */
public class Rack 
{
	
	/**
	 * Value of the dimension of the rack.
	 */
	public final static int DIMENSION = 8;
	
	/**
	 * The rack of the sokoban level.
	 */
	private CaseType[][] rack;
	
	
	// TODO (done) fix comment (this is not the rack)
	/**
	 * Generate a rack of 64 cases, 8x8. It will be the default rack.
	 */
	public Rack()
	{
		// TODO think about it: rack is a local variable that is unusable outside the constructor
		int i, j;
		this.rack = new CaseType[DIMENSION][DIMENSION];
		for(i=0; i<DIMENSION; i++)
		{
			for(j=0; j<DIMENSION; j++)
			{
				this.rack[i][j] = CaseType.VOID;
			}			
		}
		
	}
	
	@Override
	public String toString()
	{
		return "Rack [rack=" + Arrays.toString(this.rack) + "]";
	}
}
