package algoritmos;

import java.util.Arrays;

public class instertionSort {
	public static void main(String[] args) {
		int[] arrayTeste = {31, 41, 59, 26, 41, 58};
		int chave, i;
		for(int j = 1; j < arrayTeste.length; j++) {
			chave = arrayTeste[j];
			i = j - 1;
			while (i >= 0 && arrayTeste[i] > chave) {
				arrayTeste[i + 1] = arrayTeste[i];
				i--;
			}
			arrayTeste[i + 1] = chave;
		}
		System.out.println(Arrays.toString(arrayTeste));
	}
}
