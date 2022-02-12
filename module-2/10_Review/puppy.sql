DROP TABLE IF EXISTS puppy;

CREATE TABLE puppy (
        puppy_id SERIAL PRIMARY KEY,
        puppy_name varchar(30),
        weight int,
        gender varchar (10),
        breed varchar (50),
        paper_trained boolean
        );
 INSERT INTO puppy (puppy_name, weight, gender, breed, paper_trained)
        VALUES ( 'Snoopy', 25, 'male', 'Beagle', true);
 INSERT INTO puppy (puppy_name, weight, gender, breed, paper_trained)
        VALUES ( 'Clifford', 2500, 'male', 'Red Labrador', true);
  INSERT INTO puppy (puppy_name, weight, gender, breed, paper_trained)
        VALUES ( 'Katy', 45, 'female', 'Pit mix', false);
 INSERT INTO puppy (puppy_name, weight, gender, breed, paper_trained)
        VALUES ( 'Proton', 35, 'male', 'Red Labrador', true);
  INSERT INTO puppy (puppy_name, weight, gender, breed, paper_trained)
        VALUES ( 'Webster', 102, 'male', 'Yellow Labrador', false);
        
     SELECT * FROM puppy;