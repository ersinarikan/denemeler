package hafta2;

import java.util.Scanner;

public class HesapMakinasi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Birinci sayý");
		float s1 = giris.nextFloat();
		System.out.println("Ýkinci sayý");
		float s2 = giris.nextFloat();
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		byte menu = giris.nextByte();
		switch (menu) {
		case 1:
			//System.out.println(s1 + " + " + s2 + " = " + (s1 + s2));
			//break;
		case 2:
			System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
			break;
		case 3:
			System.out.println(s1 + " * " + s2 + " = " + (s1 * s2));
			break;
		case 4:
			System.out.println(s1 + " / " + s2 + " = " + (s1 / s2));
			break;
		default:
			System.out.println("yanlýþ iþlem seçimi");
		}
		/*
		 * if (menu == 1) System.out.println(s1 + " + " + s2 + " = " + (s1 + s2)); else
		 * if (menu == 2) System.out.println(s1 + " - " + s2 + " = " + (s1 - s2)); else
		 * if (menu == 3) System.out.println(s1 + " * " + s2 + " = " + (s1 * s2)); else
		 * if (menu == 4) System.out.println(s1 + " / " + s2 + " = " + (s1 / s2)); else
		 * System.out.println("yanlýþ iþlem seçimi");
		 */
	}

}
