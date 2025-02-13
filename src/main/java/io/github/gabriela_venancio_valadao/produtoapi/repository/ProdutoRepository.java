package io.github.gabriela_venancio_valadao.produtoapi.repository;
import io.github.gabriela_venancio_valadao.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome (String nome);
}
