package nitizadatak;

public class Glavna {
	private static final String cilj = "dobar dan";
	public static void main(String... args)
	{
		String[] delovi = new String[2];
		delovi = cilj.split(" ");
		for(int i = 1; i < delovi.length; i++)
			delovi[i] = " " + delovi[i];
		System.out.println(delovi[0] + delovi[1]);
		
		StringComparer sc1 = new StringComparer(1, delovi[0]);
		StringComparer sc2 = new StringComparer(2, delovi[1]);
		
		sc1.start();
		sc2.start();
	}
}
