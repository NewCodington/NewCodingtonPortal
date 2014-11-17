/*-- Insert users into database --*/

INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Jhon', 'Smith', '03.652.105-G', 'jhon.Smith@accenture.com', '9653257956', 'La finca,1, New Codington', 'JhonS', 'jhons6', 1);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Peter', 'Pan', '08.512.254-T', 'Peter.Pan12@gmail.com', '6945269854', 'Puy Chemin,12,New Codington', 'PeterP', 'peterp6', 0);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Mary', 'Strawberry', '36.592.561-K', 'mary.1980@gmail.com', '3695245865', 'Gosfort,2,New Codington', 'MaryS', 'marys6', 0);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Sophie', 'Henorable', '69.021.548-C', 'sophie.hwc@gmail.com', '8654102356', 'TheoBald,3,New Codington', 'SophieH', 'sophieh6', 0);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Edgar', 'Davis', '65.351.548-S', 'edgard@gmail.com', '2654821568', 'High Holbon,16,New Codington', 'EdgarD', 'edgard6', 0);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Pular', 'Hons', '68.231.558-B', 'pularhons@gmail.com', '6524894521', 'Farrington,23,New Codington', 'PularH', 'pularh6', 0);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Pietrus', 'Titur', '78.354.768-R', 'pietrusTitur@gmail.com', '7568210350', 'Clerkenwell,111,New Codington', 'PietrusT', 'pietrust6', 0);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Gerrard', 'Steven', '70.321.584-G', 'gerrardSteve@gmail.com', '7564182035', 'RosvertyAve,58,New Codington', 'GerrardS', 'gerrards6', 0);
INSERT INTO codington.visitor(First_name, Last_name, DNI, Email, Phone_number, Address,Username, Password, isAdmin) VALUES ('Frank', 'Lompart', '50.211.232-R', 'frankLp@gmail.com', '6920168453', 'Percival St,65,New Codington', 'FrankL', 'frankl6', 0);



/*-- Insert type of places into database --*/

INSERT INTO codington.typeplace(Name, Description) VALUES ('Museum', 'The Codington Museum is the work of American architect Frank Gehry and is a magnificent example of modern architecture in the twentieth century. With 24,000 m2, of which 11,000 are for exhibition space, the building is an architectural landmark for its bold architecture and innovative design. It is open from 10 am to 6 pm Tuesday through Sunday, and closed Mondays.') ;
INSERT INTO codington.typeplace(Name, Description) VALUES ('Large Business', 'Bill presents its new business complex based on architectural quality, exclusive design and commitment to the environment and energy saving. It is located in the city of Madrid, within the biggest urban development in Europe, and less than 15 minutes away from any nerve center of the town. It is open from 7 am to 8 pm Monday through Friday.');
INSERT INTO codington.typeplace(Name, Description) VALUES ('Stadium', 'The Codington Stadium is a multi-purpose arena located in downtown New Codington. It has a capacity that varies depending on the activity shelter, can expand its capacity from 10,000 to 12,500 in initial encounters basketball, or a maximum 15,500 concerts. Among its activities, in addition to the above two, are to host the athletics events or handball matches, being the sports stadium in New Codington that offers more possibilities. It is open from 1pm to 11pm every day.');
INSERT INTO codington.typeplace(Name, Description) VALUES ('Theater', 'The Royal Theater is the opera house in New Codington and is considered one of the most important in the world. It is located in the North zone and is one of the most emblematic monuments of the city. It was opened in 2008, running uninterruptedly and opera house until 2011. Since 2011 it has housed different plays as well as musicals, dance shows, classical music concerts, etc. It is open from 10 am to 12 pm every day');
INSERT INTO codington.typeplace(Name, Description) VALUES ('Zoo', 'The New Codington Zoo has a collection of more than 6000 animals of 500 different species.In 2008 the dolphin was built. It opened in August of that year, importing animals from Irland.The dolphin pool is 36 meters long by 10 meters wide and 5.20 deep, and two secondary pools for the care and maintenance of the 300 dolphins that have cubic meters of water. It is open from 11 am to 6 pm Monday through Friday, and from 10am to 7pm the weekends.');
INSERT INTO codington.typeplace(Name, Description) VALUES ('Park', 'The Royal Park is a park of 118 acres (1.18 million m²) located in South zone of New Codington. It is one of the most significant places of the city and opens from 8am to 10pm every day.');
INSERT INTO codington.typeplace(Name, Description) VALUES ('Tourism Atraction', 'In the city of New Codington there are several tourist attractions throughout the south. These include a Ferris wheel, various sculptures, boat tours, etc. The schedule of which is continuous from 9 am to 8 pm throughout the year.');
INSERT INTO codington.typeplace(Name, Description) VALUES ('Market', 'The city of New Codington houses different markets, but the most traditional is the Central Market. It is located in the south zone of the city. In the various positions are typical food of the area, as well as butchers, fishmongers, greengrocers and bakeries. Hours are 8 am to 9 pm Monday through Friday, Saturday from 8am to 3pm and closed Sundays.');



