import java.util.*;

public class Avatar {
	private Random rnd = new Random();
	private int[] Güc = new int[5];
	private int[] Tür = new int[5];
	private String[] Karakter = new String[5];
	/**
	 * 
	 * @return random number
	 */
	private int GücUret()
	{
		return rnd.nextInt(2,11);
	}
	/**
	 * 
	 * @return random number
	 */
	private int TürUret()
	{
		return rnd.nextInt(2);
	}
	/**
	 * @param make variables
	 */
	public void AvatarUret()
	{
		for(int i=0;i<5;i++)
		{
			Güc[i] = GücUret();
			Tür[i] = TürUret();
		}
	}
	/**
	 * show variables
	 */
	public void AvatarGoster()
	{
		String Temp;
		for(int i=0;i<5;i++)
		{
			Temp = (Tür[i]>0) ? "Savaşçı" : "Çiftçi";
			Karakter[i] = Temp + " " + String.valueOf(Güc[i]); 
			System.out.println(Karakter[i]);
		}
	}
	/*
	 * @return variables
	 */
	public int getGüc(int i)
	{
		return Güc[i];
	}
	/*
	 * @return variables
	 */
	public int getTür(int i)
	{
		return Tür[i];
	}
}
