package hafta4;

import java.util.Scanner;

public class AsalSayilariBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char devam = 'e';
		do {

			int sayi = 1;

			Scanner giris = new Scanner(System.in);
			System.out.println("Asal olup olmadığı tespit edilecek sayıyı giriniz.");
			sayi = giris.nextInt();
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					System.out.println("Sayı Asal Değildir.");
					break;
				} else
					System.out.println("Sayı Asaldır");
				break;
			}
			System.out.println("Devam etmek istiyormusun E/H");
			devam = giris.next().charAt(0);

		} while (devam == 'e' || devam == 'E');

	}

}
