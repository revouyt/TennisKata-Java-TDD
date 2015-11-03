package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private int numberOfPointsOfPlayer1;
	private int numberOfPointsOfPlayer2;
	public String scoreOfTheMatch;
	
	public TennisGame (String scoreOfTheMatch, int numberOfPointsOfPlayer1, int numberOfPointsOfPlayer2)
	{
		this.getScorePlayer1(numberOfPointsOfPlayer1);
		this.getScorePlayer2(numberOfPointsOfPlayer2);
	}
	
	public int getScorePlayer1(int numberOfPointsOfPlayer1)
	{
		return this.numberOfPointsOfPlayer1;
	}
	
	public int getScorePlayer2(int numberOfPointsOfPlayer2)
	{
		return this.numberOfPointsOfPlayer2;
	}
	
	public String GetScoreOfMatch (int numberOfPointsOfPlayer1, int numberOfPointsOfPlayer2)
	{
		return this.scoreOfTheMatch;
	}
	
	public void setScoreOfTheMatch(String scoreOfTheMatch)
	{
		this.scoreOfTheMatch = scoreOfTheMatch;
	}
	
	public static void updateScoreOfTheMatch(TennisGame tennisGame)
	{
		if (tennisGame.numberOfPointsOfPlayer1==1 && tennisGame.numberOfPointsOfPlayer2==0)
		{
			tennisGame.scoreOfTheMatch="fifteen-love";
		}
		else if (tennisGame.numberOfPointsOfPlayer1==0 && tennisGame.numberOfPointsOfPlayer2==0)
		{
			tennisGame.scoreOfTheMatch="love-all";
		}
	}

}
