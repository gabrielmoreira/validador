package com.validador.regra;

public class RegraExpressao extends AbstractRegra<Boolean> {

	private static final String REGRA_VERDADEIRA = "expressaoDeveSerVerdadeira";
	private static final String REGRA_FALSA = "expressaoDeveSerFalsa";
	private String regra;
	private Boolean esperado;

	public RegraExpressao(Boolean esperado) {
		this.esperado = esperado;
		this.regra = esperado ? REGRA_VERDADEIRA : REGRA_FALSA;
	}

	public RegraExpressao(boolean esperado, String regra) {
		this.esperado = esperado;
		this.regra = regra;
	}

	@Override
	public boolean validar(Boolean valor, Resultado resultado) {
		if (esperado != valor) {
			resultado.erro(regra);
			return false;
		}
		return true;
	}

	public static RegraExpressao verdadeira() {
		return new RegraExpressao(true);
	}

	public static RegraExpressao falsa() {
		return new RegraExpressao(false);
	}

	public static RegraExpressao verdadeira(String regra) {
		return new RegraExpressao(true, regra);
	}

	public static RegraExpressao falsa(String regra) {
		return new RegraExpressao(false, regra);
	}

}
