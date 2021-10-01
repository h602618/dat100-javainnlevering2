package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			int[] rad = matrise[i];

			for (int j = 0; j < rad.length; j++) {
				System.out.print(rad[j]);
			}

			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String str = "";

		for (int i = 0; i < matrise.length; i++) {
			int[] rad = matrise[i];

			for (int j = 0; j < rad.length; j++) {
				str += rad[j] + " ";
			}
			str += "\n";
		}

		return str;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matrise[i][j] = matrise[i][j] * tall;
			}
		}

		return matrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speiletMatrise[i][j] = matrise[j][i];
			}
		}

		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		// b skal flippes
		int[][] speiletB = speile(b);

		int[][] resultat = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int sum = 0;
				for (int k = 0; k < a[i].length; k++) {
					sum += a[i][k] * speiletB[j][k];
				}

				resultat[i][j] = sum;
			}

		}

		return resultat;
	}
}
