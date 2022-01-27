package com.projeto.frequencia.atividade.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    private int matricula;

    private String nome;
}
