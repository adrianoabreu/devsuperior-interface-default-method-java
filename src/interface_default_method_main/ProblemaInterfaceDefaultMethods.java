package interface_default_method_main;

import java.util.Locale;
import java.util.Scanner;

import interface_default_method_servicos.ServicoDeJuros;
import interface_default_method_servicos.ServicoDeJurosDoBrasil;
import interface_default_method_servicos.ServicoDeJurosDoUsa;

public class ProblemaInterfaceDefaultMethods {
	/*
	 * Fazer um programa para ler uma quantia e a dura��o em meses de um
	 * empr�stimo. Informar o valor a ser pago depois de decorrido o prazo do
	 * empr�stimo, conforme regras de juros do Brasil. A regra de c�lculo de
	 * juros do Brasil � juro composto padr�o de 2% ao m�s.
	 * 
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do Emprestimo: ");
		double valor = sc.nextDouble();
		System.out.print("Quantidade de Meses: ");
		int meses = sc.nextInt();
		
		//ServicoDeJurosDoBrasil sj = new ServicoDeJurosDoBrasil(2.0);
		//ServicoDeJurosDoUsa    sj = new ServicoDeJurosDoUsa(1.0);
		ServicoDeJuros           sj = new ServicoDeJurosDoUsa(1.0);
		double pagamento            = sj.pagamento(valor,meses);
		
		System.out.println("Pagamento posterior: " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();
	}

}
