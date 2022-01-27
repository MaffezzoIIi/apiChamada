package com.projeto.frequencia.atividade.api.controller;

import com.projeto.frequencia.atividade.api.assembler.AlunoAssembler;
import com.projeto.frequencia.atividade.api.model.input.AlunoInputDTO;
import com.projeto.frequencia.atividade.api.model.output.AlunoOutputDTO;
import com.projeto.frequencia.atividade.domain.entities.Aluno;
import com.projeto.frequencia.atividade.domain.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoAssembler alunoAssembler;
    private AlunoService alunoService;

    @PostMapping
    public AlunoOutputDTO cadastrar(@RequestBody AlunoInputDTO alunoInputDTO){
        Aluno novoAluno = alunoAssembler.toEntity(alunoInputDTO);
        Aluno aluno = alunoService.cadastrar(novoAluno);
        return alunoAssembler.toModel(aluno);
    }

    @GetMapping
    public List<AlunoOutputDTO> listar(){
        return alunoService.listar();
    }
}
