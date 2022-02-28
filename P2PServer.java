import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;

public class P2PServer extends Thread
{
    private DatagramSocket socket;
    private InetAddress IPAddress;
    private ArrayList<Peer> peerList;

    public void run()
    {
        try 
        {
            socket = new DatagramSocket(9876);
            byte[] incomingData = new byte[1024];

            while (true) 
            {
                DatagramPacket incomingPacket = new DatagramPacket(incomingData, 
                		incomingData.length);
                socket.receive(incomingPacket);
                InetAddress IPAddress = incomingPacket.getAddress();
                int port = incomingPacket.getPort();
            }
        } 
        catch (SocketException e) 
        {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

    }


 
   


    
}
