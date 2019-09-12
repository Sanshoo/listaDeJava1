package exercicios;
import java.util.Scanner;

public class Comparador {
	
	public static String leitor() {
		String retorno = "";
		int[] listaDeNumeros = new int[8];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
		System.out.printf("Digite um numero: ");
		listaDeNumeros[i] = sc.nextInt();
		}
		sc.close();
		int stor = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 8; j++) {
				if (listaDeNumeros[i] < listaDeNumeros[j]) {
					stor = listaDeNumeros[i];
					listaDeNumeros[i] = listaDeNumeros[j];
					listaDeNumeros[j] = stor;
				}
			}
		}
		retorno = "Os dois maiores números são " + listaDeNumeros[0] + " e " + listaDeNumeros[1] + ".";
		return(retorno);
	}
	
	public static void main(String[] args) {
		System.out.print(leitor());
	}

}
