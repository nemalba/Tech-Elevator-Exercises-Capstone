-- MeetUps

START TRANSACTION;

DROP TABLE IF EXISTS member; -- must be dropped in the correct order!
DROP TABLE IF EXISTS interestGroup;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS member_event;
DRO TABLE IF EXISTS member_interestGroup;
--DROP TABLE IF EXISTS member_group;


--create member table
-- member_id (PK), first_name, last_name, email_address, phone number , dob
CREATE TABLE member (
    member_id SERIAL NOT NULL, 
    first_name varchar(20) NOT NULL,
    last_name varchar(50) NOT NULL,
    email_address varchar(20) NOT NULL,
    phone varchar(15) NULL,
    dob date NULL,
    
    CONSTRAINT pk_member PRIMARY KEY (member_id) -- pk_member is what postgres will keep track of the serial number
 );

-- create interestGroup table
-- 
CREATE TABLE interestGroup (
    group_id SERIAL NOT NULL,
    group_name varchar(50)  NOT NULL,
    
   CONSTRAINT pk_interestGroup PRIMARY KEY (group_id),
   
);



-- create event table
CREATE TABLE event (
   event_id SERIAL NOT NULL,
   startDateTime timestamp NOT NULL,
   duration int NOT NULL,   
   group_id int NOT NULL,
   description varchar(200) NOT NULL,
   
    CONSTRAINT CHK_duration CHECK (duration >= 30),
   CONSTRAINT pk_event PRIMARY KEY (event_id),
   CONSTRAINT fk_event_interestGroup FOREIGN KEY (group_id) REFERENCES interestGroup(group_id) -- 
  
);

-- create member_event table
CREATE TABLE member_event (
  member_id int NOT NULL,
  event_id int NOT NULL,
  reminder boolean,
      
  CONSTRAINT pk_member_event PRIMARY KEY (member_id, event_id),
       CONSTRAINT fk_event_member_event FOREIGN KEY (event_id) REFERENCES event (event_id),
       CONSTRAINT fk_member_member_event FOREIGN KEY (member_id) REFERENCES member (member_id) 
); 
 
-- create the member_interestGroup 

  CREATE TABLE member_interestGroup (
  member_id int NOT NULL,
 group_id int NOT NULL,
  
      
CONSTRAINT pk_member_interestGroup PRIMARY KEY (member_id, group_id),
CONSTRAINT fk_member_member_interestGroup FOREIGN KEY (member_id) REFERENCES member (member_id),
 CONSTRAINT fk_interestGroup_member_interestGroup FOREIGN KEY (group_id) REFERENCES interestGroup (group_id)
); 
 
 --------------------
 -- Insert 8 records into the members table
 INSERT INTO member(first_name, last_name, email_address, phone)
 VALUES('Rey', 'Jones', 'nba@gmail.com','954-234-44-65'), 
        ('Alida', 'Smith', 'ali@gmail.com','924-234-44-75'),
        ('Od', 'Ty', 'od@gmail.com','254-234-34-78'),
        ('Sam', 'Jones', 'sam@gmail.com','754-234-22-23'), 
        ('Grace', 'Kerry', 'gracei@gmail.com','945-267-14-25'),
        ('Matt', 'Grant', 'matt@gmail.com','457-566-34-32')
 ;
 
 -- insert 4 groups
 INSERT INTO interestGroup( group_name)
 VALUES('Java Meetups - Pittsburgh'), 
        ('Full Stack Developer Meetups - Pittsburgh'),
        ('Coder - Pittsburgh'),
        ('Web Developer Meetups - Pittsburgh')
        
 ;
 
 -- insert 4 events
 INSERT INTO event( startDateTime, duration, group_id, description  )
 VALUES('2021-12-18 11:30:00-00', 60, 1, 'Virtual Hackaton'), 
        ('2021-12-19 10:30:00-00', 60, 2, 'Code & Coffee'),
        ('2021-12-20 09:30:00-00', 60, 3, '2 Lectures'),
        ('2021-12-22 09:30:00-00', 60, 4, 'JavaScript 1')
        
 ;
 
 -- insert at least 1 member for each event
 INSERT INTO member_event(member_id, event_id)
VALUES (3, 1), (4,2), (5, 3), (6,4)
;
 
 --each group has at least two members
  INSERT INTO member_interestgroup(member_id, group_id)
VALUES (3, 1), (4,2), (5, 3), (6,4), (4, 1), (5,2), (6, 3), (7,4)
;
 
COMMIT;

ROLLBACK;
 