package com.mike.beans;

public class SpeakerMount
{
	float driverDisplacmentVolume;		// liters
	float overallDiameter;				// inches
	float baffleHoleDiameter;			// inches
	float mountHoleDiameter;			// inches
	float depth;						// inches
	float netweight;					// lbs
	public SpeakerMount(float driverDisplacmentVolume, float overallDiameter,
			float baffleHoleDiameter, float mountHoleDiameter, float depth,
			float netweight)
	{
		super();
		this.driverDisplacmentVolume = driverDisplacmentVolume;
		this.overallDiameter = overallDiameter;
		this.baffleHoleDiameter = baffleHoleDiameter;
		this.mountHoleDiameter = mountHoleDiameter;
		this.depth = depth;
		this.netweight = netweight;
	}
	public float getDriverDisplacmentVolume()
	{
		return driverDisplacmentVolume;
	}
	public void setDriverDisplacmentVolume(float driverDisplacmentVolume)
	{
		this.driverDisplacmentVolume = driverDisplacmentVolume;
	}
	public float getOverallDiameter()
	{
		return overallDiameter;
	}
	public void setOverallDiameter(float overallDiameter)
	{
		this.overallDiameter = overallDiameter;
	}
	public float getBaffleHoleDiameter()
	{
		return baffleHoleDiameter;
	}
	public void setBaffleHoleDiameter(float baffleHoleDiameter)
	{
		this.baffleHoleDiameter = baffleHoleDiameter;
	}
	public float getMountHoleDiameter()
	{
		return mountHoleDiameter;
	}
	public void setMountHoleDiameter(float mountHoleDiameter)
	{
		this.mountHoleDiameter = mountHoleDiameter;
	}
	public float getDepth()
	{
		return depth;
	}
	public void setDepth(float depth)
	{
		this.depth = depth;
	}
	public float getNetweight()
	{
		return netweight;
	}
	public void setNetweight(float netweight)
	{
		this.netweight = netweight;
	}
	
	

}
