package exercicios;
import java.util.Scanner;

public class ComparadorDeStrings {
	
	public static boolean comparador(String nome1, String nome2) {
		if (nome1.length() != nome2.length()) {
		return(false);
		}
		else {
			int i = 0;
			int j = nome2.length()-1;
			while(i < nome1.length()) {
				if (nome1.charAt(i) != nome2.charAt(j)) {
					return(false);
				}
				i++;
				j--;
			}
			return(true);
		}
	}
	
	public static void main(String[] args) {
		System.out.printf("Bem vindo ao Comparador de Strings! Digite a primeira palavra: ");
		Scanner sc = new Scanner(System.in);
		String nome1 = sc.nextLine();
		System.out.printf("Agora, digite a segunda palavra: ");
		String nome2 = sc.nextLine();
		sc.close();
		boolean theTruth = comparador(nome1, nome2);
		if (theTruth == true) {
			System.out.printf("As palavras são iguais!");
		}
		else if (theTruth == false) {
			System.out.printf("As palavras não são iguais!");
		}
	}
}
