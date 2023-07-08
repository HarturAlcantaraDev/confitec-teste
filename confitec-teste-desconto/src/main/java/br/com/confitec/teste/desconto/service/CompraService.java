package br.com.confitec.teste.desconto.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.confitec.teste.desconto.util.Constantes;

@Service
public class CompraService {

	public ResponseEntity<String> calcularValorComDesconto(Double valorTotal, Integer quantidadeParcelas) {
		Double desconto;

	    try {
	        if (quantidadeParcelas == 1) {
	            desconto = 0.1;
	        } else if (quantidadeParcelas == 2) {
	            desconto = 0.08;
	        } else if (quantidadeParcelas == 3) {
	            desconto = 0.06;
	        } else if (quantidadeParcelas == 4) {
	            desconto = 0.04;
	        } else if (quantidadeParcelas == 5) {
	            desconto = 0.02;
	        } else {
	            desconto = 0.0;
	        }

	        Double valorComDesconto = valorTotal - (valorTotal * desconto);
	        return ResponseEntity.ok(Constantes.MENSAGEM_SUCESSO.getMensagem()+ valorComDesconto);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constantes.MENSAGEM_ERROR.getMensagem());
	    }
	}

}

