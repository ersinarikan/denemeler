import java.util.Scanner;

public class NotHEsap {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		byte vn = 0, fn = 0, bn;
		/*
		 * System.out.println("while döngüsü"); while (vn != -1 && fn != -1) {
		 * System.out.println("Vize Notunu giriniz : "); vn = giris.nextByte();
		 * System.out.println("Final notu giriniz : "); fn = giris.nextByte(); // if (vn
		 * == -1 || fn == -1) break; bn = (byte) ((vn + fn) / 2);
		 * System.out.println("Baþarý notunuz : " + bn); }
		 * System.out.println("Do döngüsü");
		 */
		int vnTop=0,fnTop=0,bnTop=0;
		byte kisiSayisi=0;
		do {
			//kisiSayisi++;
			System.out.println("Vize Notunu giriniz : ");
			vn = giris.nextByte();
			System.out.println("Final notu giriniz : ");
			fn = giris.nextByte();
			 if (vn == -1 || fn == -1) break;
			kisiSayisi++;
			bn = (byte) ((vn + fn) / 2);
			System.out.println("Baþarý notunuz : " + bn);
			vnTop=vnTop+vn;
			fnTop+=fn;
			bnTop+=bn;
		} while (true);
		System.out.println("Vize Not toplamý : "+vnTop);
		System.out.println("Final Not toplamý : "+fnTop);
		System.out.println("Baþarý Not toplamý : "+bnTop);
		System.out.println("Vize Not ortalamasý "+(vnTop/kisiSayisi));
		System.out.println("Final Not ortalamasý "+(fnTop/kisiSayisi));
		System.out.println("Baþarý Not ortalamasý "+(bnTop/kisiSayisi));

	}

}