/*-- Insert type of places into database --*/

INSERT INTO codington.RegionPlace(Name, Description) VALUES ('NORTH', 'The North region of the Town.') ;
INSERT INTO codington.RegionPlace(Name, Description) VALUES ('SOUTH', 'The South region of the Town.');




/*-- Insert places into database --*/
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington Museum of Natural History',1,1,'Puy Chemin,1,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington Museum of Art',1,1,'Gosfort,22,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Large Business',1,2,'Puy Chemin,55,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Large Business',1,2,'TheoBald,44,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington First North Stadium',1,3,'Puy Chemin,99,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington Second North Stadium',1,3,'High Holbon,11,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('iPic Theater',1,4,'Puy Chemin,155,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Gurth Theater',1,4,'Farrington,2,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Zoo Aquarium Codington',1,5,'Puy Chemin,199,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('WoodPark Zoo',1,5,'Clerkenwell,52,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Hide Codington Park',1,6,'Puy Chemin,256,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Royal Codington Park',1,6,'RosvertyAve,1,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('National Galery Tourism Atraction',1,7,'Puy Chemin,299,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('The Codington Eye Tourism Atraction',1,7,'Percival St,14,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Share Codington Market',1,8,'Puy Chemin,355,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('BukoMarket',1,8,'RosvertyAve,111,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington Museum of Science',2,1,'Clerkenwell,2,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington Museum of Astronomy',2,1,'Farrington,82,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Large Business',2,2,'High Holbon,111,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Large Business',2,2,'Gosfort,222,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington First South Stadium',2,3,'Percival St,224,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Codington Second South Stadium',2,3,'Betford,12,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Michgan Theater',2,4,'Fumival,12,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Bould Theater',2,4,'Hosierr,12,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Smiths Zoo',2,5,'Egales St,12,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('South Colchter Zoo',2,5,'Proctest St,12,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('National Codington Park',2,6,'Old Gloucester, 22','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Briant Park',2,6,'Jons Mews,121,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Tower of Codington Tourism Atraction',2,7,'Bell Yard,23,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Tate Modern of Codington Tourism Atraction',2,7,'St Andrew,12,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Livid Codington Market',2,8,'Carter St,33,New Codington','');
INSERT INTO codington.place(Name, Region, TypePlace, Address, Description) VALUES ('Pulled Codington Market',2,8,'Tallist St,44,New Codington','');



/*-- Insert events into database --*/

INSERT INTO codington.event(Name, Description, Place, StartTime, Duration , Event_type, Seats_available) VALUES ('Ronaldo´s friends vs Messi´s friends', 'Football match with best world´s players', 5,'7.00 PM', '90 min', 'Football', 85454 );
INSERT INTO codington.event(Name, Description, Place, StartTime, Duration , Event_type, Seats_available) VALUES ('Velázquez, painter of history', 'Conference about the famous spanish painter', 2, '9.00 AM', '60 min', 'Painting', 100);
INSERT INTO codington.event(Name, Description, Place, StartTime, Duration , Event_type, Seats_available) VALUES ('The Lion King', 'Disney’s award-winning musical The Lion King ', 7, '8.15 PM', '70 min', 'Musical', 1104);
INSERT INTO codington.event(Name, Description, Place, StartTime, Duration , Event_type, Seats_available) VALUES ('Boston Americans vs Chicago White Sox', 'American League of Baseball match', 22, '10.30 PM', '190 min', 'Baseball', 56000 );



/*-- Insert event registration into database --*/

