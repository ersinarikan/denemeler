package hafta5;

import java.util.Scanner;

public class turkcell {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Kişi sayısı girin");
		byte kisi = giris.nextByte();
		int dk[] = new int[kisi];
		int sms[] = new int[kisi];
		int internet[] = new int[kisi];
		int fatura[] = new int[kisi];
		String ad[] = new String[kisi];
		for (int i = 0; i < kisi; i++) {
			System.out.println("İsim Giriniz : ");
			ad[i] = giris.next();
			System.out.println("Dakika Giriniz : ");
			dk[i] = giris.nextInt();
			System.out.println("SMS miktarını giriniz : ");
			sms[i] = giris.nextInt();
			System.out.println("Internet GB miktarını giriniz : ");
			internet[i] = giris.nextInt();
			fatura[i] = (int) (dk[i] * 0.5 + sms[i] * 0.4 + internet[i] * 25);

		}
		byte menu = 0;
		for (;;) {
			System.out.println(" 1.Listeleme\n 2.İsim arama \n 3.Fatura ortalama");
			System.out.println(" 4.ENB Fatura\n 5.ENK Fatura \n 6.Çıkış");
			menu = giris.nextByte();
			switch (menu) {
			case 1:
				for (int i = 0; i < kisi; i++) {
					System.out.println("Adınız : " + ad[i]);
					System.out.println("Kullanılan DK : " + dk[i]);
					System.out.println("Kullanılan SMS : " + sms[i]);
					System.out.println("Kullanılan Internet  : " + internet[i]);
					System.out.println("Ödenecek Fatura : " + fatura[i]);
					System.out.println("-------------------------------------");

				}
				break;
			case 2:
				System.out.println("Aranacak Adı Giriniz");
				String arananAd = giris.next();
				for (int i = 0; i < kisi; i++) {
					if (ad[i].equalsIgnoreCase(arananAd)) {
						System.out.println("Adınız : " + ad[i]);
						System.out.println("Kullanılan DK : " + dk[i]);
						System.out.println("Kullanılan SMS : " + sms[i]);
						System.out.println("Kullanılan Internet  : " + internet[i]);
						System.out.println("Ödenecek Fatura : " + fatura[i]);
						System.out.println("-------------------------------------");
					}
				}
				break;
			case 3:
				int toplam = 0;
				for (int bedel : fatura) {
					toplam += bedel;
				}
				System.out.println("Fatura Ortalaması : " + (toplam / kisi));
				break;
			case 4:
				int enbFatura = fatura[0];
				for (int i = 1; i < kisi; i++) {
					if (fatura[i] > enbFatura)	enbFatura = fatura[i];
				}
				System.out.println("En büyük Fatura : " + enbFatura);
				for (int i = 0; i < kisi; i++) {
					if (fatura[i] == enbFatura) {
						System.out.println("Adınız : " + ad[i]);
						System.out.println("Kullanılan DK : " + dk[i]);
						System.out.println("Kullanılan SMS : " + sms[i]);
						System.out.println("Kullanılan Internet  : " + internet[i]);
						System.out.println("Ödenecek Fatura : " + fatura[i]);
						System.out.println("-------------------------------------");
					}
				}
				break;

			case 5:
				int enkFatura = fatura[0];
				for (int i = 1; i < kisi; i++) {
					if (fatura[i] < enkFatura) enkFatura = fatura[i];
				}
				System.out.println("En küçük Fatura : " + enkFatura);
				for (int i = 0; i < kisi; i++) {
					if (fatura[i] == enkFatura) {
						System.out.println("Adınız : " + ad[i]);
						System.out.println("Kullanılan DK : " + dk[i]);
						System.out.println("Kullanılan SMS : " + sms[i]);
						System.out.println("Kullanılan Internet  : " + internet[i]);
						System.out.println("Ödenecek Fatura : " + fatura[i]);
						System.out.println("-------------------------------------");
					}
				}
				
				break;
			case 6:
				System.out.println("Program Bitti");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlış Menü Seçimi");
				break;
			}
		} // Sonsuz döngü

	}

}
