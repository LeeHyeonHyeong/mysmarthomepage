<!-- 테이블생성시 --> 
create table member( 
 	id varchar2(20), 
	pwd varchar2(20), 
	name varchar2(20), 
	age varchar2(4), 
 	gender varchar2(5), 
 	primary key(id) 
 ); 
 <!-- 커밋 명령어 --> 
 commit; 
 
 
 select * from  member;   
 
 
 insert into member(id,pwd,name,age,gender) 
 values('hong','1234','홍길동','20','MAN'); 
 
 
 insert into member(id,pwd,name,age,gender) 
 values('kim,'1234','김길동','20','MAN'); 
  
 <!-- 회원탈퇴시  --> 
 deleta from member  where id = '';    

<!-- SQL 문자열 표시할 싱글쿼터 사용 --> 
  
 <!-- 로그인 회원조회 --> 
 select pwd from member where id = ''; 
 
<!-- 테이블의 컬럼을 조회할 --> 
 desc member; 

<!-- 회원정보 -->
update member set pwd = ''
where id = '';
  

 
 
 
 
 
 
 