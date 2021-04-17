package br.com.caelum.estoque.ws.exeption;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name = "AutorizacaoFault")
public class AutorizacaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public AutorizacaoException(String msg) {
		super(msg);
	}

	public InfoFault getFaultInfo() {
		// InfoFault exibe uma mensagem mais agradavel para o usario
		return new InfoFault("Token invalido", new Date());
	}

}