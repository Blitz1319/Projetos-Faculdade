-- Active: 1708989823006@@127.0.0.1@3306
CREATE DATABASE exemplo1;

USE exemplo1;

CREATE TABLE cidade(
id INT,
cidade VARCHAR(30),
PRIMARY KEY(id)
);

CREATE TABLE pessoa(
cod INT,
nome VARCHAR(40),
id INT,
PRIMARY KEY(cod),
FOREIGN KEY(id) REFERENCES cidade(id) ON DELETE RESTRICT
);

-- Inserindo dados

insert into cidade values(101, 'João Pessoa');
insert into cidade values(102, 'Recife');
insert into cidade values(103, 'Natal');
insert into cidade values(104, 'Patos');

insert into pessoa values (1, 'Maria', 101);
insert into pessoa(cod,nome) values(2,'João');
insert into pessoa(id,cod,nome) values(101,3,'Pedro');
insert into pessoa values(4,'Ana',104);
insert into pessoa(cod,nome) values(5,'Sophia');

-- Apagando item referenciado

delete from cidade where id=101;
delete from cidade where id=102; -- item não referenciado
delete from cidade where id=104;

-- Alterando tabelas

alter table cidade add column uf char(2);
alter table cidade MODIFY uf varchar(2);
alter table cidade drop column uf;

-- Atualizando dados

update pessoa set id = 101 where nome = 'João';
update pessoa set id = 103 where nome = 'Sophia';

-- Visualizar dados na tabela

select * from cidade;

select * from pessoa;