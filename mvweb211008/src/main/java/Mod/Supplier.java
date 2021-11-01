package Mod;

public class Supplier
{
	private int SUP_ID;
	private String SUP_NAME, STREET, CITY, STATE, ZIP;

	public Supplier()
	{
	}

	public Supplier(int sUP_ID, String sUP_NAME, String sTREET, String cITY, String sTATE, String zIP)
	{
		SUP_ID = sUP_ID;
		SUP_NAME = sUP_NAME;
		STREET = sTREET;
		CITY = cITY;
		STATE = sTATE;
		ZIP = zIP;
	}

	public int getSUP_ID()
	{
		return SUP_ID;
	}

	public void setSUP_ID(int sUP_ID)
	{
		SUP_ID = sUP_ID;
	}

	public String getSUP_NAME()
	{
		return SUP_NAME;
	}

	public void setSUP_NAME(String sUP_NAME)
	{
		SUP_NAME = sUP_NAME;
	}

	public String getSTREET()
	{
		return STREET;
	}

	public void setSTREET(String sTREET)
	{
		STREET = sTREET;
	}

	public String getCITY()
	{
		return CITY;
	}

	public void setCITY(String cITY)
	{
		CITY = cITY;
	}

	public String getSTATE()
	{
		return STATE;
	}

	public void setSTATE(String sTATE)
	{
		STATE = sTATE;
	}

	public String getZIP()
	{
		return ZIP;
	}

	public void setZIP(String zIP)
	{
		ZIP = zIP;
	}

}
