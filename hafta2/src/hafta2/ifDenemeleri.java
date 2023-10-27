package hafta2;

import java.util.Scanner;

public class ifDenemeleri {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		System.out.println("Vize notunu Giriniz: ");
		byte vNote = giris.nextByte();
		System.out.println("Final notunu Giriniz: ");
		byte fNote = giris.nextByte();
		byte bP = (byte) ((vNote + fNote) / 2);
		if (bP < 30)
			System.out.println("Başarı Notunuz : " + bP + " Kaldınız FF ");
		else if (bP < 40)
			System.out.println("Başarı Notunuz : " + bP + " Şartlı Geçtiniz DD ");
		else if (bP < 50)
			System.out.println("Başarı Notunuz : " + bP + " Şartlı Geçtiniz DC ");
		else
			System.out.println("Başarı Notunuz : " + bP + " Geçtiniz ");

	}

}
