CREATE TABLE `tb_postagem` (
	`id_postagem` bigint NOT NULL AUTO_INCREMENT,
	`titulo` varchar(255) NOT NULL,
	`texto` varchar(2000) NOT NULL,
	`avaliacao` DECIMAL NOT NULL,
	`data` DATE NOT NULL,
	`fk_temaPost` bigint NOT NULL,
	`fk_usuarioPost` bigint NOT NULL,
	PRIMARY KEY (`id_postagem`)
);

CREATE TABLE `tb_tema` (
	`id_tema` bigint NOT NULL AUTO_INCREMENT,
	`assunto` varchar(255) NOT NULL,
	`empresa` varchar(255) NOT NULL,
	`certificacao` varchar(255) NOT NULL,
	PRIMARY KEY (`id_tema`)
);

CREATE TABLE `tb_usuario` (
	`id_usuario` bigint NOT NULL AUTO_INCREMENT,
	`usuario` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`fk_temaPost`) REFERENCES `tb_tema`(`id_tema`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`fk_usuarioPost`) REFERENCES `tb_usuario`(`id_usuario`);




