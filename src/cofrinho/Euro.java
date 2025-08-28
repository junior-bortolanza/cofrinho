package cofrinho;

public class Euro extends Moeda {
	private static final Double TAXAEURO = 6.33;

	public Euro(Double valor) {
		super(valor);
	}
	
	@Override
	public void info() {
		System.out.println("EURO - € " + super.getValor());
	}
	
	@Override
	public double converter() {
		return super.getValor() * TAXAEURO;
	}

}
