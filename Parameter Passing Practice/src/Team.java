
public class Team
	{
    private Player[] roster; // array for roster
    private int teamSize;    // number of players in roster
	
    public Team()
    	{
        roster = new Player[20]; // create array
        teamSize = 0;            // initialize team size
    	}
		
//    public Team(int arraySize)
//    	{
//        roster = new Player[arraySize]; // create array
//        teamSize = 0;            // initialize team size
//    	}
    
    public void addPlayer(Player player)
    	{
        if (teamSize < roster.length)
        	{
            roster[teamSize] = player; // add player to roster
            teamSize++;                // increment team size
        	}
    	}
    
    public String toString()
    	{
        String teamRoster = "\tTeam Roster\n\n"; // output String
        for (int i = 0; i < teamSize; i++)
        	{
            teamRoster = teamRoster + roster[i].toString() + "\n"; 
            i++;                             
        	}
        return teamRoster;                    // return roster
   	    }
	}
	

