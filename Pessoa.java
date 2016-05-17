package EX;

public class Pessoa {
	private String nome;
	private float altura;
	private int idade;
	
	public Pessoa (String nome, int idade, float altura){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Pessoa (){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
