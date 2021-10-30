DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id bigint NOT NULL AUTO_INCREMENT,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  email varchar(45) NOT NULL,
  username varchar(45) NOT NULL,
  password varchar(300) NOT NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS role;

CREATE TABLE role (
  id bigint NOT NULL AUTO_INCREMENT,
  role varchar(45) NOT NULL,
  user_id bigint DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES user(id)
);