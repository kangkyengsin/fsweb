데이터 베이스 
Mysql 접속
mysql -u root -p      로그인
mysql> quit  //  cmd창닫기
mysql> exit   -로그아웃
Database 

DataBase 보기
Mysql 내의 모든 Datebase들을 모두 보여주는 명령어는 아래와 같습니다.
show  databases; 

DataBase 생성

Create database test_sample;

DataBase 선택(사용)하기
원하는 DataBase를 사용하기 위해서는 use 명령어를 사용해 줍니다.
Use test_sample;

DataBase 삭제하기
DataBase를 삭제하는 명령어는 Drop 입니다.
Drop database test_sample;


3. Table

Table 생성
Create table 테이블명 (
필드명1 데이터형,
필드명2 데이터형,
필드명3 데이터형,
…
Primary key(필드명)
);

데이터베이스 테이블의 구조
desc 명령은 ‘테이블명’의 테이블 필드 구조를 보여줌.
desc 테이블명
desc mem;

create table friend (
    num int not null auto_increment,
    name char(20) not null,
    tel char(20) not null,
    address char(80),
    primary key(num)
);

새로운 필드 추가
Alter table 테이블명 add 새로운 필드명 필드_데이터형 after 필드명;
alter table friend add email char(30)
alter table friend add order1 char(10) after email;
필드 삭제하기
Alter table 테이블명 drop 삭제할_필드명1, 삭제할_필드명2;
Alter table friend drop order1;

필드 수정하기
Alter table mem change age phone char(20);
Alter table friend change tel phone char(20);
Desc friend;
필드 데이터 형 바꾸기
Alter table friend modify phone int;
Desc friend

데이터베이스 테이블이름 관리
Alter table friend rename friends;

데이터 베이스 테이블 삭제
Drop table friends;

테이블에 데이터 삽입
Insert into 테이블 (필드명1,필드명2, …) values (필드값1, 필드값2,….);
 

('yjhwang', '황영주', 'M', '100-011', '서울시 중구 충무로1가', '234-8879', 35); 
('khshul', '설기형', 'M', '607-010', '부산시 동래구 명륜동', '764-3784', 33); 
create table member ( 
    num int not null auto_increment, 
    id char(20) not null, 
    name char(20) not null, 
    gender char(1), 
    post_num char(8), 
    address char(80), 
    tel char(20), 
    age int, 
    primary key(num) 
);
insert into member (id, name, gender, post_num, address, tel, age) values ('yjhwang', '황영주', 'M', '100-011', '서울시 중구 충무로1가', '234-8879', 35);
insert into member (id, name, gender, post_num, address, tel, age) values ('khshul', '설기형', 'M', '607-010', '부산시 동래구 명륜동', '764-3784', 33);

전체 필드와 데이터 검색
테이블 데이터 확인(조회)
Select * from member;

특정 필드의 전체 레코드 검색
필드는 하나의 항목(id, num , address, phone)
레코드는 황영주 데이터 전체 (id, name , gender, post_num, adress ,tel ,age ) (한줄을 의미)
 
Select name, tel, address from member(테이블명);

특정 조건에 맞는 레코드 검색
Select 필드명1, 필드명2 ,…  from 테이블명 where 조건식
1.   여성 회원의 아이디, 이름, 주소, 성별 검색
select id, name, address, gender from member where gender='W';

2 50세 이상인 남성 회원의 이름, 전화번호, 성별, 나이 검색
select name, tel, gender, age from member where age>=50 and gender='M';

3. 20대 회원의 이름, 성별, 주소, 나이 검색
select name,gender, age from member where age>=20 and age<=29;

  4. 30대 또는 50대 남성 회원의 이름, 전화번호, 나이, 성별 검색
select name, tel, age, gender from member where ( (age>=30 and age<=39) or (age>=50 and age<=59) ) and gender='M';

5. 이름이 ‘안철영’인 회원의 일련번호, 이름, 전화번호, 주소, 우편번호, 나이, 성별 검색
select num, name, tel, address, post_num, age, gender from member where name='안철영';

특정 문자열이 포함된 레코드 검색
Select 필드명1, 필드명1,.. from 테이블명 where 검색필드 like 문자수식
6. 성이 박씨인 회원의 이름, 전화번호 검색
select name, tel from member where name like '박%';

7. 서울에 거주하는 회원의 일련번호, 이름, 주소, 성별 검색
select num, name, address, gender from member where address like '서울%';

8. 은평구에 거주하는 회원의 모든 정보 검색
select * from member where address like '%은평구%';

9. 성이 김씨이고 광주에 거주하는 회원의 모든 정보 검색
select * from member where addrees like ‘%광주%’ and name like ‘김%’;

레코드 정렬
‘테이블명’이라는 DB 테이블에서 ‘필드명’을 기준으로 오름차순 정렬된 필드명1, 필드명2, … 를 검색하는 명령 형식
Select 필드명1, 필드명2, … from 테이블명 order by 필드명;

10. 서울에 사는 회원을 나이순으로 오름차순 정령한 뒤 이름, 나이, 주소, 전화번호, 성별 출력
select name, age, address, tel, gender, from member where address like ‘서울%’ order by age;

11. 부산에 사는 회원을 나이순으로 내림차순 정령한 뒤 이름, 나이, 주소, 전화번호 출력
select name, age, address, tel from member where address like '부산%' order by age desc;;

레코드 수정
    ‘테이블명’이라는 DB 테이블에서 조건식을 만족하는 레코드의 ‘필드명’ 값을 ‘필드값’으로 변경하는 명령 형식
    Update 테이블명 set 필드명=필드값 where 조건식;

12. 이름이 ‘고재진;인 레코드의 전화번호를 123-4567로 변경한 뒤 데이터 확인
update member set tel='123-4567' where name='고재진';
select name, tel from member where name=’고재진’;

13. 이름이 정한나인 회원의 나이를 확인하고 값을 37로 변경
select name, age from member where name=’정한나’;
update member set age=37 where name='정한나';
select name, age from member where name=’정한나’;

레코드 삭제
    ‘데이블명’이라는 DB 테이블에서 조건식을 만족하는 레코드를 삭제하는 명령 형식
        Delete from 테이블명 where 조건식;

14. 이름이 ‘김수련’인 레코드를 삭제한 뒤 확인
    Delete from member where name=’김수련’;
    Select * from member where name like ‘김%’;

15. 40대 회원의 레코드를 삭제한 뒤 35~53세 회원의 이름, 나이, 성별을 나이순으로 출력하여 확인
delete from member where age>=40 and age<=49;
select name, age, gender from member where age>=35 and age<=53 order by age;

-주의-
delete from member;
이러면 member 테이블의 전체 레코드가 삭제되니 조심할 것



