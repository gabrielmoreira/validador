package com.validador.validavel;

import java.util.Date;

public class DateValidavel<T extends DateValidavel<?>> extends ComparavelValidavel<T, Date> {

	public DateValidavel(String nomeCampo, Date valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public DateValidavel(String nomeObjeto, String nomeCampo, Date valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
