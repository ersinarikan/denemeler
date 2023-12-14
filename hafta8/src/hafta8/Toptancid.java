package hafta8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Toptancid {

	public static void main(String[] args) {

		List<Integer> Mercimek = new ArrayList<>();
		List<Integer> Nohut = new ArrayList<>();
		List<Integer> Pirinc = new ArrayList<>();

		Scanner giris = new Scanner(System.in);

		char devam = 'E';
		do {

			System.out.println("1.Depo Giriş\n2.Satış\n3.Rapor");
			byte anaSecim = giris.nextByte();
			switch (anaSecim) {
			case 1: // Depo Giriş
				System.out.println("1.Mercimek\n2.Nohut\n3.Pirinc");
				byte bakliyatEkle = giris.nextByte();
				switch (bakliyatEkle) {
				case 1: // Mercimek Ekle
					System.out.println("1.5 KG\n2.10 KG\n3.50 KG");
					byte bakliyatKiloEkle = giris.nextByte();
					if (bakliyatKiloEkle == 1) {
						Mercimek.add(5);

					} else if (bakliyatKiloEkle == 2) {
						Mercimek.add(10);
					} else if (bakliyatKiloEkle == 3) {
						Mercimek.add(50);
					} else {
						System.out.println("Yanlış Seçim yaptınız");
					}
					break;
				case 2: // Nohut Ekle
					System.out.println("1.5 KG\n2.10 KG\n3.50 KG");
					bakliyatKiloEkle = giris.nextByte();
					if (bakliyatKiloEkle == 1) {
						Nohut.add(5);

					} else if (bakliyatKiloEkle == 2) {
						Nohut.add(10);
					} else if (bakliyatKiloEkle == 3) {
						Nohut.add(50);
					} else {
						System.out.println("Yanlış Seçim yaptınız");
					}
					break;

				case 3: // Pirinç Ekle
					System.out.println("1.5 KG\n2.10 KG\n3.50 KG");
					bakliyatKiloEkle = giris.nextByte();
					if (bakliyatKiloEkle == 1) {
						Pirinc.add(5);

					} else if (bakliyatKiloEkle == 2) {
						Pirinc.add(10);
					} else if (bakliyatKiloEkle == 3) {
						Pirinc.add(50);
					} else {
						System.out.println("Yanlış Seçim yaptınız");
					}
					break;
				default:
					System.out.println("Yanlış Seçim yaptınız");
					break;
				}

				break;
			case 2: // Depo Çıkış
				System.out.println("1.Mercimek\n2.Nohut\n3.Pirinc");

				byte bakliyatCikis = giris.nextByte();
				switch (bakliyatCikis) {
				case 1: // Mercimek Cikar
					System.out.println("1.5 KG\n2.10 KG\n3.50 KG");
					byte bakliyatKiloCikis = giris.nextByte();
					if (bakliyatKiloCikis == 1) {
						int toplamMercimek = 0;
						for (int i = 0; i < Mercimek.size(); i++) {
							toplamMercimek = Mercimek.get(i) + toplamMercimek;
						}
						if (toplamMercimek >= 5) {
							Mercimek.add(-5);
						} else {
							System.out.println("Depoda yeterli Mercimek yok");
							System.exit(0);
						}

					} else if (bakliyatKiloCikis == 2) {
						int toplamMercimek = 0;
						for (int i = 0; i < Mercimek.size(); i++) {
							toplamMercimek = Mercimek.get(i) + toplamMercimek;
						}
						if (toplamMercimek >= 10) {
							Mercimek.add(-10);
						} else {
							System.out.println("Depoda yeterli Mercimek yok");
							System.exit(0);
						}
					} else if (bakliyatKiloCikis == 3) {
						int toplamMercimek = 0;
						for (int i = 0; i < Mercimek.size(); i++) {
							toplamMercimek = Mercimek.get(i) + toplamMercimek;
						}
						if (toplamMercimek >= 50) {
							Mercimek.add(-50);
						} else {
							System.out.println("Depoda yeterli Mercimek yok");
							System.exit(0);
						}
					} else {
						System.out.println("Yanlış Seçim yaptınız");
					}
					break;
				case 2: // Nohut Cikis
					System.out.println("1.5 KG\n2.10 KG\n3.50 KG");
					bakliyatKiloCikis = giris.nextByte();
					if (bakliyatKiloCikis == 1) {
						int toplamNohut = 0;
						for (int i = 0; i < Nohut.size(); i++) {
							toplamNohut = Nohut.get(i) + toplamNohut;
						}
						if (toplamNohut >= 5) {
							Nohut.add(-5);
						} else {
							System.out.println("Depoda yeterli Nohut yok");
							System.exit(0);
						}

					} else if (bakliyatKiloCikis == 2) {
						int toplamNohut = 0;
						for (int i = 0; i < Nohut.size(); i++) {
							toplamNohut = Nohut.get(i) + toplamNohut;
						}
						if (toplamNohut >= 10) {
							Nohut.add(-10);
						} else {
							System.out.println("Depoda yeterli Nohut yok");
							System.exit(0);
						}
					} else if (bakliyatKiloCikis == 3) {
						int toplamNohut = 0;
						for (int i = 0; i < Nohut.size(); i++) {
							toplamNohut = Nohut.get(i) + toplamNohut;
						}
						if (toplamNohut >= 50) {
							Nohut.add(-50);
						} else {
							System.out.println("Depoda yeterli Nohut yok");
							System.exit(0);
						}
					} else {
						System.out.println("Yanlış Seçim yaptınız");
					}
					break;

				case 3: // Pirinç Cıkış
					System.out.println("1.5 KG\n2.10 KG\n3.50 KG");
					bakliyatKiloCikis = giris.nextByte();
					if (bakliyatKiloCikis == 1) {
						int toplamPirinc = 0;
						for (int i = 0; i < Pirinc.size(); i++) {
							toplamPirinc = Nohut.get(i) + toplamPirinc;
						}
						if (toplamPirinc >= 5) {
							Pirinc.add(-5);
						} else {
							System.out.println("Depoda yeterli Pirinc yok");
							System.exit(0);
						}

					} else if (bakliyatKiloCikis == 2) {
						int toplamPirinc = 0;
						for (int i = 0; i < Pirinc.size(); i++) {
							toplamPirinc = Nohut.get(i) + toplamPirinc;
						}
						if (toplamPirinc >= 10) {
							Pirinc.add(-10);
						} else {
							System.out.println("Depoda yeterli Pirinc yok");
							System.exit(0);
						}
					} else if (bakliyatKiloCikis == 3) {
						int toplamPirinc = 0;
						for (int i = 0; i < Pirinc.size(); i++) {
							toplamPirinc = Nohut.get(i) + toplamPirinc;
						}
						if (toplamPirinc >= 50) {
							Pirinc.add(-50);
						} else {
							System.out.println("Depoda yeterli Pirinc yok");
							System.exit(0);
						}
					} else {
						System.out.println("Yanlış Seçim yaptınız");
					}
					break;
				default:
					System.out.println("Yanlış Seçim yaptınız");
					break;
				}

				break;

			case 3: // Rapor
				int toplamMercimek = 0;
				int toplamNohut = 0;
				int toplamPirinc = 0;
				for (int i = 0; i < Mercimek.size(); i++) {
					toplamMercimek = Mercimek.get(i) + toplamMercimek;
				}
				for (int i = 0; i < Nohut.size(); i++) {
					toplamNohut = Nohut.get(i) + toplamNohut;
				}
				for (int i = 0; i < Pirinc.size(); i++) {
					toplamPirinc = Pirinc.get(i) + toplamPirinc;
				}
				System.out.println("Depodaki Toplam Mercimek Miktarı " + toplamMercimek + " KG dır");
				System.out.println("Depodaki Toplam Nohut Miktarı " + toplamNohut + " KG dır");
				System.out.println("Depodaki Toplam Pirinç Miktarı " + toplamPirinc + " KG dır");
				break;

			default:
				System.out.println("Yanlış Seçim Yaptınız");
				break;

			}

			System.out.println("Devam Etmek istiyormusunuz E/H");
			devam = giris.next().charAt(0);
		} while (devam == 'E' || devam == 'e');

	}
}
