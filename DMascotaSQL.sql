ALTER TABLE `registroveterinario`.`datosmascota` 
ADD CONSTRAINT `fk_mascota`
  FOREIGN KEY ()
  REFERENCES `registroveterinario`.`datosmascota` ()
  ON DELETE CASCADE
  ON UPDATE CASCADE;
