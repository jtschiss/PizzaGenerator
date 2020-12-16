delete from user_roles;
delete from user;
INSERT INTO user VALUES (1,'Kathy','password'),(2,'Herbert','12345'),(3,'Joseph','helloworld');
INSERT INTO user_roles VALUES (1, 'Kathy','user', 1),(2, 'Herbert','user', 2),(3, 'Joseph','test', 3),(4, 'Kathy', 'test', 1);
