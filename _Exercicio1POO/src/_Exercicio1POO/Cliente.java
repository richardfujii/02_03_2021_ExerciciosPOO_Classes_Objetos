package _Exercicio1POO;

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
		String dados = "Seu nome é: "+nome+"; seu cpf é: "+cpf+", sua nacionalidade é: "+nacionalidade+" e sua idade é: "+idade;
		System.out.println(dados);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
