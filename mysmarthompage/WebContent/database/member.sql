<!-- ���̺������ -->
create table member(
	id varchar2(20),
	pwd varchar2(20),
	name varchar2(20),
	age varchar2(4),
	gender varchar2(5),
	primary key(id)
);
<!-- Ŀ�� ��ɾ� -->
commit;

select * from  member;  

insert into member(id,pwd,name,age,gender)
values('hong','1234','ȫ�浿','20','MAN');

insert into member(id,pwd,name,age,gender)
values('kim,'1234','��浿','20','MAN');

<!-- ȸ��Ż���  -->

deleta from member
where id = ''; SQL    <!-- ���ڿ� ǥ���ҋ� �̱����� ��� -->

<!-- �α��� ȸ����ȸ -->

select pwd from member
where id = '';

<!-- ���̺��� �÷��� ��ȸ�ҋ� -->
desc member;
















