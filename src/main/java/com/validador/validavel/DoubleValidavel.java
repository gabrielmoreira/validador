package com.validador.validavel;

public class DoubleValidavel<T extends DoubleValidavel<?>> extends NumericoValidavel<T, Double> {
	private static final Double ZERO = new Double(0);

	public DoubleValidavel(String nomeCampo, Double valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public DoubleValidavel(String nomeObjeto, String nomeCampo, Double valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

	@Override
	protected Double zero() {
		return ZERO;
	}

}
