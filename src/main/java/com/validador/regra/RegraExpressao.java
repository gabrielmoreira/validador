package com.validador.regra;

public class RegraExpressao extends AbstractRegra<Boolean> {

	private static final String REGRA_VERDADEIRA = "expressaoDeveSerVerdadeira";
	private static final String REGRA_FALSA = "expressaoDeveSerFalsa";
	private String regra;
	private Boolean esperado;
	private Object[] parametros;

	public RegraExpressao(Boolean esperado) {
		this.esperado = esperado;
		this.regra = esperado ? REGRA_VERDADEIRA : REGRA_FALSA;
	}

	public RegraExpressao(boolean esperado, String regra) {
		this.esperado = esperado;
		this.regra = regra;
	}

	public RegraExpressao(boolean esperado, String regra, Object[] parametros) {
		this.esperado = esperado;
		this.regra = regra;
		this.parametros = parametros;
	}

	@Override
	public boolean validar(Boolean valor, Resultado resultado) {
		if (esperado != valor) {
			if (parametros == null) {
				resultado.erro(regra);
			} else {
				resultado.erro(regra, parametros);
			}
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

	public static RegraExpressao verdadeira(String regra, Object... parametros) {
		return new RegraExpressao(true, regra, parametros);
	}

	public static RegraExpressao falsa(String regra, Object... parametros) {
		return new RegraExpressao(false, regra, parametros);
	}

}
