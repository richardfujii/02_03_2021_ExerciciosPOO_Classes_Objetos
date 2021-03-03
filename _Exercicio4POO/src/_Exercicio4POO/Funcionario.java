package _Exercicio4POO;

import java.util.Scanner;
import java.text.NumberFormat;

public class Funcionario {
	private String nome;
	private String cargo;
	private double idade;
	private double salario;
	private double aumentoSalario;
	Scanner leia = new Scanner(System.in);
	
	public Funcionario()
	{
		System.out.println("Entre com o seu nome: ");
		String n = leia.nextLine();
		this.nome = n;
		System.out.println("Entre com o seu cargo: ");
		String c = leia.nextLine();
		this.cargo = c;
		System.out.println("Entre com a sua idade: ");
		double i = leia.nextDouble();
		this.idade = i;
		System.out.println("Entre com o seu salario atual: ");
		double s = leia.nextDouble();
		this.salario = s;
		System.out.println("Entre com a sua pretensão de aumento salarial: ");
		double as = leia.nextDouble();
		this.aumentoSalario = as;
	}
	public double AumentarSalario(double percentual)
	{	
		double salario1 = salario*(1+percentual);
		return salario1;
	}
	public String FormatarSalarioAtual()
	{
		NumberFormat fs = NumberFormat.getCurrencyInstance();
		fs.setMinimumFractionDigits(2);
		String salatualformat = fs.format(salario);
		return salatualformat;
	}
	public String FormatarSalarioAumentado()
	{
		NumberFormat fsa = NumberFormat.getCurrencyInstance();
		fsa.setMinimumFractionDigits(2);
		String salaumentformat = fsa.format(AumentarSalario(aumentoSalario));
		return salaumentformat;
	}
	public void imprimirInfo()
	{
		System.out.println("Nome: "+nome+"\nCargo: "+cargo+"\nIdade: "+idade);
		System.out.println("Salário atual: "+this.FormatarSalarioAtual());
		System.out.println("Salário pós aumento salarial: "+this.FormatarSalarioAumentado());
	}
	
}
