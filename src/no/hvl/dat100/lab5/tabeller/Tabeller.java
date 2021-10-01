package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "";

		resultat += "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i > 0) {
				resultat += ",";
			}

			resultat += tabell[i];
		}
		resultat += "]";

		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		// for-løkke
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}

		/// while-løkke
		// înt i = 0;
		// while (i < tabell.length) {
		// sum += tabell[i];
		// i++;
		// }

		/// forenklet-løkke
		// for (int tall : tabell) {
		// sum += tall;
		// }

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}

		return -1;
	}

	// f)

	public static int[] reverser(int[] tabell) {
		int[] arr = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			arr[tabell.length - 1 - i] = tabell[i];
		}

		return arr;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}

		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] arr = new int[tabell1.length + tabell2.length];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i < tabell1.length) {
				arr[i] = tabell1[i];
			} else {
				arr[i] = tabell2[j++];
			}
		}

		return arr;
	}
}
