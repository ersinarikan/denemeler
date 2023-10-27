package hafta2;

import java.util.Scanner;
//test//

public class HesapMakinasi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Birinci say�");
		float s1 = giris.nextFloat();
		System.out.println("�kinci say�");
		float s2 = giris.nextFloat();
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
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
			System.out.println("yanl�� i�lem se�imi");
		}
		/*
		 * if (menu == 1) System.out.println(s1 + " + " + s2 + " = " + (s1 + s2)); else
		 * if (menu == 2) System.out.println(s1 + " - " + s2 + " = " + (s1 - s2)); else
		 * if (menu == 3) System.out.println(s1 + " * " + s2 + " = " + (s1 * s2)); else
		 * if (menu == 4) System.out.println(s1 + " / " + s2 + " = " + (s1 / s2)); else
		 * System.out.println("yanl�� i�lem se�imi");
		 */
	}

}
