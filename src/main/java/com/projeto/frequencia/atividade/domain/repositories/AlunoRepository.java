package com.projeto.frequencia.atividade.domain.repositories;

import com.projeto.frequencia.atividade.domain.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
