package com.validador.validavel;

public class ShortValidavel<T extends ShortValidavel<?>> extends NumericoValidavel<T, Short> {
	private static final short ZERO = (short) 0;

	public ShortValidavel(String nomeCampo, Short valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public ShortValidavel(String nomeObjeto, String nomeCampo, Short valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

	@Override
	protected Short zero() {
		return ZERO;
	}

}
