package hafta2;

public class switchOrnek {

	public static void main(String[] args) {
		// bir değişken tamsayı olmak koşulu ile aynı değişken birden fazla kez
		// kıyaslanacksa kullanılır
		// menülü işlemlerde kullanılır.
		int a = 2;
		switch (a) {
		case 1:
	
		case 2:
			System.out.println("a 1 yada 2 değerindedir.");
			break;
		case 3:
			System.out.println("a 3 değerindedir.");
			break;
		case 4:
			System.out.println("a 4 değerindedir.");
			break;
		case 5:
			System.out.println("a 5 değerindedir.");
			break;
		default:
			System.out.println("a 1-5 in dışındadır");
		}// case sonu

	}

}
