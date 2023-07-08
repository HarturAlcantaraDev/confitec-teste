package br.com.confitec.teste.desconto.util;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Constantes {

	MENSAGEM_SUCESSO("O valor com desconto é de R$"), MENSAGEM_ERROR("Erro ao calcular o valor com desconto.");

	private final String mensagem;

	public String getMensagem() {
		return mensagem;
	}

}
