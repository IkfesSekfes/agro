use projetopp;
select * from proprietario;
Versão com Cascate

CREATE TABLE proprietario (
    id_proprietario INT PRIMARY KEY AUTO_INCREMENT,
    nome_proprietario VARCHAR(75) NOT NULL,
    cpf VARCHAR(15) NOT NULL,
    matricula VARCHAR(25) NOT NULL,
    car VARCHAR(20) NOT NULL,
    ccir VARCHAR(20) NOT NULL,
    nirf VARCHAR(20) NOT NULL
);

CREATE TABLE propriedade (
    id_propriedade INT PRIMARY KEY AUTO_INCREMENT,
    nome_propriedade VARCHAR(75) NOT NULL, 
    numero_propriedade VARCHAR(40) NOT NULL,
    rua_propriedade VARCHAR(45) NOT NULL,
    bairro_propriedade VARCHAR(45) NOT NULL,
    id_proprietario INT NOT NULL,
    FOREIGN KEY (id_proprietario)
        REFERENCES proprietario(id_proprietario)
        ON DELETE CASCADE
);
