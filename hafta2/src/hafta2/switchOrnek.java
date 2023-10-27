package hafta2;

public class switchOrnek {

	public static void main(String[] args) {
		// bir deðiþken tamsayý olmak koþulu ile ayný deðiþken birden fazla kez
		// kýyaslanacksa kullanýlýr
		// menülü iþlemlerde kullanýlýr.
		int a = 2;
		switch (a) {
		case 1:
	
		case 2:
			System.out.println("a 1 yada 2 deðerindedir.");
			break;
		case 3:
			System.out.println("a 3 deðerindedir.");
			break;
		case 4:
			System.out.println("a 4 deðerindedir.");
			break;
		case 5:
			System.out.println("a 5 deðerindedir.");
			break;
		default:
			System.out.println("a 1-5 in dýþýndadýr");
		}// case sonu

	}

}
