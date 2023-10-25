package com.generation.blogpessoal.repository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long> {

}


