package hafta3;

public class Donguler {

	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 5; i += 1) { System.out.println(i +
		 * " Okan �niversitesi"); }
		 * 
		 * for (int i = 0; i <= 10; i++) { // if (i==3 || i==6) continue; // if (i==5)
		 * break;  if (i % 2 == 1) continue; System.out.println(i); if (i == 6) break; }
		 */
		System.out.println("Do d�ng�s�");
		int i = 0;
		do {
			i++;
			if (i % 2 == 1)
				continue;
			System.out.println(i);
			if (i == 5)
				break;
			
		} while (i <= 10);
		i=0;
		System.out.println("While d�ng�s� "+i);
		while(i <= 10) {
			i++;
			if (i % 2 == 1)
				continue;
			System.out.println(i);
			if (i == 5)
				break;
		}
	}
}
