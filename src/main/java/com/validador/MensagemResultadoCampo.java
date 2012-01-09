package com.validador;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.validador.validavel.ResultadoCampo;

public class MensagemResultadoCampo implements ResultadoCampo {
	private String prefixo;
	private List<Mensagem> mensagens = new ArrayList<Mensagem>();

	public void erro(String objeto, String campo, String codigo) {
		mensagens.add(montaMensagem(objeto, campo, codigo).build());
	}

	public void erro(String objeto, String campo, String codigo, Object... parametros) {
		mensagens.add(montaMensagem(objeto, campo, codigo).parametros(parametros).build());
	}

	private Mensagem.Builder<?> montaMensagem(String objeto, String campo, String codigo) {
		return Mensagem.erro().campo(campo).codigo(codigo).chaves(montarChaves(objeto, campo, codigo));
	}

	private String[] montarChaves(String objeto, String campo, String codigo) {
		LinkedHashSet<String> chaves = new LinkedHashSet<String>();
		if (prefixo != null) {
			chaves.add(montaChave(prefixo, objeto, campo, codigo));
		}
		if (objeto != null) {
			chaves.add(montaChave(objeto, campo, codigo));
		}
		chaves.add(montaChave(campo, codigo));
		chaves.add(montaChave(codigo));
		return chaves.toArray(new String[chaves.size()]);
	}

	private String montaChave(String... campos) {
		StringBuilder sb = new StringBuilder();
		for (String campo : campos) {
			if (campo != null) {
				sb.append('.').append(campo);
			}
		}
		return sb.substring(1);
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public List<Mensagem> getErros() {
		List<Mensagem> erros = new ArrayList<Mensagem>();
		for (Mensagem mensagem : this.mensagens) {
			if (mensagem.getTipo() == TipoMensagem.ERRO) {
				erros.add(mensagem);
			}
		}
		return erros;
	}
}
