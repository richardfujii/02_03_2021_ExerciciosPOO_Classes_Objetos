package exercicio1POO;

public class Cliente {
	private String nome;
	private String cpf;
	private String nacionalidade;
	private int idade;
	
	public Cliente(String name, String document, String nationality, int age)
	{
		this.nome = name;
		this.cpf = document;
		this.nacionalidade = nationality;
		this.idade = age;
	}
	public void ImprimirInfo()
	{
		String dados = "Seu nome �: "+nome+"; seu cpf �: "+cpf+", sua nacionalidade �: "+nacionalidade+" e sua idade �: "+idade;
		System.out.println(dados);
	}
	
}
