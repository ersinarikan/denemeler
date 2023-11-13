package hafta6;

public class metot1 {

	public static void main(String[] args) {
		//parametresiz
		yaziGoruntule();
		yaziGoruntule();
		int a=5,b=10,c=6;
		toplama(a,c);
		toplama(a,b,c);
		int sonuc=topla(a,b,c);
		System.out.println(topla(a,b,c));
		int sayilar[]= {3,6,9,15,};
		int ortalama=ortalama1(sayilar);
		System.out.println(ortalama);

	}

	private static int ortalama1(int[] sayilar) {
		int toplam=0;
				for (int i = 0; i < sayilar.length; i++) {
				toplam+=(sayilar[i]);	
					
				}
		return toplam/sayilar.length;
	}

	public static int topla(int a, int b, int c) {
		// TODO Auto-generated method stub
		int x=a+b+c;
		return x;
		
	}

	public static void yaziGoruntule() {
		System.out.println("MErhaba Naber ?");
		
	}

	private static void toplama(int x, int y) {
		
		
	}
	private static void toplama(int x, int y, int z) {
		System.out.println(x+"a"+y+"b ="+ (x+y+z));
		
	}

}
