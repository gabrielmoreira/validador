package com.validador;

import java.util.List;

import com.validador.validavel.Validavel;

public class Validar {

	private MensagemResultadoCampo resultado = new MensagemResultadoCampo();

	public boolean se(Validavel<?, ?> validavel) {
		return validavel.valido(resultado);
	}

	public List<Mensagem> getMensagens() {
		return resultado.getMensagens();
	}

	public List<Mensagem> getErros() {
		return resultado.getErros();
	}

	public boolean valido() {
		return getErros().isEmpty();
	}

	public boolean temErro() {
		return !valido();
	}

}
