CREATE DATABASE db_pessoas2;
USE db_pessoas2;

CREATE TABLE tb_pessoa(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(200),
	fone VARCHAR(200),
	email VARCHAR(200)
);

INSERT INTO tb_pessoa (nome, fone, email) VALUES ('Jose', '11223344', 'jose@email.com');
INSERT INTO tb_pessoa (nome, fone, email) VALUES ('Joao', '22334455', 'joao@email.com');
INSERT INTO tb_pessoa (nome, fone, email) VALUES ('Maria', '00117788', 'maria@email.com');

SELECT * FROM db_pessoas2.tb_pessoa;