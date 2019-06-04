CREATE TABLE `datosdueño` (
  `iddatosdueño` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(12) COLLATE utf8_bin NOT NULL,
  `appaterno` varchar(12) COLLATE utf8_bin NOT NULL,
  `apmaterno` varchar(12) COLLATE utf8_bin NOT NULL,
  `tel` int(11) NOT NULL,
  `id_mascota` int(11) NOT NULL,
  PRIMARY KEY (`iddatosdueño`),
  KEY `fk_datosmascota_idx` (`id_mascota`),
  CONSTRAINT `fk_datosmascota` FOREIGN KEY (`id_mascota`) REFERENCES `datosmascota` (`iddatosmascota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin