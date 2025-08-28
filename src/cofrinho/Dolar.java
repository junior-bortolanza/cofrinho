package cofrinho;

public class Dolar extends Moeda {
	private static final Double TAXADOLAR = 5.42;

	public Dolar(Double valor) {
		super(valor);
	}
	
	@Override
	public void info() {
		System.out.println("Dólar - $ " + super.getValor());
	}
	
	@Override
	public double converter() {
		return super.getValor() * TAXADOLAR;
	}

}
