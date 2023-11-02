package hafta3;

import java.util.Scanner;

public class Maas {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String ad;
		int maas;
		byte cocukSayisi;
		String mDurum;
		char kontrol = 'e';
		do {
			System.out.println("�sim giriniz : ");
			ad = giris.next();
			System.out.println("MAa� giriniz : ");
			maas = giris.nextInt();
			System.out.println("�ocuk say�s� giriniz : ");
			cocukSayisi = giris.nextByte();
			if (cocukSayisi >= 3)
				cocukSayisi = 3;
			maas = maas + cocukSayisi * 250;

			System.out.println("MEdeni durumu giriniz : ");
			mDurum = giris.next();
			if (mDurum.equalsIgnoreCase("evli"))
				maas += 500;
			System.out.println(ad + " maa��n " + maas + " TL dir.");
			System.out.println("devam edecekmisiniz (e/h)");
			kontrol = giris.next().charAt(0);
		} while (kontrol == 'e' || kontrol=='E');
		System.out.println("Bitti");
	}
}
