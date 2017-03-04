use mysbsao;
CREATE USER 'sao-dbuser'@'localhost' IDENTIFIED BY 'saodbuser';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, EXECUTE ON *.* TO 'sao-dbuser'@'localhost';
