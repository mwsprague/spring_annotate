package com.mike.beans;

public class SpeakerMaterial
{
	public enum Coil { ALUMINUM, COPPER};
	public enum Magnet {FERRITE, NEO};
	public enum Basket {DIECASTALUMINUM, STAMPEDSTEEL};
	
	Coil coil;
	Magnet magnet;
	Basket basket;
	public SpeakerMaterial(Coil coil, Magnet magnet, Basket basket)
	{
		super();
		this.coil = coil;
		this.magnet = magnet;
		this.basket = basket;
	}
	public Coil getCoil()
	{
		return coil;
	}
	public void setCoil(Coil coil)
	{
		this.coil = coil;
	}
	public Magnet getMagnet()
	{
		return magnet;
	}
	public void setMagnet(Magnet magnet)
	{
		this.magnet = magnet;
	}
	public Basket getBasket()
	{
		return basket;
	}
	public void setBasket(Basket basket)
	{
		this.basket = basket;
	}
	@Override
	public String toString()
	{
		return "SpeakerMaterial [coil=" + coil + ", magnet=" + magnet
				+ ", basket=" + basket + "]";
	}
	
	

}
