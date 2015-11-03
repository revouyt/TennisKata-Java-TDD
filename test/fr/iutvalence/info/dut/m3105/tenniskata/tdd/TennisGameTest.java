package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TennisGameTest
{
	
	@Test
	public void beginOfTheMatch()
	{
		TennisGame tennisGame = new TennisGame("",0,0);
		TennisGame.updateScoreOfTheMatch(tennisGame);
		assertEquals(tennisGame.scoreOfTheMatch, "love-all");
	}
	
	@Test
	public void serverScoreAPoint()
	{
		TennisGame tennisGame = new TennisGame("",1,0);
		TennisGame.updateScoreOfTheMatch(tennisGame);
		assertEquals(tennisGame.scoreOfTheMatch, "fifteen-love");
	}
	
	
}
