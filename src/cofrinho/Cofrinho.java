package cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	private List<Moeda> listaMoeda;
	
	// Construtor padrão sem argumentos
	public Cofrinho() {
		this.listaMoeda = new ArrayList<>(); 
	}
	
	// Método para adicionar um Moeda.
	public void adicionar(Moeda moeda) {
		listaMoeda.add(moeda);
		System.out.print("Moeda Adicionada");
	}
	
	// Método para remover a moeda da lista.
	public void remover(Moeda moeda) {
		if (listaMoeda.remove(moeda)) {
			System.out.println("Moeda removida!");
		} else {
			System.out.println("Moeda não encontrada no cofrinho.");
		}
		
	}
	
	// Método para listar todas as moedas
	public void listagemMoedas() {
		System.out.println("Moedas no cofrinho");
		for(Moeda moeda : listaMoeda) {
			moeda.info(); //Chama o método info de cada moeda.
			
		}
		
	}
	
	public void totalConvertido() {
		for(Moeda moeda : listaMoeda) {
			moeda.converter(); // Chama o método converter de cada moeda.
		}
	}
	

	
	
	
	
}
