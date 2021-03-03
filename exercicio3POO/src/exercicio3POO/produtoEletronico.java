package exercicio3POO;

import java.util.Scanner;
import java.text.NumberFormat;

public class produtoEletronico {
	
	private String nome;
	private int quantidade;
	private double preco;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Scanner getLeia() {
		return leia;
	}
	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	
}
