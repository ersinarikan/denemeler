package hafta2;

import java.util.Scanner;

public class kdvHesaplama {

	public static void main(String[] args) {
		char faturaTipi;
		float faturaTutari;
		float kdvTutari;
		Scanner giris = new Scanner(System.in);
		do {
			System.out.print("Girişi yapılacak fatura türünü seçin Gıda için (G), Elektronik için (E), Çıkış için (Q)");
			faturaTipi = giris.next().charAt(0);
			System.out.println("Fatura tutarını giriniz : ");
			faturaTutari = giris.nextFloat();
			kdvTutari = (faturaTipi == 'G' || faturaTipi == 'g') ? faturaTutari * 118 / 100 : faturaTutari * 108 / 100;
			System.out.println("kdvli tutar= " + kdvTutari + " TL");
		} while (faturaTipi == 'g' || faturaTipi == 'G' || faturaTipi == 'E' || faturaTipi == 'e');
		System.out.println("Program bitti");
	}

}
