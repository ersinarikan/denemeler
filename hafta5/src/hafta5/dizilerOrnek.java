package hafta5;

import java.util.Scanner;

public class dizilerOrnek {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		System.out.println("Kişi Sayısını giriniz");
		byte kisi = giris.nextByte();
		String ad[] = new String[kisi];
		char cinsiyet[] = new char[kisi];
		int maas[] = new int[kisi];
		byte yas[] = new byte[kisi];
		for (int i = 0; i < kisi; i++) {
			System.out.println("İsim Giriniz : ");
			ad[i] = giris.next();
			System.out.println("Cinsiyeti Giriniz (E/K) : ");
			cinsiyet[i] = giris.next().charAt(0);
			System.out.println("Maas Giriniz : ");
			maas[i] = giris.nextInt();
			System.out.println("Yas Giriniz : ");
			yas[i] = giris.nextByte();
		}
		char devam = 'E';
		do {
			byte menu = 0;
			System.out.println(" 1.Listeleme\n 2.İsim arama \n 3.Maas Ortalama");
			System.out.println(" 4.Yas Ortalama\n 5.En Yüksek Maaş \n 6.En Düşük Maaş");
			System.out.println(" 7.En Yüksek Yaş (e) \n 8.En Küçük Yaş (e) \n 9.Ortalama Yaş (k) ");
			menu = giris.nextByte();

			switch (menu) {
			case 1:
				for (int j = 0; j < kisi; j++) // değişkeni i yazınca yinelenen değişken diyor ama diğer case lerde j ye
												// izin veriyor
				{
					if (cinsiyet[j] == 'E' || cinsiyet[j] == 'e')
						System.out.println("Erkek");
					if (cinsiyet[j] == 'K' || cinsiyet[j] == 'k')
						System.out.println("Kadın");
					System.out.println("İsim : " + ad[j]);
					System.out.println("Maas : " + maas[j]);
					System.out.println("Yas  : " + yas[j]);
					System.out.println("-------------------------------------");
				}
				break;
			case 2:
				System.out.println("Aranacak Adı Giriniz");
				String adiBul = giris.next();
				for (int j = 0; j < kisi; j++) {
					if (ad[j].equalsIgnoreCase(adiBul)) {
						if (cinsiyet[j] == 'E' || cinsiyet[j] == 'e')
							System.out.println("Erkek");
						if (cinsiyet[j] == 'K' || cinsiyet[j] == 'k')
							System.out.println("Kadın");
						System.out.println("Adı : " + ad[j]);
						System.out.println("Yas : " + yas[j]);
						System.out.println("Maas  : " + maas[j]);
						System.out.println("-------------------------------------");
					}
				}
				break;
			case 3:
				int toplam = 0;
				for (int j = 0; j < kisi; j++) {
					toplam = toplam + maas[j];
				}
				System.out.println("Ortalama Maas  : " + toplam / kisi);
				break;
			case 4:
				int toplamyas = 0;
				for (int j = 0; j < kisi; j++) {
					toplamyas = toplamyas + yas[j];
				}
				System.out.println("Ortalama Yaş  : " + toplamyas / kisi);
				break;
			case 5:
				int ebm = maas[0];
				String ebmk = "";
				for (int j = 0; j < kisi; j++) {
					if (maas[j] > ebm) {
						ebm = maas[j];
						ebmk = ad[j];
					}
				}
				System.out.println("En Çok Maaş " + ebm + " ile syn " + ebmk + "'nindir");
				break;
			case 6:
				int ekm = maas[0];
				String ekmk = "";
				for (int j = 0; j < kisi; j++) {
					if (maas[j] < ekm) {
						ekm = maas[j];
						ekmk = ad[j];
					System.out.println(ad[j]);
					System.out.println(ekmk);
					}
				}
				System.out.println("En Az Maaş " + ekm + " ile syn " + ekmk + "'nindir");
				break;
			case 7:
				int eyye =yas[0];
				String geyye = "";
				for (int j = 0; j < kisi; j++) {
					if (cinsiyet[j] == 'E' || cinsiyet[j] == 'e') {
						if (yas[j] > eyye ) {
							eyye = yas[j];
							geyye = ad[j];
						}
					}
				}
				System.out.println("En Yüksek Erkek yaşı " + eyye + " ile syn " + geyye + "'nindir");
				break;
			case 8:
				int ekye = yas[0];
				String gekye = "";
				for (int j = 0; j < kisi; j++) {
					if (cinsiyet[j] == 'E' || cinsiyet[j] == 'e') {
						if (yas[j] < ekye) {
							ekye = yas[j];
							gekye = ad[j];
						}
					}
				}
				System.out.println("En Küçük Erkek yaşı " + ekye + " ile syn " + gekye + "'nindir");
				break;
			case 9:
				int toplamYask = 0;
				byte sayac = 0;
				for (int j = 0; j < kisi; j++) {
					if (cinsiyet[j] == 'K' || cinsiyet[j] == 'k') {
						toplamYask = toplamYask + yas[j];
						sayac = (byte) (sayac + 1);
					}
				}
				System.out.println("Kadınların Yaş Ortalaması : " + (toplamYask / sayac));
				break;
			default:
				System.out.println("Yanlış menü seçimi");
				break;
			}
			System.out.println("Devam Etmek İstiyormusunuz? (E/H)");
			devam = giris.next().charAt(0);
		} while (devam == 'E' || devam == 'e');
		System.out.println("Program Bitti");
	}

}
