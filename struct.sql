CREATE SCHEMA IF NOT EXISTS codington;

CREATE  TABLE codington.Users (
	idUser INT NOT NULL AUTO_INCREMENT,
	First_name VARCHAR(30) NOT NULL ,
	Last_name VARCHAR(30) NOT NULL ,
	DNI VARCHAR(12) NOT NULL ,
	Email VARCHAR(200) NOT NULL ,
	Phone_number VARCHAR(20) NULL ,
	Address VARCHAR(30) NULL ,
	Username VARCHAR(12) NOT NULL UNIQUE,
	Password VARCHAR(30) NOT NULL ,
	isAdmin TINYINT NOT NULL DEFAULT 0 ,
	
	PRIMARY KEY (idUser) );



CREATE  TABLE codington.Typeplace (
	idTypePlace INT NOT NULL AUTO_INCREMENT ,
	Name VARCHAR(30) NOT NULL ,
	Description VARCHAR(500) NOT NULL,
	PRIMARY KEY (idTypePlace) );



CREATE  TABLE codington.Place (
	idPlace INT NOT NULL AUTO_INCREMENT ,
	Name VARCHAR(15) NOT NULL ,
	Region VARCHAR(15) NOT NULL ,
  	TypePlace INT NOT NULL,
	Image BLOB NULL ,
	Address VARCHAR(30) NULL ,
	Description VARCHAR(1000) NULL ,
	PRIMARY KEY (idPlace),
	CONSTRAINT typetoPlace
    	FOREIGN KEY (TypePlace)
   	 REFERENCES codington.TypePlace (idTypePlace)
    	ON DELETE CASCADE
    	ON UPDATE CASCADE);



CREATE  TABLE codington.Event (
	idEvent INT NOT NULL AUTO_INCREMENT,
	Name VARCHAR(45) NOT NULL ,
	Description VARCHAR(45) NULL ,
	Place INT NOT NULL ,
	StartTime VARCHAR(15) NOT NULL ,
	Duration VARCHAR(45) NULL ,
	Event_type VARCHAR(45) NULL ,
	Seats_available INT NOT NULL DEFAULT 0 ,
	PRIMARY KEY (idEvent),
	CONSTRAINT PlaceToEvent
	FOREIGN KEY (Place)
	REFERENCES codington.Place (idPlace)
	ON DELETE CASCADE
	ON UPDATE CASCADE );




CREATE  TABLE codington.EventRegistration (
	idEventRegistration INT NOT NULL AUTO_INCREMENT,
	
	idUser INT NOT NULL ,
	idEvent INT NOT NULL ,
	
	PRIMARY KEY (idEventRegistration) ,
  
	CONSTRAINT Eventuser
    FOREIGN KEY (idEvent)
    REFERENCES codington.Event (idEvent)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

	CONSTRAINT Userevent
    FOREIGN KEY (idUser)
    REFERENCES codington.Users (idUser)
    ON DELETE CASCADE
    ON UPDATE CASCADE );