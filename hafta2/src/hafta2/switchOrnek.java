package hafta2;

public class switchOrnek {

	public static void main(String[] args) {
		// bir de�i�ken tamsay� olmak ko�ulu ile ayn� de�i�ken birden fazla kez
		// k�yaslanacksa kullan�l�r
		// men�l� i�lemlerde kullan�l�r.
		int a = 2;
		switch (a) {
		case 1:
	
		case 2:
			System.out.println("a 1 yada 2 de�erindedir.");
			break;
		case 3:
			System.out.println("a 3 de�erindedir.");
			break;
		case 4:
			System.out.println("a 4 de�erindedir.");
			break;
		case 5:
			System.out.println("a 5 de�erindedir.");
			break;
		default:
			System.out.println("a 1-5 in d���ndad�r");
		}// case sonu

	}

}
