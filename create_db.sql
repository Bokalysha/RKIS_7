CREATE DATABASE rkis;

\c rkis

CREATE TABLE IF NOT EXISTS smartphone
(
    id                  INT PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    brand               character varying(255),
    model               character varying(255),
    operating_system    character varying(255),
    storage_capacity_gb INT,
    price               NUMERIC(10, 2)
);