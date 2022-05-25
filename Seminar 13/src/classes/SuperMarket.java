package classes;

import java.util.ArrayList;

import exceptions.ExceptionMarket;

public class SuperMarket {
	private String name;
	private ArrayList<Market> markets;
	
	
	public SuperMarket(String name, ArrayList<Market> market) {
		super();
		this.name = name;
		this.markets = market;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Market> getMarket() {
		return markets;
	}


	public void setMarket(ArrayList<Market> market) {
		this.markets = market;
	}


	public String getBiggestMarketByArea(ETypeMarket type) throws ExceptionMarket
	{
		if(type==null)
			throw new ExceptionMarket();
		float areaMax= this.markets.get(0).getArea();
		String nameMarketMax=this.markets.get(0).getName();
		
		for(int i=0; i<this.markets.size(); i++)
			if(areaMax<this.markets.get(i).getArea() && this.markets.get(i).getTypeMarket()==type)
				{
					areaMax=this.markets.get(i).getArea();
					nameMarketMax=this.markets.get(i).getName();
				}
		return nameMarketMax;
	}
}
