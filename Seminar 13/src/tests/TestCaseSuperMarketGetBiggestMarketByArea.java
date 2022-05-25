package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.ETypeMarket;
import classes.Market;
import classes.SuperMarket;
import exceptions.ExceptionMarket;

public class TestCaseSuperMarketGetBiggestMarketByArea {

	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m1=new Market("Sephora", 20, ETypeMarket.BEAUTY);
		m2=new Market("Dougles", 29, ETypeMarket.BEAUTY);
		m3=new Market("H&M", 40, ETypeMarket.DRESS);
		m4=new Market("Mobexpert", 20, ETypeMarket.DECORATION);
		m5=new Market("Zara", 20, ETypeMarket.DRESS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRight() {
		ArrayList<Market> markets=new ArrayList<>();
		markets.add(m1);
		markets.add(m2);
		markets.add(m3);
		markets.add(m4);
		markets.add(m5);
		SuperMarket sm=new SuperMarket("Electroputere", markets);
		try {
			String result=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
//			if(result.equals("Douglas"))
//				assertTrue(true);
//			else assertTrue(false);
			assertEquals("H&M",result);
			
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Nu trebuia sa se arunce o exceptie");
		}
	}
	
	@Test
	public void testBounteries() {
		ArrayList<Market> markets=new ArrayList<>();
		markets.add(m1);
		
		SuperMarket sm=new SuperMarket("Electroputere", markets);
		try {
			String result=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			assertEquals("Sephora", result);
			
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			fail("st la limitele intervalului, nu trb exceptie");
		}
		
	}
	
	@Test(expected=ExceptionMarket.class)	//doresc sa mi se returneze o exceptie
	public void testException() throws ExceptionMarket {	//fara throw?
		SuperMarket sm=new SuperMarket("Electroputere", null);
		String result=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
	}
	
	@Test
	public void testPerformance() throws ExceptionMarket{
		ArrayList<Market> markets=new ArrayList<>();
		markets.add(m1);
		markets.add(m2);
		markets.add(m3);
		markets.add(m4);
		markets.add(m5);
		SuperMarket sm=new SuperMarket("Electroputere", markets);
		double startTime=System.currentTimeMillis();
		String result=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		double stopTime=System.currentTimeMillis();
		assertEquals(0.5, stopTime-startTime, "Testul ruleaza in mai putin de 0.5 ms");	//in versiunea 4 masajul se afla inainte
		assertTrue(stopTime-startTime<=10, "Testul ruleaza in sub 10 s");
	}
	
	public Market getLargestMarket(ETypeMarket type, ArrayList<Market>markets)
	{
		markets.sort(new Comparator<Market>() {

			@Override
			public int compare(Market o1, Market o2) {
				// TODO Auto-generated method stub
				if(o1.getArea()>o2.getArea())
					return 1;
				else return 0;
			}
			
		});
		for(int i=0; i<markets.size(); i++)
			if(type==markets.get(i).getTypeMarket())
				return markets.get(i);
		return null;
	}
	
	@Test
	public void testCrossCheck() throws ExceptionMarket {
		ArrayList<Market> markets=new ArrayList<>();
		markets.add(m1);
		markets.add(m2);
		markets.add(m3);
		markets.add(m4);
		markets.add(m5); 
		SuperMarket sm=new SuperMarket("Electroputere", markets);
		String actual=sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		Market expectedM=getLargestMarket(ETypeMarket.BEAUTY, markets);
		String expected =expectedM.getName();
		assertEquals("comp Crossckeck", expected, actual);
	}
	
//	@Test
//	pubic void testInverse() {
//		
//	}
}
