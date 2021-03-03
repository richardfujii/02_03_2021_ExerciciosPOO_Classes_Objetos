package exercicio3POO;

import java.util.Scanner;
import java.text.NumberFormat;

public class produtoEletronico {
	
	String nome;
	int quantidade;
	double preco;
	Scanner leia = new Scanner(System.in);
	
	public produtoEletronico()
	{	
		System.out.println("Digite o nome do produto: ");
		String n = leia.nextLine();
		System.out.println("Digite a quantidade comprada do produto: ");
		int q = leia.nextInt();
		System.out.println("Digite o preço do produto: ");
		double p = leia.nextDouble();
		this.preco = p;
		this.quantidade = q;
		this.nome = n;
	}
	public String formatDinheiro() 
	{
		NumberFormat formatado = NumberFormat.getCurrencyInstance();
		formatado.setMinimumFractionDigits(2);
		String dinheiroFormatado = formatado.format(preco);
		return dinheiroFormatado;
	}
	public void imprimirInfo() 
	{
		System.out.print("O nome do produto é: "+nome+", a quantidade comprada é: "+quantidade+" e o preço unitário é: "+this.formatDinheiro());
	}
}
