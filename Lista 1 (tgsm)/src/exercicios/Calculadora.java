package exercicios;
import java.util.Scanner;

//Questão 1

public class Calculadora {
	public static double somar(double x, double y) {
		return x + y;
	}
	public static double subtrair(double x, double y) {
		return x - y;
	}
	public static double dividir(double x, double y) {
		return x/y;
	}
	public static double multiplicar(double x, double y) {
		return x*y; 
	}
	public static double elevarAPotencia(double x, double y) {
		y = Math.round(y);
		return Math.pow(x, y);
	}
	
	public static void main(String[] args) {
		double arg1 = 0;
		double arg2 = 0;
		char signal = 'a';
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vinde a calculadora! digite os numeros e a operacao que deseja fazer abaixo.");
		System.out.printf("Digite o primeiro numero: ");
		arg1 = sc.nextDouble();
		System.out.printf("Digite o segundo numero: ");
		arg2 = sc.nextDouble();
		System.out.printf("Digite o sinal de operacao: ");
		signal = sc.next().charAt(0);
		sc.close();
		System.out.printf("%f %c %f", arg1, signal, arg2);
		double resultado = 0;
		switch (signal){
		case '+':
			resultado = somar(arg1, arg2);
			break;
		case '-':
			resultado = subtrair(arg1, arg2);
			break;
		case '/':
			resultado = dividir(arg1, arg2);
			break;
		case '*':
			resultado = multiplicar(arg1, arg2);
			break;
		case '^':
			resultado = elevarAPotencia(arg1, arg2);
			break;
		default:
			System.out.println("Erro! Operaçao invalida. Por favor digite um sinal de operaçao valido.");
			break;
		}
		System.out.printf("O resultado da operacao eh %f", resultado);
	}
}
