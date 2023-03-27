create database usuarios;

CREATE USER 'usuario'@'localhost' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON database.usuarios  TO 'usuario'@'local
host' WITH GRANT OPTION;

FLUSH PRIVILEGES;


