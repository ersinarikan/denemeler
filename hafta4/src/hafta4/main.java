package hafta4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Java Sayıların Toplamını Yapan Program
		int sayi1, sayi2, sonuc = 0;
		char secim, tekrar;
		secim = '+';
		do {
			Scanner giris = new Scanner(System.in);
			System.out.println("ilk sayıyı giriniz ");
			sayi1 = giris.nextInt();
			System.out.println("Operatörü giriniz (+, -, /, *)");
			secim = giris.next().charAt(0);
			System.out.println("İkinci Sayıyı giriniz");
			sayi2 = giris.nextInt();
			if (secim == '+')
				sonuc = sayi1 + sayi2;
			else if (secim == '-')
				sonuc = sayi1 - sayi2;
			else if (secim == '/')
				sonuc = sayi1 / sayi2;
			else if (secim == '*')
				sonuc = sayi1 * sayi2;
			else
				System.out.println("yanlış bir seçim yaptınız");
			System.out.println("İşleminizin Sonucu = " + sonuc);
			System.out.println("Tekrar İşlem Yapmak İstiyormusunuz E/H");
			tekrar = giris.next().charAt(0);

		} while (tekrar == 'E' || tekrar == 'e');
	}
}
