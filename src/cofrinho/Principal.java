package cofrinho;

import java.util.Locale;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//Instância da classe Cofrinho
		
		Cofrinho meuCofrinho = new Cofrinho();
		
		//Instância das classes das moedas: Real, Euro e Dolar.
		Real real = new Real(1500.00);
		Dolar dolar = new Dolar(100.00);
		Euro euro = new Euro(150.00);
	
		

		//Adicionando as moedas no meuCofrinho
		meuCofrinho.adicionar(real);
		meuCofrinho.adicionar(dolar);
		meuCofrinho.adicionar(euro);
		
		//Removendo a moeda euro
		meuCofrinho.remover(euro);
        
		//Listando minhas moedas
        meuCofrinho.listagemMoedas();
        
        // Valores convertidos
        meuCofrinho.totalConvertido();
        
		
		sc.close();

	}

}
