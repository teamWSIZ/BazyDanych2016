DROP TABLE IF EXISTS snapshot;
DROP TABLE IF EXISTS transfer;
DROP TABLE IF EXISTS persona;

CREATE TABLE persona
(
  personid SERIAL PRIMARY KEY ,
  pass TEXT,
  name TEXT,
  money INTEGER
);

CREATE TABLE transfer
(
  transferid SERIAL PRIMARY KEY ,
  personid INTEGER,
  amount INTEGER,
  timestamp TIMESTAMP DEFAULT now() NOT NULL,
  CONSTRAINT transfer_personid_fkey FOREIGN KEY (personid) REFERENCES persona (personid)
);

CREATE TABLE snapshot
(
  snapid SERIAL PRIMARY KEY ,
  timestamp TIMESTAMP,
  text TEXT
);