package com.projeto.frequencia.atividade.api.assembler;

import com.projeto.frequencia.atividade.api.model.input.AlunoInputDTO;
import com.projeto.frequencia.atividade.api.model.output.AlunoOutputDTO;
import com.projeto.frequencia.atividade.domain.entities.Aluno;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class AlunoAssembler {

    private ModelMapper modelMapper;

    public AlunoOutputDTO toModel(Aluno aluno){
        return modelMapper.map(aluno, AlunoOutputDTO.class);
    }

    public Aluno toEntity(AlunoInputDTO alunoInputDTO){
        return modelMapper.map(alunoInputDTO, Aluno.class);
    }

    public List<AlunoOutputDTO> toCollectionModel(List<Aluno> alunos){
        return alunos.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
