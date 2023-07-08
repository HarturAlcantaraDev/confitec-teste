package br.com.confitec.teste.desconto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.confitec.teste.desconto.service.CompraService;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
	CompraService compraService;

    @GetMapping("/{valorTotal}/{quantidadeParcelas}")
    public ResponseEntity<String>  calcularValorComDesconto(@PathVariable Double valorTotal, @PathVariable Integer quantidadeParcelas) {
        return compraService.calcularValorComDesconto(valorTotal, quantidadeParcelas);
    }
}

