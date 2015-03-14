package com.mike.beans;

public class SpeakerTS
{
	int fs;		//Resonant Freq (HZ)
	float re;   // DC Resistance (ohms)
	float le;	// Coil Inductance
	float qms;	// Mechanical Q
	float vas; 	// Compliance Equivalent Volume (Liters)
	float vd;	// Peak Diaphragm Displacement Volume (liters)
	float cms;	// Mechanical Compliance of Suspension (mm/N
	float bl;	// BL Product
	float mms;	// Diaphragm Mass Inc. Airload (grams)
	float ebs;	// Efficiency Bandwidth Product (EBP)
	float xmax;	// Maximum Linear Excursion (mm)
	float sd;	// Surface Area of Cone (sq cm)
	float xlim;	// Maximum Mechanical Limit (mm)
	public SpeakerTS(int fs, float re, float le, float qms, float vas,
			float vd, float cms, float bl, float mms, float ebs, float xmax,
			float sd, float xlim)
	{
		super();
		this.fs = fs;
		this.re = re;
		this.le = le;
		this.qms = qms;
		this.vas = vas;
		this.vd = vd;
		this.cms = cms;
		this.bl = bl;
		this.mms = mms;
		this.ebs = ebs;
		this.xmax = xmax;
		this.sd = sd;
		this.xlim = xlim;
	}
	public int getFs()
	{
		return fs;
	}
	public void setFs(int fs)
	{
		this.fs = fs;
	}
	public float getRe()
	{
		return re;
	}
	public void setRe(float re)
	{
		this.re = re;
	}
	public float getLe()
	{
		return le;
	}
	public void setLe(float le)
	{
		this.le = le;
	}
	public float getQms()
	{
		return qms;
	}
	public void setQms(float qms)
	{
		this.qms = qms;
	}
	public float getVas()
	{
		return vas;
	}
	public void setVas(float vas)
	{
		this.vas = vas;
	}
	public float getVd()
	{
		return vd;
	}
	public void setVd(float vd)
	{
		this.vd = vd;
	}
	public float getCms()
	{
		return cms;
	}
	public void setCms(float cms)
	{
		this.cms = cms;
	}
	public float getBl()
	{
		return bl;
	}
	public void setBl(float bl)
	{
		this.bl = bl;
	}
	public float getMms()
	{
		return mms;
	}
	public void setMms(float mms)
	{
		this.mms = mms;
	}
	public float getEbs()
	{
		return ebs;
	}
	public void setEbs(float ebs)
	{
		this.ebs = ebs;
	}
	public float getXmax()
	{
		return xmax;
	}
	public void setXmax(float xmax)
	{
		this.xmax = xmax;
	}
	public float getSd()
	{
		return sd;
	}
	public void setSd(float sd)
	{
		this.sd = sd;
	}
	public float getXlim()
	{
		return xlim;
	}
	public void setXlim(float xlim)
	{
		this.xlim = xlim;
	}
	

}
