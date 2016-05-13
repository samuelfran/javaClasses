package exercises;
import java.util.*;

public class Agenda {
	
ArrayList<Pessoa> agenda = new ArrayList <Pessoa>();
	
	public void armazenaPessoa (String nome, int idade, float altura){		
		Pessoa person = new Pessoa (nome, idade, altura);
		
		agenda.add(person);
	}
	
	public int buscaPessoa (String nome){
		int index = 0;
		for (int i = 0; i < agenda.size(); i++){
			if (nome.equals(agenda.get(i).getNome())){
				index = i;
			}
		}
		return index;
	}
	
	public void removePessoa (String nome){
		agenda.remove(buscaPessoa(nome));
	}
	
	public void imprimeAgenda (){
		if (agenda.size() < 0){
			for (int i = 0; i < agenda.size(); i++){
				System.out.println(agenda.get(i));
			}
		}
		else {
			System.out.println ("Sua agenda está vazia !");
		}
	}
	
	public void imprimePessoa(int index){
		if (agenda.size() < 0){
			System.out.println(agenda.get(index));
		}
		else {
			System.out.println ("Sua agenda está vazia !");
		}
	}
}
