CREATE DATABASE db_onda4pp;

USE db_onda4pp;

CREATE TABLE `tb_postagem` (
	`id_postagem` bigint NOT NULL AUTO_INCREMENT,
	`titulo` varchar(255) NOT NULL,
	`texto` varchar(1000) NOT NULL,
	`avaliacao` DECIMAL(3,2) NOT NULL,
	`data` DATE NOT NULL,
	`empresa` varchar(255) NOT NULL,
	`imagem` varchar(255) NOT NULL,
	`fk_temaPostagem` bigint NOT NULL,
	`fk_usuarioPostagem` bigint NOT NULL,
	PRIMARY KEY (`id_postagem`)
);

CREATE TABLE `tb_tema` (
	`id_tema` bigint NOT NULL AUTO_INCREMENT,
	`titulo` varchar(255) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`imagem` varchar(255) NOT NULL,
	PRIMARY KEY (`id_tema`)
);

CREATE TABLE `tb_usuario` (
	`id_usuario` bigint NOT NULL AUTO_INCREMENT,
	`usuario` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`fk_temaPostagem`) REFERENCES `tb_tema`(`id_tema`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`fk_usuarioPostagem`) REFERENCES `tb_usuario`(`id_usuario`);