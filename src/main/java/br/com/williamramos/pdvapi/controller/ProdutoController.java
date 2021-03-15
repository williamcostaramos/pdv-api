package br.com.williamramos.pdvapi.controller;

import br.com.williamramos.pdvapi.domain.model.Produto;
import br.com.williamramos.pdvapi.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	ProdutoRepository repository;

	@GetMapping()
	public String getproduto() {
		return "Olá Mundo";
	}

	@PostMapping("/produto")
	public Produto create(@RequestBody Produto produto) {
		return repository.save(produto);
	}

}
