insert into student (id, instrument_id, first_name, last_name, birth_date) values (1, 1, 'John', 'Smith', '1986-02-28');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (2, 7, 'John', 'Konstantin', '1980-07-20');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (3, 1, 'Steve', 'McCqueen', '1988-01-01');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (4, 4, 'James', 'Bond', '1964-12-30');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (5, 7, 'Alain', 'Delon', '1989-04-28');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (6, 6, 'Jessica', 'Alba', '1991-09-11');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (7, 6, 'Emma', 'Stone', '1992-05-30');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (8, 3,'Sang', 'Wo', '1956-04-01');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (9, 3, 'Liu', 'Kang', '1956-04-01');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (10, 5, 'Shao', 'Khan', '1102-07-07');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (11, 1, 'Bon', 'Jovi', '1990-02-12');
insert into student (id, instrument_id, first_name, last_name, birth_date) values (12, 2, 'Misha', 'Spiridonov', '1994-02-03');

insert into instrument (id, type, producer, prod_date, purch_date) values (1, 'Guitar', 'Yamaha', '1954-03-12', '1964-02-12');
insert into instrument (id, type, producer, prod_date, purch_date) values (2, 'Harmonica', 'Hohner', '2000-02-02', '2000-12-20');
insert into instrument (id, type, producer, prod_date, purch_date) values (3, 'Violin', 'Stradivari', '1500-01-01', '2007-12-12');
insert into instrument (id, type, producer, prod_date, purch_date) values (4, 'Saxophone', 'Yamaha', '1943-04-07', '1999-11-19');
insert into instrument (id, type, producer, prod_date, purch_date) values (5, 'Piano', 'Yamaha', '1969-06-10', '1969-06-11');
insert into instrument (id, type, producer, prod_date, purch_date) values (6, 'Bas guitar', 'Yamaha', '1972-02-02', '2007-12-12');
insert into instrument (id, type, producer, prod_date, purch_date) values (7, 'Drums', 'SomeOne', '1990-12-12', '2007-12-12');

insert into composition(id, title, author) values (1, 'God is dead', 'Black Sabbath');
insert into composition(id, title, author) values (2, 'Princes of the Universe', 'Queen');
insert into composition(id, title, author) values (3, 'Symphony №9', 'Beethoven');

insert into performance(id, composition_id) values (1, 1);
insert into performance(id, composition_id) values (2, 2);
insert into performance(id, composition_id) values (3, 3);

insert into performance_participants(performance_id, student_id) values (1, 1);
insert into performance_participants(performance_id, student_id) values (1, 8);
insert into performance_participants(performance_id, student_id) values (3, 5);


