package interface_default_method_servicos;



public class ServicoDeJurosDoBrasil implements ServicoDeJuros {
	
	private double juros;
	
	public ServicoDeJurosDoBrasil(double juros) {
		this.juros = juros;
	}	
	
	@Override
	public double getJuros() {
		return juros;
	}
}
