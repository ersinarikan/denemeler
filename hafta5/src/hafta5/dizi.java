package hafta5;

public class dizi {

	public static void main(String[] args) {
		int sayilar[]= {23,567,354,789};
		int toplam =0;
		for (int sayi : sayilar) {
			toplam+=sayi;
			System.out.println("Sayıların toplamı : " + toplam);
			System.out.println("Sayıların ortalaması " +toplam/sayilar.length);
			System.out.println("2. indisteki değer : "+sayilar[2]);
			System.out.println("-----------------------------");
			toplam = 0;
			for(int i=0; i<sayilar.length;i=i+1) {
			toplam=sayilar[i];
				
			}
		}
		

	}

}
