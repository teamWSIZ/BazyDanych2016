CREATE table host
(
  hostid SERIAL PRIMARY KEY,
  name TEXT,
  comment TEXT
);

CREATE TABLE hostgroup (
  hostgroupid SERIAL PRIMARY KEY,
  name TEXT,
  comment TEXT
);

CREATE table endpointtype (
  endpointtypeid SERIAL PRIMARY KEY,
  name TEXT,
  comment TEXT
);


CREATE table action (
  actionid SERIAL PRIMARY KEY,
  comment text,
  scriptname TEXT
);

CREATE TABLE endpoint (
  endpointid SERIAL PRIMARY KEY,
  ip TEXT,
  port int,
  hostid int,
  endpointtypeid int,
  comment TEXT
)
