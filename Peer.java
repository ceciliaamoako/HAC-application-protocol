public class Peer
{
    private int IPAddress;
    private boolean active;

    public Peer(int IPAddress)
    {
        this.IPAddress = IPAddress;
    }

    public int getIPAddress()
    {
        return IPAddress;
    }

    public boolean isAlive()
	{
		return active;
	}

}