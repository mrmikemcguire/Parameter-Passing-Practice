
public class Team
	{
    private Player[] roster; 
    private int teamSize;    
	
    public Team()
    	{
        roster = new Player[20];
        teamSize = 0;            
    	}

    public void addPlayer(Player player)
    	{
        if (teamSize < roster.length)
        	{
            roster[teamSize] = player; 
            teamSize++;                
        	}
    	}

    public String toString()
    	{
        String teamRoster = "\tTeam Roster\n\n";
        
        //Testing retrieval
	    //System.out.println(roster[1].getAvgPoints());

        for (int i = 0; i < teamSize; i++)
        	{
            teamRoster = teamRoster + roster[i].toString() + "\n";                            
        	}
        return teamRoster;                  
   	    }
	}
	

