package com.mike.beans;


/**
 * @author Mike
 *
 * This is one of the low level data structures - one of three
 * 		SpeakerSpecs   <- this one
 * 		SpeakerTS
 * 		mountingInfo
 * 
 * Those three are aggregated in the SpeakerDataBean class
 * 
 */
public class SpeakerSpecs
{
	float diameter_inch;
	int impendence_ohms;
	int powerRMS_watts;
	int powerPeak_watts;
	float sensitivity_db;
	float magWeight_oz;
	float vcDiameter_inch;
	
	

	public SpeakerSpecs(float diameter_inch, int impendence_ohms,
			int powerRMS_watts, int powerPeak_watts, float sensitivity_db,
			float magWeight_oz, float vcDiameter_inch)
	{
		super();
		this.diameter_inch = diameter_inch;
		this.impendence_ohms = impendence_ohms;
		this.powerRMS_watts = powerRMS_watts;
		this.powerPeak_watts = powerPeak_watts;
		this.sensitivity_db = sensitivity_db;
		this.magWeight_oz = magWeight_oz;
		this.vcDiameter_inch = vcDiameter_inch;
	}
	
	public SpeakerSpecs()
	{
		
	}

	public float getDiameter_inch()
	{
		return diameter_inch;
	}

	public void setDiameter_inch(float diameter_inch)
	{
		this.diameter_inch = diameter_inch;
	}

	public int getImpendence_ohms()
	{
		return impendence_ohms;
	}

	public void setImpendence_ohms(int impendence_ohms)
	{
		this.impendence_ohms = impendence_ohms;
	}

	public int getPowerRMS_watts()
	{
		return powerRMS_watts;
	}

	public void setPowerRMS_watts(int powerRMS_watts)
	{
		this.powerRMS_watts = powerRMS_watts;
	}

	public int getPowerPeak_watts()
	{
		return powerPeak_watts;
	}

	public void setPowerPeak_watts(int powerPeak_watts)
	{
		this.powerPeak_watts = powerPeak_watts;
	}

	public float getSensitivity_db()
	{
		return sensitivity_db;
	}

	public void setSensitivity_db(float sensitivity_db)
	{
		this.sensitivity_db = sensitivity_db;
	}

	public float getMagWeight_oz()
	{
		return magWeight_oz;
	}

	public void setMagWeight_oz(float magWeight_oz)
	{
		this.magWeight_oz = magWeight_oz;
	}

	public float getVcDiameter_inch()
	{
		return vcDiameter_inch;
	}

	public void setVcDiameter_inch(float vcDiameter_inch)
	{
		this.vcDiameter_inch = vcDiameter_inch;
	}

}
