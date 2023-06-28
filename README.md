CREATE TABLE `Prueba`.`cliente` (`id` BIGINT NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(30) NOT NULL , `apellido` VARCHAR(30) NOT NULL , `edad` INT(4) NOT NULL , `usuario` VARCHAR(25) NOT NULL , `password` VARCHAR(25) NOT NULL , `telefono` VARCHAR(25) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

INSERT INTO `cliente` (`id`, `nombre`, `apellido`, `edad`, `usuario`, `password`, `telefono`) VALUES (null,"Gianluca","Zoni",14,"gzoni","12345","261234513");

INSERT INTO `cliente` (`id`, `nombre`, `apellido`, `telefono`, `email`, `password`, `telefono`) VALUES (null,"Mariela","Caif",45,"mcaif","12345","261543442");






CREATE TABLE `prueba`.`usuario` (`id` BIGINT NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(30) NOT NULL , `apellido` VARCHAR(30) NOT NULL , `email` VARCHAR(40) NOT NULL , `contra` VARCHAR(25) NOT NULL , `telefono` VARCHAR(25) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

INSERT INTO `usuario` (`id`, `nombre`, `apellido`, `telefono`, `email`, `contra`) VALUES (null,"Walter","Yudica","26345665","wy@gmail.com","2344");

INSERT INTO `usuario` (`id`, `nombre`, `apellido`, `telefono`, `email`, `contra`) VALUES (null,"Candy","Zoni","261398765","candi@gmail.com","432244");
