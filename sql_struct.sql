/*-- Defines the database if does not exist --*/
CREATE SCHEMA IF NOT EXISTS codington;



/*-- Create the table Visitor in the new Schema --*/
CREATE  TABLE codington.Visitor (
	idVisitor INT NOT NULL AUTO_INCREMENT,
	First_name VARCHAR(30) NOT NULL ,
	Last_name VARCHAR(30) NOT NULL ,
	DNI VARCHAR(12) NOT NULL ,
	Email VARCHAR(200) NOT NULL ,
	Phone_number VARCHAR(20) NULL ,
	Address VARCHAR(30) NULL ,
	Username VARCHAR(12) NOT NULL UNIQUE,
	Password VARCHAR(30) NOT NULL ,
	isAdmin TINYINT NOT NULL DEFAULT 0 ,
	PRIMARY KEY (idVisitor) );


	
/*-- Create the table TypePlace in the new Schema --*/
CREATE  TABLE codington.TypePlace (
	idTypePlace INT NOT NULL AUTO_INCREMENT ,
	Name VARCHAR(30) NOT NULL ,
	Description VARCHAR(500) NOT NULL,
	PRIMARY KEY (idTypePlace) );
	
	
	
/*-- Create the table RegionPlace in the new Schema --*/
CREATE  TABLE codington.RegionPlace (
	idRegionPlace INT NOT NULL AUTO_INCREMENT ,
	Name VARCHAR(30) NOT NULL ,
	Description VARCHAR(500) NOT NULL,
	PRIMARY KEY (idRegionPlace) );

	
	
/*-- Create the table Place in the new Schema --*/
CREATE  TABLE codington.Place (
	idPlace INT NOT NULL AUTO_INCREMENT ,
	Name VARCHAR(50) NOT NULL ,
	Region INT NOT NULL ,
  	TypePlace INT NOT NULL,
	Image BLOB NULL ,
	Address VARCHAR(30) NULL ,
	Description VARCHAR(1000) NULL ,
	PRIMARY KEY (idPlace),
	
	CONSTRAINT typeToPlace
    	FOREIGN KEY (TypePlace)
   	 REFERENCES codington.TypePlace (idTypePlace)
    	ON DELETE CASCADE
    	ON UPDATE CASCADE,
		
	CONSTRAINT regionToPlace
    	FOREIGN KEY (Region)
   	 REFERENCES codington.RegionPlace (idRegionPlace)
    	ON DELETE CASCADE
    	ON UPDATE CASCADE);


		
/*-- Create the table Event in the new Schema --*/
CREATE  TABLE codington.Event (
	idEvent INT NOT NULL AUTO_INCREMENT,
	Name VARCHAR(45) NOT NULL ,
	Description VARCHAR(45) NULL ,
	Place INT NOT NULL ,
	Date_event DATE NULL,
	StartTime VARCHAR(15) NOT NULL ,
	Duration VARCHAR(45) NULL ,
	Event_type VARCHAR(45) NULL ,
	Seats_available INT NOT NULL DEFAULT 0 ,
	PRIMARY KEY (idEvent),
	
	CONSTRAINT placeToEvent
		FOREIGN KEY (Place)
	REFERENCES codington.Place (idPlace)
		ON DELETE CASCADE
		ON UPDATE CASCADE );



/*-- Create the table EventRegistration in the new Schema --*/
CREATE  TABLE codington.EventRegistration (
	idEventRegistration INT NOT NULL AUTO_INCREMENT,
	idVisitorR INT NOT NULL ,
	idEventR INT NOT NULL ,
	PRIMARY KEY (idEventRegistration) ,
  
	CONSTRAINT EventToVisitor
		FOREIGN KEY (idEventR)
    REFERENCES codington.Event (idEvent)
		ON DELETE CASCADE
		ON UPDATE CASCADE,

	CONSTRAINT visitorToEvent
		FOREIGN KEY (idVisitorR)
    REFERENCES codington.Visitor (idVisitor)
		ON DELETE CASCADE
		ON UPDATE CASCADE );