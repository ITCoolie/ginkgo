# ginkgo database

USE DATABASE db_ginkgo;

LOCK TABLES `tb_user` WRITE;

INSERT INTO `tb_user` (`id`, `name`, `password`, `nickname`, `status`, `photo`, `phone`)
VALUES
  (1,'fish','xxxxxx','fish',0,'','+8618600000000');

INSERT INTO `tb_template` (`id`, `name`, `width`, `height`, `status`, `comment`)
VALUES
  (1,'两图一文模板', 400, 200, 0, '',);

INSERT INTO `tb_creative` (`id`, `name`, `data`, `template_id`, `author`, `status`)
VALUES
  (1,'制服创意', '', 1, 'fish', 0);

UNLOCK TABLES;