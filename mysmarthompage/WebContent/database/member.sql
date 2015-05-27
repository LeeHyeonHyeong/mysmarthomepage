create table member(
	id varchar2(20),
	pwd varchar2(20),
	name varchar2(20),
	age varchar2(4),
	gender varchar2(5),
	primary key(id)
);

select * from  member;  

insert into member(id,pwd,name,age,gender)
values('hong','1234','È«±æµ¿','20','MAN');

insert into member(id,pwd,name,age,gender)
values('kim,'1234','±è±æµ¿','20','MAN');