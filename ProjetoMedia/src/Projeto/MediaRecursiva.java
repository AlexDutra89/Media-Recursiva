package Projeto;

import java.util.Scanner;

public class MediaRecursiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de notas: ");
		int numeroNotas = sc.nextInt();

		double[] notas = new double[numeroNotas];
		double somaNotas = calcularSomaNotas(notas, 0, sc);
		double media = calcularMedia(somaNotas, numeroNotas);
		System.out.printf("Sua nota final é: %.2f\n", media);

		sc.close();
	}

	public static double calcularSomaNotas(double[] notas, int i, Scanner sc) {
		if (i == notas.length) {
			return 0;
		}
		notas[i] = lerNotas(sc);
		return notas[i] + calcularSomaNotas(notas, i + 1, sc);
	}

	public static double lerNotas(Scanner sc) {
		System.out.println("Digite a nota: ");
		double nota = sc.nextDouble();
		if (nota >= 0 && nota <= 10) {
			return nota;
		} else {
			System.out.println("Nota inválida!!!!!\n Digite uma nota de 0 à 10!\n");
			return lerNotas(sc);
		}
	}

	public static double calcularMedia(double somaNotas, int numeroNotas) {
		return somaNotas / numeroNotas;

	}
}
