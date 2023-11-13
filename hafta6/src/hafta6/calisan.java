package hafta6;

import java.util.Scanner;

public class calisan {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Kaç kişi için çalışacak");
		byte kisi=giris.nextByte();
		String ad[] = new String [kisi];
		int yas[] = new int[kisi];
		String cinsiyet[]=new String [kisi];
		for (int i = 0; i < kisi; i++) {
			
			System.out.print((i+1)+"kişinin adı : ");
			ad[i]=giris.next();
			System.out.print((i+1)+"kişinin Cinsiyeti : ");
			cinsiyet[i]=giris.next();
			System.out.print((i+1)+"kişinin Yaşı : ");
			yas[i]=giris.nextInt();
		}
		byte menu;
		for(;;) {
			fonksiyon.MenuGoruntule();
			menu=giris.nextByte();
			switch (menu) {
			case 1:fonksiyon.listeleme(ad,yas,cinsiyet);
				break;
			case 2: System.out.println("Aranacak adı giriniz : ");
			String arananAd= giris.next();
			fonksiyon.Arama(arananAd,ad,yas,cinsiyet);
				break;
			case 3:fonksiyon.OkulDurumu(ad,yas);
			break;
			case 4:int yasOrt=fonksiyon.ErkekYasOrt(cinsiyet,yas);
			System.out.println("Erkeklerin yaş ortalaması : "+yasOrt);
			break;
			case 5:
			System.out.println("Program Bitti");
			System.exit(0);
			break;
			default:System.out.println("Yanlış Menü Değeri");
				break;
				
			}
		}
		
		

	}

}
