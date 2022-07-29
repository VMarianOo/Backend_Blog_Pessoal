package com.blogpessoal.generation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.generation.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	

}