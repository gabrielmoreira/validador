package com.validador.validavel;

public class IntegerValidavel<T extends IntegerValidavel<?>> extends NumericoValidavel<T, Integer> {
	private static final Integer ZERO = new Integer(0);

	public IntegerValidavel(String nomeCampo, Integer valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public IntegerValidavel(String nomeObjeto, String nomeCampo, Integer valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

	@Override
	protected Integer zero() {
		return ZERO;
	}

}
