-- 1. Add a new person to the person table with the name "Lisa Byway" with the birthday of 4/15/1984 (1 ro


--BEGIN TRANSACTION;
INSERT INTO person (person_name, birthday) VALUES('Lisa Byway', '04/15/1984');
--ROLLBACK;

