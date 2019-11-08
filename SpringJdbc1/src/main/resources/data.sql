create table Person ( 
id integer not null, 
name varchar(255) not null,
 address varchar(255),
  dateOfBirth timestamp,
   primary key(id) 
  ); 
  
  INSERT INTO PERSON VALUES (1,'LUCKY', 'DELHI',SYSDATE());
  INSERT INTO PERSON VALUES ( 2,'RUMAN', 'HYDERABAD',SYSDATE());
  INSERT INTO PERSON VALUES (3,'SHAYAAN', 'MUMBAI',SYSDATE()); 