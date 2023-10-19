import java.util.Scanner;

class pessoa
{
    String nome;
	double altura, peso;
	    
}

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leitor = new Scanner(System.in);
	    
	    double imc;
	    
	    pessoa p1;
	    
	    p1 = new pessoa();
	    
		System.out.println("Nome: ");
		p1.nome = leitor.next();
		
		System.out.println("Peso: ");
		p1.peso = leitor.nextDouble();
		
		System.out.println("Altura: ");
		p1.altura = leitor.nextDouble();
		
		imc = p1.peso/(p1.altura*p1.altura);
		
		System.out.println("Seu imc é: "+imc);

		if (imc <=19)
			System.out.println("Abaixo do peso");

				else if (imc <=25)
				System.out.println("Peso normal");

					else
				System.out.println("Acima do peso");
	}
}
