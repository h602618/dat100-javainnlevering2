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
		int[][] minMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.println(matrise[i][j]);
				minMatrise[i][j] = matrise[i][j] * tall;
			}
		}

		return minMatrise;
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
		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	}
}
