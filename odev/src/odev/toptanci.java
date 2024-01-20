package odev;

import java.util.Scanner;

public class toptanci {

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("""
					Yapmak Istediginiz Islemi Seciniz.
					1. Depoya Urun Girisi
					2. Depodan Urun Cikisi
					3. Depo Raporlari
					4. Programdan Çıkış""");

			int sec = scanner.nextInt();

			if (sec == 1) {
				System.out.println("""
						Depoya Giris Yapmak Istediniz Urunu Seciniz.
						1. Mercimek Girisi
						2. Pirinc Girisi
						3. Nohut Girisi
						4. Fasulye Girisi""");

				int giris = scanner.nextInt();

				System.out.println("""
						1. 10 KG'lık Cuval Girişi
						2. 50 KG'lık Cuval Girisi
						3. 100 KG'lık Cuval Girisi""");

				int giriskg = scanner.nextInt();

				String bakliyat_ismi = "";
				int kg = 0;

				switch (giris) {
				case 1:
					bakliyat_ismi = "Mercimek";
					break;
				case 2:
					bakliyat_ismi = "Pirinc";
					break;
				case 3:
					bakliyat_ismi = "Nohut";
					break;
				case 4:
					bakliyat_ismi = "Fasulye";
					break;
				}

				switch (giriskg) {
				case 1:
					kg = 10;
					break;
				case 2:
					kg = 50;
					break;
				case 3:
					kg = 100;
					break;
				}

				System.out.println("Kaç numaralı depoya giris yapılacak 1/2");
				int depo_numarasi = scanner.nextByte();
				if (depo_numarasi > 2) {
					System.out.println(depo_numarasi + " numaralı depo mevcut değil");
					System.exit(0);
				}
				System.out.println("Kaç adet çuval girecek");
				int toplam=0;
				int adet = scanner.nextByte();
				toplam =adet*kg;
				toptancifonk.giris(bakliyat_ismi, depo_numarasi, adet, kg, toplam);
			} else if (sec == 2) {
				System.out.println("""
						Depodan Cikis Yapmak Istediniz Urunu Seciniz.
						1. Mercimek Cikisi
						2. Pirinc Cikisi
						3. Nohut Cikisi
						4. Fasulye Cikisi""");

				int giris = scanner.nextInt();

				System.out.println("""
						1. 10 KG'lık Cuval Cikisi
						2. 50 KG'lık Cuval Cikisi
						3. 100 KG'lık Cuval Cikisi""");

				int giriskg = scanner.nextInt();

				String bakliyat_ismi = "";
				int kg = 0;

				switch (giris) {
				case 1:
					bakliyat_ismi = "Mercimek";
					break;
				case 2:
					bakliyat_ismi = "Pirinc";
					break;
				case 3:
					bakliyat_ismi = "Nohut";
					break;
				case 4:
					bakliyat_ismi = "Fasulye";
					break;
				}

				switch (giriskg) {
				case 1:
					kg = -10;
					break;
				case 2:
					kg = -50;
					break;
				case 3:
					kg = -100;
					break;
				}
				System.out.println("Kaç numaralı depodan cikis yapılacak 1/2");
				int depo_numarasi = scanner.nextByte();
				if (depo_numarasi > 2) {
					System.out.println(depo_numarasi + " numaralı depo mevcut değil");
					System.exit(0);
				}
				System.out.println("Kaç adet çuval cikisi yapılacak");
				int adet = scanner.nextByte();
				int toplam=0;
				toplam=adet*kg;
				toptancifonk.kontrol(bakliyat_ismi, depo_numarasi, -adet, kg, toplam);
			} else if (sec == 3) {
				System.out.println("""
						1. Toplam Depo Raporu
						2. Depolara Göre Detay Bakliyat Raporu
						3. Çıkış""");

				int rapor = scanner.nextInt();

				if (rapor == 1) {
					toptancifonk.rapor1();
				} else if (rapor == 2) {
					toptancifonk.rapor2();
				} else {
					System.out.println("Yanlış Seçim Yaptınız");
				}
			} else if (sec == 4) {
				System.out.println("Programdan çıkılıyor");
				System.exit(0);
			} else {
				System.out.println("Yanlış İşlem Seçimi");
			}
		}
	}

}
