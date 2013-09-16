package me.deager4.switchboardclient.thread;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;

/**
 * Handles all packets after they are received b the listener thread
 * @author deager4
 * @since alpha 0.1
 */
public class MainThread extends Thread
{
	
	/**
	 * An {@link ArrayList}<{@link DatagramPacket}>. Ensures that all packets are processed, without clogging up the listener thread
	 * @note all packets are handled in the order that they are received
	 */
	private ArrayList<DatagramPacket> packetPool;
	
	/**
	 * The thread run controller for the Main Thread. If True, thread runs, if False, terminates thread
	 **/
	private boolean isRunning;
	
	
	/**
	 * I need to think about how I am going to handle this...
	 */
	private InetAddress currentChatPartner;
	
	/**
	 * Main thread for the client
	 */
	public MainThread()
	{
		super("main thread");
	}
	
	public void run()
	{
		isRunning = true;
		while(isRunning)
		{
			if(packetPool.size() != 0)
			{
				DatagramPacket packet = packetPool.get(0);
				if()
			}
		}
	}
	
	
	/**
	 * Public getter for {@link MainThread#packetPool}
	 * @return {@link ArrayList}<{@link DatagramPacket}>
	 */
	public ArrayList<DatagramPacket> getPacketPool()
	{
		return this.packetPool;
	}
	
	/**
	 * Terminates thread activity by setting {@link MainThread#isRunning} to FALSE
	 */
	public void terminate()
	{
		this.isRunning = false;
	}
}
