package hafta2;

import java.util.Scanner;

public class kared {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int k1;
		int k2;
		System.out.print("İlk kenar boyunu giriniz : ");
		k1 = giris.nextByte();
		System.out.print("ikinci kenar boyunu giriniz : ");
		k2 = giris.nextByte();
		if (k1 == k2) {
			System.out.println("Bu bir Karedir");
			System.out.println("Bu karenin Çevresini hesaplamak için (C) Alanını hesaplamak için (A) giriniz : ");
			char k = giris.next().charAt(0);
			int cevre = (2 * (k1 + k2));
			if (k == 'C' || k=='c' ) {
				System.out.println("Bu karenin çevresi = " + cevre);
			} else if (k == 'A'|| k=='a') {
				int alan = (k1 * k2);
				System.out.println("Bu karenin alanı = " + alan);
			}

		} else {
			System.out.println("Bu bir dikdörtgendir");
			System.out.println("Bu Dikdörtgenin Çevresini hesaplamak için (C) Alanını hesaplamak için (A) giriniz ");
			char d = giris.next().charAt(0);
			if (d == 'C'|| d=='c') {
				int cevred = 2 * (k1 + k2);
				System.out.println("Bu dikdörgenin Çevresi = " + cevred);
			} else if (d == 'A' || d=='a') {
				int aland = k1 * k2;
				System.out.println("Bu dikdörgenin Alanı = " + aland);
			}
		}

	}
}
