package _Exercicio2POO;

public class Aviao {
	public double tamanho;
	public double peso;
	public double passageiros;
	public String modelo;
	
	public Aviao(double t,double p, double ps, String m)
	{	
		this.tamanho=t;
		this.peso=p;
		this.passageiros=ps;
		this.modelo=m;
		System.out.println("O avi�o tem tamanho: "+tamanho+" metros, peso: "+peso+" toneladas, capacidade: "+passageiros+" passageiros e � do modelo: "+modelo);
	}

}
