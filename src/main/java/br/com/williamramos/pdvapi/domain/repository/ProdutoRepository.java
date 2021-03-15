package br.com.williamramos.pdvapi.domain.repository;

import br.com.williamramos.pdvapi.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
