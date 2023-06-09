import java.io.IOException;
import java.util.Scanner;

public class FichaCadastro {
	
	private static String nome;
	private static int idade;
	private static double peso;
	private static double altura;
	private static char sexo;

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	do {
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
	}while(nome.length() < 6 || nome.length() > 30);
		
	do {
	System.out.println("Digite sua idade: ");
	idade = scan.nextInt();
	}while(idade <= 0 || idade >= 100);
	
	
	do {
	System.out.println("Digite seu peso: ");
	peso = scan.nextDouble();
	}while(peso <= 0);
	
	do {
		System.out.println("Digite seu altura: ");
		altura = scan.nextDouble();
	}while(altura <= 0);

	do {
	try {
		System.out.println("Digite seu sexo m ou f: ");
		sexo = (char) System.in.read();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}while(sexo != 'f' && sexo != 'm');
	
	System.out.println("nome: "+nome);
	System.out.println("idade: "+idade);
	System.out.println("peso: "+peso);
	System.out.println("altura: "+altura);
	System.out.println("sexo: "+sexo);

	}

}
