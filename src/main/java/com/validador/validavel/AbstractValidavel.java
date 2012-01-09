package com.validador.validavel;

import java.util.ArrayList;
import java.util.List;

import com.validador.regra.AbstractRegra;
import com.validador.regra.RegraPreenchido;
import com.validador.regra.Resultado;

public abstract class AbstractValidavel<T extends AbstractValidavel<?, ?>, K> implements Validavel<T, K> {

	private String nomeObjeto;
	private String nomeCampo;
	private K valorCampo;

	private List<AbstractRegra<?>> abstractRegras = new ArrayList<AbstractRegra<?>>();
	private boolean inversa;
	private boolean opcional;

	public AbstractValidavel(String nomeCampo, K valorCampo) {
		this.nomeCampo = nomeCampo;
		this.valorCampo = valorCampo;
	}

	public AbstractValidavel(String nomeObjeto, String nomeCampo, K valorCampo) {
		this.nomeObjeto = nomeObjeto;
		this.nomeCampo = nomeCampo;
		this.valorCampo = valorCampo;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public K getValorCampo() {
		return valorCampo;
	}

	@SuppressWarnings("unchecked")
	protected T me() {
		return (T) this;
	}

	public T opcional() {
		this.opcional = true;
		return me();
	}

	public T nao() {
		this.inversa = true;
		return me();
	}

	public T preenchido() {
		this.regra(RegraPreenchido.INSTANCE);
		return me();
	}

	public T regra(AbstractRegra<?> regra) {
		abstractRegras.add(regra);
		return me();
	}

	public boolean valido() {
		return valido(null);
	}

	public boolean valido(ResultadoCampo resultadoCampo) {
		if (resultadoCampo == null) {
			resultadoCampo = ResultadoCampoIgnorado.INSTANCE;
		}
		boolean verificacao = verificar(resultadoCampo);
		return inversa ? !verificacao : verificacao;
	}

	public boolean isInversa() {
		return inversa;
	}

	protected boolean verificar(ResultadoCampo resultadoCampo) {
		Resultado resultado = new ResultadoCampoValidavelAdapter(this, resultadoCampo);
		if (opcional && !RegraPreenchido.INSTANCE.validar(this, resultado)) {
			return true;
		}
		for (AbstractRegra<?> regra : abstractRegras) {
			if (!regra.validar(this, resultado)) {
				return false;
			}
		}
		return true;
	}

	public String getNomeObjeto() {
		return nomeObjeto;
	}
}
