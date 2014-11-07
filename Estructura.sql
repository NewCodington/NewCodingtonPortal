CREATE SCHEMA IF NOT EXISTS codingtonPortal;

CREATE  TABLE codingtonPortal.Users (
	idUser INT NOT NULL AUTO_INCREMENT,
	First_name VARCHAR(30) NOT NULL ,
	Last_name VARCHAR(30) NOT NULL ,
	DNI VARCHAR(12) NOT NULL ,
	Email VARCHAR(200) NOT NULL ,
	Phone_number VARCHAR(20) NULL ,
	Address VARCHAR(30) NULL ,
	Username VARCHAR(12) NOT NULL ,
	Password VARCHAR(30) NOT NULL ,
	isAdmin TINYINT NOT NULL DEFAULT 0 ,
	
	PRIMARY KEY (idUser) );



CREATE  TABLE codingtonPortal.Place (
	idPlace INT NOT NULL AUTO_INCREMENT ,
	Name VARCHAR(15) NOT NULL ,
	Region VARCHAR(15) NOT NULL ,
	Image BLOB NOT NULL ,
	Address VARCHAR(30) NOT NULL ,
	Description VARCHAR(1000) NOT NULL ,
	
	PRIMARY KEY (idPlace) );



CREATE  TABLE codingtonPortal.Event (
	idEvent INT NOT NULL AUTO_INCREMENT,	Name VARCHAR(45) NOT NULL ,
	Description VARCHAR(45) NULL ,
	Place VARCHAR(45) NOT NULL ,	StartTime VARCHAR(15) NOT NULL ,
	Duration VARCHAR(45) NULL ,
	Event_type VARCHAR(45) NULL ,
	Seats_avaible INT NOT NULL DEFAULT 0 ,
	PRIMARY KEY (idEvent) );


CREATE  TABLE codingtonPortal.EventRegistration (
	idEventRegistration INT NOT NULL AUTO_INCREMENT,	idUser INT NOT NULL ,
	idEvent INT NOT NULL ,
	
	PRIMARY KEY (idEventRegistration) ,
  
	CONSTRAINT Eventuser
    FOREIGN KEY (idEvent)
    REFERENCES codingtonPortal.Event (idEvent)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
	CONSTRAINT Userevent
    FOREIGN KEY (idUser)
    REFERENCES codingtonPortal.Users (idUser)
    ON DELETE CASCADE
    ON UPDATE CASCADE );