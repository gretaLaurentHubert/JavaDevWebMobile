create database demojava ;
CREATE USER 'demouser'@'%' IDENTIFIED BY 'MotDePasse';
GRANT ALL PRIVILEGES ON demojava.* TO "demouser"@"%" IDENTIFIED BY "MotDePasse";
create table personne (nom varchar(64), prenom varchar(64), dnaissance date);
insert into personne values ('Luther King','Martin','1929-01-15');
