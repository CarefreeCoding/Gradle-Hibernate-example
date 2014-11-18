DROP DATABASE IF EXISTS gradle_hibernate_example;

CREATE DATABASE IF NOT EXISTS gradle_hibernate_example;

USE gradle_hibernate_example;

DROP TABLE IF EXISTS example_object;

CREATE TABLE IF NOT EXISTS example_object
(
  id   INTEGER      NOT NULL AUTO_INCREMENT,
  name VARCHAR(256) NOT NULL,
  PRIMARY KEY (id)
);
