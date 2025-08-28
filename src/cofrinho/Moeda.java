package cofrinho;

public abstract class Moeda {
	//Atributo da classe moeda
	private Double valor;
	
	// Construtor sem argumentos.
	public Moeda() {}

	// Construtor com argumentos.
	
	public Moeda(Double valor) {
		this.valor = valor;
	}
	
	// Método abstrato que forçará as classes filhas a implementar esse método
	public abstract void info();
	
	// Método abstrato que irá converter o valor das moedas para Real, Dólar e Euro.
	public abstract double converter();

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	} 
	
	
	

}
