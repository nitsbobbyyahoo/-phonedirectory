DROP TABLE IF EXISTS person;

CREATE TABLE person (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  phone_number VARCHAR(15) NOT NULL
);

INSERT INTO person (name, phone_number)
VALUES
  ('Aliko', '0015235235235'),
  ('Bill', '09009009000'),
  ('Folrunsho', '073258568');