package com.generation.blogpessoal.repository;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long> {
public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}

