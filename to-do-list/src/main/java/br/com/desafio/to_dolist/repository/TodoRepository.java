package br.com.desafio.to_dolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.to_dolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
