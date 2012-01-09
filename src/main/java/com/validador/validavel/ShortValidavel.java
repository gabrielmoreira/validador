package com.validador.validavel;

public class ShortValidavel<T extends ShortValidavel<?>> extends NumericoValidavel<T, Short> {

	public ShortValidavel(String nomeCampo, Short valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public ShortValidavel(String nomeObjeto, String nomeCampo, Short valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
