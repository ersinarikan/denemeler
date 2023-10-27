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
		System.out.println("Baþarý Notunuz : " + bNot);
		if (bNot >= 50)
			System.out.println("Geçtiniz");
		else 
			System.out.println("KAldýnýz");
		/*
		 * 0-29 arasý FF 30-39 DD 40-49 dc 50-59 CC 60-69 CB 70-79 BB 80-89 BA 90-100 AA
		 */
		if (bNot < 30)
			System.out.println("Kaldýn FF");
		// else if(bNot>=30 && bNot<40) System.out.println("Koþullau geçtin DD");
		else if (bNot < 40)
			System.out.println("Koþullu geçtin DD");
		else if (bNot < 50)
			System.out.println("Koþullu geçtin Dc");
		else if (bNot < 60)
			System.out.println("geçtin CC");
		else if (bNot < 70)
			System.out.println("geçtin CB");
		else if (bNot < 80)
			System.out.println("geçtin BB");
		else if (bNot < 90)
			System.out.println("geçtin BA");
		else
			System.out.println("geçtin AA");
		System.out.println("Bitti");
	}

}
