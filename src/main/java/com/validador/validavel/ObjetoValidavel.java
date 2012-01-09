package com.validador.validavel;

public class ObjetoValidavel<T extends ObjetoValidavel<?>> extends AbstractValidavel<T, Object> {

	public ObjetoValidavel(String nomeCampo, Object valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public ObjetoValidavel(String nomeObjeto, String nomeCampo, Object valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
