package com.validador.regra;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegraPreenchidoTest {

	private static final String REGRA = "obrigatorio";
	private Resultado resultado;

	@Before
	public void setup() {
		resultado = mock(Resultado.class);
	}

	@After
	public void validate() {
		validateMockitoUsage();
	}

	@Test
	public void preenchidoInvalidoNulo() {
		assertFalse(RegraPreenchido.INSTANCE.validar((String) null, resultado));
		verify(resultado).erro(REGRA);
	}

	@Test
	public void preenchidoInvalidoBranco() {
		assertFalse(RegraPreenchido.INSTANCE.validar("", resultado));
		verify(resultado).erro(REGRA);
	}

	@Test
	public void preenchidoInvalidoEspacosEnterTabs() {
		assertFalse(RegraPreenchido.INSTANCE.validar(" \t\r\n ", resultado));
		verify(resultado).erro(REGRA);
	}

	@Test
	public void preenchidoValido() {
		assertTrue(RegraPreenchido.INSTANCE.validar("Ok", resultado));
		verifyNoMoreInteractions(resultado);
	}

}
