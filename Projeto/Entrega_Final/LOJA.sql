CREATE DATABASE LOJA;

USE LOJA;

CREATE TABLE DADOS_CLIENTE (
ID_DADOS INT (5) NOT NULL AUTO_INCREMENT,
NOME VARCHAR(50) NOT NULL,
GENERO VARCHAR(10) NOT NULL,
DATA_DE_NASCIMENTO VARCHAR(11) NOT NULL,
CPF VARCHAR(15) NOT NULL,
IMAGEM MEDIUMBLOB,
PRIMARY KEY  (ID_DADOS)
);

CREATE TABLE CONTATO(
ID_CONTATO INT (5) NOT NULL AUTO_INCREMENT,
EMAIL VARCHAR(50) DEFAULT NULL,
TELEFONE VARCHAR(9) DEFAULT NULL,
DD_TELEFONE VARCHAR(4) NOT NULL,
CELULAR VARCHAR(10) DEFAULT NULL,
DD_CELULAR VARCHAR(4) NOT NULL,
PRIMARY KEY  (ID_CONTATO)
);

CREATE TABLE ENDERECO(
ID_ENDERECO INT (5) NOT NULL AUTO_INCREMENT,
CEP VARCHAR(9) NOT NULL,
LOGRADOURO VARCHAR(40) NOT NULL,
BAIRRO VARCHAR(40) NOT NULL,
COMPLEMENTO VARCHAR(30) NOT NULL,
NUMERO VARCHAR(4) NOT NULL,
PRIMARY KEY  (ID_ENDERECO)
);

CREATE TABLE CLIENTE  (
ID_CLIENTE INT(5) NOT NULL AUTO_INCREMENT,
ID_ENDERECO INT (11) NOT NULL,
ID_CONTATO INT (11) NOT NULL,
ID_DADOS INT (11) NOT NULL,
ATIVO TINYINT(1) NOT NULL,
PRIMARY KEY  (ID_CLIENTE),
FOREIGN KEY ID_ENDERECO (ID_ENDERECO) REFERENCES ENDERECO(ID_ENDERECO),
FOREIGN KEY ID_CONTATO (ID_CONTATO) REFERENCES CONTATO(ID_CONTATO),
FOREIGN KEY ID_DADOS (ID_DADOS) REFERENCES DADOS_CLIENTE(ID_DADOS),
UNIQUE KEY ID_CLIENTE (ID_CLIENTE)
);

CREATE TABLE PRODUTO (
ID_PRODUTO INT(5) NOT NULL AUTO_INCREMENT,
ID_MARCA INT(5) DEFAULT '0',
ID_MODELO INT(5) DEFAULT '0',
COR VARCHAR(30) NOT NULL,
GENERO VARCHAR(10) NOT NULL,
PRECO FLOAT(8,2) NOT NULL,
QUANTIDADE INT(11) NOT NULL,
TAMANHO INT(11) NOT NULL,
ATIVO TINYINT(1) NOT NULL,
IMAGEM MEDIUMBLOB,
PRIMARY KEY  (ID_PRODUTO),
FOREIGN KEY ID_MARCA (ID_MARCA) REFERENCES MARCA(ID_MARCA),
FOREIGN KEY ID_MODELO (ID_MODELO) REFERENCES MODELO(ID_MODELO),
UNIQUE KEY ID_PRODUTO (ID_PRODUTO)
);

CREATE TABLE MARCA (
ID_MARCA INT(5) NOT NULL AUTO_INCREMENT,
MARCA VARCHAR(50) NOT NULL,
PRIMARY KEY  (ID_MARCA)
);

CREATE TABLE MODELO (
ID_MODELO INT(5) NOT NULL AUTO_INCREMENT,
MODELO VARCHAR(50) NOT NULL,
PRIMARY KEY  (ID_MODELO)
);

CREATE TABLE ITENS_VENDA (
ID_LISTA INT(5) NOT NULL AUTO_INCREMENT,
ID_VENDA INT(5) NOT NULL,
ID_PRODUTO INT(5) NOT NULL,
QUANTIDADE INT(50) NOT NULL,
PRECO FLOAT(8,2) NOT NULL,
PRIMARY KEY  (ID_LISTA),
FOREIGN KEY ID_VENDA (ID_VENDA) REFERENCES VENDA(ID_VENDA),
FOREIGN KEY ID_PRODUTO (ID_PRODUTO) REFERENCES PRODUTO(ID_PRODUTO)
);

CREATE TABLE VENDA (
ID_VENDA INT(5) NOT NULL AUTO_INCREMENT,
ID_CLIENTE INT(5) NULL,
ATIVO TINYINT(1) NOT NULL,
DATA DATE NOT NULL,
TOTAL FLOAT(8,2) NOT NULL,
TOTAL_QUANTIDADE INT(5) NOT NULL,
PRIMARY KEY  (ID_VENDA),
UNIQUE KEY ID_VENDA_UNIQUE (ID_VENDA),
FOREIGN KEY ID_CLIENTE (ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE)
);


