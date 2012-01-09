package com.validador.validavel;

public class LongValidavel<T extends LongValidavel<?>> extends NumericoValidavel<T, Long> {
	private static final Long ZERO = new Long(0);

	public LongValidavel(String nomeCampo, Long valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public LongValidavel(String nomeObjeto, String nomeCampo, Long valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

	@Override
	protected Long zero() {
		return ZERO;
	}

}
