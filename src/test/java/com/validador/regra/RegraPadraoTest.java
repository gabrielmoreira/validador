package com.validador.regra;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegraPadraoTest {

	private static final String REGRA = "estaNoPadrao";
	private static final String REGRA_CONTEM = "contemPadrao";
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
	public void padraoValido() {
		RegraPadrao padrao = RegraPadrao.padrao("foo[0-9]{4}");
		assertTrue(padrao.validar("foo1337", resultado));
		verifyNoMoreInteractions(resultado);
	}

	@Test
	public void padraoValidoDotAll() {
		RegraPadrao padrao = RegraPadrao.padrao("foo[0-9]{4}.", Pattern.DOTALL);
		assertTrue(padrao.validar("foo1337\n", resultado));
		verifyNoMoreInteractions(resultado);
	}

	@Test
	public void padraoValidoDotAll2() {
		RegraPadrao padrao = new RegraPadrao(Pattern.compile("foo[0-9]{4}.", Pattern.DOTALL), false);
		assertTrue(padrao.validar("foo1337\n", resultado));
		verifyNoMoreInteractions(resultado);
	}

	@Test
	public void padraoInvalido() {
		RegraPadrao padrao = RegraPadrao.padrao("foo[0-9]{4}");
		assertFalse(padrao.validar("1337", resultado));
		verify(resultado).erro(REGRA, "1337", "foo[0-9]{4}");
	}

	@Test
	public void padraoInvalido2() {
		RegraPadrao padrao = RegraPadrao.padrao("[0-9]{4}");
		assertFalse(padrao.validar("foo1337", resultado));
		verify(resultado).erro(REGRA, "foo1337", "[0-9]{4}");
	}

	@Test
	public void padraoContemValido() {
		RegraPadrao padrao = RegraPadrao.contemPadrao("[0-9]{4}");
		assertTrue(padrao.validar("foo1337", resultado));
		verifyNoMoreInteractions(resultado);
	}

	@Test
	public void padraoContemValidoDotAll() {
		RegraPadrao padrao = RegraPadrao.contemPadrao("[0-9]{4}.", Pattern.DOTALL);
		assertTrue(padrao.validar("foo1337\n", resultado));
		verifyNoMoreInteractions(resultado);
	}

	@Test
	public void padraoContemInvalido() {
		RegraPadrao padrao = RegraPadrao.contemPadrao("[0-9]{4}");
		assertFalse(padrao.validar("foo133", resultado));
		verify(resultado).erro(REGRA_CONTEM, "foo133", "[0-9]{4}");
	}

	@Test
	public void padraoPatternValido() {
		RegraPadrao padrao = RegraPadrao.padrao(Pattern.compile("foo[0-9]{4}"));
		assertTrue(padrao.validar("foo1337", resultado));
		verifyNoMoreInteractions(resultado);
	}

}
