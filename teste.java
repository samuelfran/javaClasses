package exercise;

public class teste {
	public void main(String[] args){
		
		Agenda agenda = new Agenda();
		
		agenda.armazenaPessoa("Juliano", 21, (float) 1.68);
		agenda.imprimePessoa();
		agenda.armazenaPessoa("Alex", 20, (float) 1.90);
		agenda.imprimePessoa();
		agenda.buscaPessoa("Juliano");
		agenda.removePessoa("Alex");
		agenda.imprimePessoa(0);
		
	}
}
