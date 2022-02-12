-- Gill Art Gallery History form

START TRANSACTION;

DROP TABLE IF EXISTS purchase;
DROP TABLE IF EXISTS art;
DROP TABLE IF EXISTS artist;
DROP TABLE IF EXISTS customer;

-- Customer Table
-- customer_id (PK), name, address, phone number
CREATE TABLE customer(
    customer_id SERIAL NOT NULL, 
    name varchar(50) NOT NULL,
    address varchar(80) NOT NULL,
    phone varchar(15) NULL,
    
    CONSTRAINT pk_customer PRIMARY KEY(customer_id)
  );
  
  -- artist table
  CREATE TABLE artist(
      artist_id SERIAL NOT NULL,
      first_name varchar(30),
      last_name varchar(30) NOT NULL,
      
      CONSTRAINT pk_artist PRIMARY KEY (artist_id)
  );
  
  -- art table
  CREATE TABLE art(
     art_id SERIAL NOT NULL,
     title varchar(100),
     artist_id int NOT NULL, -- foreign key to the artist table
     
     CONSTRAINT pk_art PRIMARY KEY (art_id)
     CONSTRAINT fk_art_artist FOREIGN KEY (artist_id) REFERENCES artist(artist_id)
     );
     
   CREATE TABLE purchases(
       purchase_id SERIAL NOT NULL,
       customer_id int NOT NULL,
       art_id int NOT NULL,
       purchase_date timestamp NOT NULL;
       sale_price money NOT NULL,
       
       CONSTRAINT pk-purchase PRIMARY KEY (purchase_id)
   ); 
   
   ALTER TABLE purchase
       ADD CONSTRAINT fk_purchase_customer FOREIGN KEY (customer_id ) REFERENCES customer(customer_id);
       
   ALTER TABLE purchase
       ADD CONSTRAINT fk_purchase_art FOREIGN KEY (art_id) REFERENCES art(art_id);
  
  