package br.com.pliniocanto.estudos.spring.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.pliniocanto.estudos.spring.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
