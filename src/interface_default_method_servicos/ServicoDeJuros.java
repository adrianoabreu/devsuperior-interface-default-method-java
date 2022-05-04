package interface_default_method_servicos;

import java.security.InvalidParameterException;

public interface ServicoDeJuros {

	double getJuros();
	
	default double pagamento(double valor, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Meses deve ser maior que zero");
		}
		return valor * Math.pow(1.0 + getJuros() / 100.0 , meses);
	}
	
}
