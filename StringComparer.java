package nitizadatak;

import java.util.Random;

public class StringComparer extends Thread {
	private static final int PONAVLJANJE = 10000;
	
	private int polovina;
	private String mojString;
	private String praviString;
	
	public String toString() { return mojString; }
	
	public StringComparer(int polovina, String cilj)
	{
		this.polovina = polovina;
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		for(int i = 0; i < cilj.length(); i++)
		{
			sb.append((char)(r.nextInt(26) + 'a'));
		}
		this.mojString = sb.toString();
		this.praviString = cilj;
		
	}
	
	public void run()
	{
		Random r = new Random();
		StringBuilder sb = new StringBuilder(mojString);
		for(int i = 0; i < PONAVLJANJE; i++)
		{
			int index = (int)(Math.random() * (double)mojString.length());
			//System.out.println(index);
			char character = (char)(r.nextInt(26) + 'a');
			if( Math.abs((int)character - (int)praviString.charAt(index)) < 
					Math.abs((int)praviString.charAt(index) - (int)mojString.charAt(index)) )
					{
						sb.setCharAt(index, character);
					}
			this.mojString = sb.toString();
			System.out.println(this.mojString);
		}
	}
}
