package interface_default_method_servicos;



public class ServicoDeJurosDoUsa implements ServicoDeJuros{
	
	private double juros;
	
	public ServicoDeJurosDoUsa(double juros) {
		this.juros = juros;
	}	
	
	@Override
	public double getJuros() {
		return juros;
	}
}
