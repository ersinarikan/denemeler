package hafta7;
public class EsnekParametre {
	public static void Toplama (int... sayilar) {
		int toplam=0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		System.out.println("Sayilar�n toplam� : "+toplam);
	}
	public static void main(String[] args) {
		Toplama(1,3);
Toplama(3,5,7,9);
Toplama();
	}
 public static void toplam() {
	 
 }
public static void toplam(int s1) {
	 
 }
public static void toplam(float s1) {
	 
}
}
