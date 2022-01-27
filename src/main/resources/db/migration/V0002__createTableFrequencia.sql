CREATE TABLE frequencia(
    id BIGINT NOT NULL AUTO_INCREMENT,
    presente BOOLEAN,
    matricula int,

    PRIMARY KEY(id)
);

ALTER TABLE frequencia ADD CONSTRAINT fk_matricula FOREIGN KEY(matricula) REFERENCES aluno(matricula);