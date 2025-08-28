package cofrinho;

public class Real extends Moeda {
	
	
	
	public Real(Double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Real - R$" + super.getValor()); // Vai printar o valor do Real.
		
	}
	
	@Override
	public double converter() {
		// Vai retornar apenas o valor, pois já inicia em reais.
		return super.getValor();
		
	}
	

}