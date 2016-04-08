--tworzenie baz do projektu (Postgresql)

CREATE TABLE dish
(
  dishid SERIAL PRIMARY KEY,
  nazwa TEXT,
  cena INTEGER,
  wersja TEXT
);

CREATE TABLE dishorder (
  orderid SERIAL PRIMARY KEY,
  dishid int not NULL,
  personid int NOT NULL,
  liczba int NOT NULL,
  wykonany BOOL
);

CREATE TABLE person (
  personid SERIAL PRIMARY KEY,
  name TEXT
);

ALTER TABLE dishorder add FOREIGN KEY(dishid) REFERENCES dish(dishid) on DELETE CASCADE;
ALTER TABLE dishorder add FOREIGN KEY(personid) REFERENCES person(personid) on DELETE CASCADE;
