package com.projeto.frequencia.atividade.domain.service;

import com.projeto.frequencia.atividade.api.assembler.AlunoAssembler;
import com.projeto.frequencia.atividade.api.model.output.AlunoOutputDTO;
import com.projeto.frequencia.atividade.domain.entities.Aluno;
import com.projeto.frequencia.atividade.domain.repositories.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class AlunoService {

    private AlunoRepository alunoRepository;
    private AlunoAssembler alunoAssembler;

    @Transactional
    public Aluno cadastrar(Aluno aluno){
        Aluno novoAluno = alunoRepository.save(aluno);
        return novoAluno;
    }

    public List<AlunoOutputDTO> listar() {
        return alunoAssembler.toCollectionModel(alunoRepository.findAll());
    }
}
