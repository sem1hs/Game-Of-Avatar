
public class Soru2 {

	public static void main(String[] args) {
		
		Avatar Kullanici1 = new Avatar();
		Avatar Kullanici2 = new Avatar();
		
		/**
		 * @param Kullanici1Puan
		 * @param Kullanici2Puan
		 */
		int Kullanici1Puan = 0;
		int Kullanici2Puan = 0;
		
		/**
		 * show class objects
		 */
		System.out.println("Kullanıcı 1 Avatarları \n---------------------------\n");
		Kullanici1.AvatarUret();
		Kullanici1.AvatarGoster();
		
		/**
		 * show class objects
		 */
		System.out.println("\nKullanıcı 2 Avatarları \n---------------------------\n");
		Kullanici2.AvatarUret();
		Kullanici2.AvatarGoster();
		
		/**
		 * check
		 */
		for(int i=0;i<5;i++)
		{
			if(Kullanici1.getTür(i) != Kullanici2.getTür(i))
			{
				int Temp = (Kullanici1.getTür(i) > Kullanici2.getTür(i)) ? (Kullanici1Puan+=10) : (Kullanici2Puan+=10);
			}
			else {
				int Temp = (Kullanici1.getGüc(i)>Kullanici2.getGüc(i)) ? (Kullanici1Puan+=(Kullanici1.getGüc(i)-Kullanici2.getGüc(i))) :
					 (Kullanici2Puan+=(Kullanici2.getGüc(i)-Kullanici1.getGüc(i)));
			}
		}
		System.out.println("\n\nKullanıcı 1 Puan : " + Kullanici1Puan + " Kullanıcı 2 Puan : " + Kullanici2Puan);
		
		/**
		 * winner
		 */
		if(Kullanici1Puan != Kullanici2Puan)
		{
			String Temp = (Kullanici1Puan>Kullanici2Puan) ? "Kullanıcı 1 Kazandı ! \n" : "Kullanıcı 2 Kazandı ! \n";
			System.out.println("\n" + Temp);
		}
		else {
			System.out.println("\nBerabere ! \n");
		}
	}	
}
