package hafta2;

import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Vize Notu giriniz : ");
		byte vNot = giris.nextByte();
		System.out.print("Final Botu giriniz : ");
		byte fNot = giris.nextByte();
		byte bNot = (byte) ((vNot + fNot) / 2);
		System.out.println("Ba�ar� Notunuz : " + bNot);
		if (bNot >= 50)
			System.out.println("Ge�tiniz");
		else 
			System.out.println("KAld�n�z");
		/*
		 * 0-29 aras� FF 30-39 DD 40-49 dc 50-59 CC 60-69 CB 70-79 BB 80-89 BA 90-100 AA
		 */
		if (bNot < 30)
			System.out.println("Kald�n FF");
		// else if(bNot>=30 && bNot<40) System.out.println("Ko�ullau ge�tin DD");
		else if (bNot < 40)
			System.out.println("Ko�ullu ge�tin DD");
		else if (bNot < 50)
			System.out.println("Ko�ullu ge�tin Dc");
		else if (bNot < 60)
			System.out.println("ge�tin CC");
		else if (bNot < 70)
			System.out.println("ge�tin CB");
		else if (bNot < 80)
			System.out.println("ge�tin BB");
		else if (bNot < 90)
			System.out.println("ge�tin BA");
		else
			System.out.println("ge�tin AA");
		System.out.println("Bitti");
	}

}
