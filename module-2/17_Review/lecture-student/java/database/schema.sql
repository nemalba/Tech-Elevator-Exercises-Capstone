BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS pokemon;

DROP SEQUENCE IF EXISTS seq_user_id;
DROP SEQUENCE IF EXISTS seq_pokemon_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  START WITH 1001
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE SEQUENCE seq_pokemon_id
  INCREMENT BY 1
  START WITH 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id),
	CONSTRAINT UQ_username UNIQUE (username)
);

CREATE TABLE pokemon (
	pokemon_id int DEFAULT nextval('seq_pokemon_id'::regclass) NOT NULL,
	id int NOT NULL,
	name varchar(30) NOT NULL,
	url varchar(60),
	base_experience int NOT NULL,
	height int NOT NULL,
	is_default boolean,
	weight int NOT NULL,
	CONSTRAINT pk_pokemon_id PRIMARY KEY (pokemon_id)
);


COMMIT TRANSACTION;
