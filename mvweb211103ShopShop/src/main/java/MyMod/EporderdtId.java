package MyMod;
// Generated 2021�~11��18�� �U��2:07:16 by Hibernate Tools 5.5.7.Final

/**
 * EporderdtId generated by hbm2java
 */
public class EporderdtId implements java.io.Serializable
{

	private int oid;
	private int pid;

	public EporderdtId()
	{
	}

	public EporderdtId(int oid, int pid)
	{
		this.oid = oid;
		this.pid = pid;
	}

	public int getOid()
	{
		return this.oid;
	}

	public void setOid(int oid)
	{
		this.oid = oid;
	}

	public int getPid()
	{
		return this.pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EporderdtId))
			return false;
		EporderdtId castOther = (EporderdtId) other;

		return (this.getOid() == castOther.getOid())
				&& (this.getPid() == castOther.getPid());
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getOid();
		result = 37 * result + this.getPid();
		return result;
	}

}
