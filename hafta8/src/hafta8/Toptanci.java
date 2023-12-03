package hafta8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Toptanci {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> bakliyatIsmi = new ArrayList<>();
		List<Integer> bakliyatAgirligi = new ArrayList<>();
		List<Byte> depoNumarasi = new ArrayList<>();
		byte secim;
		do {
			System.out.println("1.Depo Girişi\n2.Listele\n3.Satış\n4.Çıkış");
			secim = giris.nextByte();
			switch (secim) {
			case 1:
				System.out.println("Bakliyat Seçimini Yapınız");
				System.out.println("1.Mercimek\n2.Fasulye\n3.Nohut\n4.Pirinç\5.Çıkış");
				byte kayitGiris = 0;
				do {
					switch (kayitGiris) {
					case 1:

						bakliyatIsmi.add("Mercimek".toString());
						System.out.println("Kaç KG :");
						bakliyatAgirligi.add(giris.nextInt());
						System.out.println("Kaç numaralı Depoya Girecek 1 veya 2 :");
						depoNumarasi.add(giris.nextByte());
						System.out.println(bakliyatIsmi);
						System.out.println(bakliyatAgirligi);
						System.out.println(depoNumarasi);
						
						break;
					case 2:

						break;
					case 3:

						break;
					case 4:

						break;
					case 5:
						System.out.println("Program Bitti");
						System.exit(0);

						break;

					default:System.out.println("Yanlış Seçim Yaptınız");
						break;
					}

				} while (kayitGiris != 5);

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.println("Program Bitti");
				System.exit(0);

				break;

			default:
				System.out.println("Yanlış Seçim Yaptınız");
				break;
			}

		} while (secim != 4);

	}

}
