CREATE TABLE Persons (
    PersonID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    City varchar(255),

    PRIMARY KEY (PersonID)
);

ALTER TABLE Persons
ADD Birthday date;

ALTER TABLE Persons
ADD salary double;

INSERT INTO PERSONS  (PERSONID ,LASTNAME ,FIRSTNAME ,CITY ,BIRTHDAY ,SALARY )
VALUES('1','We','See','Dao','1984-03-02','2500.0');

INSERT INTO PERSONS  (PERSONID ,LASTNAME ,FIRSTNAME ,CITY ,BIRTHDAY ,SALARY )
VALUES('2','Sara','Se','Barcelona','1974-03-02','2500.0');

INSERT INTO PERSONS  (PERSONID ,LASTNAME ,FIRSTNAME ,CITY ,BIRTHDAY ,SALARY )
VALUES('3','We','Se','Dao','1974-08-02','2700.0');

INSERT INTO PERSONS  (PERSONID ,LASTNAME ,FIRSTNAME ,CITY ,BIRTHDAY ,SALARY )
VALUES('4','Yna','Se','Kharkiv','1998-08-06','2900.0');

UPDATE PERSONS
SET CITY ='Bangok'
WHERE PERSONID =1;

UPDATE PERSONS
SET LASTNAME  ='Verona'
WHERE PERSONID =1;

SELECT * FROM PERSONS  ;