package com.validador.validavel;

public class ByteValidavel<T extends ByteValidavel<?>> extends NumericoValidavel<T, Byte> {

	public ByteValidavel(String nomeCampo, Byte valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public ByteValidavel(String nomeObjeto, String nomeCampo, Byte valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
