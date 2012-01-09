package com.validador.regra;

public class RegraPreenchido extends AbstractRegra<Object> {

	public static final RegraPreenchido INSTANCE = new RegraPreenchido();

	private static final String REGRA = "obrigatorio";

	@Override
	public boolean validar(Object valor, Resultado resultado) {
		boolean valido = valor != null && !"".equals(valor.toString().trim());
		if (!valido) {
			resultado.erro(REGRA);
		}
		return valido;
	}

}
