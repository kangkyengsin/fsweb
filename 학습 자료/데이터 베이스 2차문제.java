다음은 MySQL을 이용하여 회사 사원의 인적 사항을 관리하기 위한 DB 테이블(테이블명 : worker)의 구조이다. 
필드명	데이터형	null	추가 사항	설명
num	int	not null	primary key,  auto_increment	일련번호
id 	char(20)	not null		아이디
name	char(10)	not null		성명
gender	char(1)	not null		성별(남성: M, 여성: F)
age	int	not null		나이
department	char(20)	not null		근무 부서
phone	char(20)	not null		휴대전화 번호
address	char(100)			집 주소

①	 worker 테이블을 일괄 생성하시오
create table worker(
    ->     num int not null auto_increment,
    ->     id char(20) not null,
    ->     name char(10) not null,
    ->     gender char(1) not null,
    ->     age int not null,
    ->     department char(20) not null,
    ->     phone char(20) not null,
    ->     address char(100),
    ->     primary key(num)
    -> );
②	 worker 테이블에 다음 데이터를 삽입하는 명령을 쓰시오.
chkim, 김창훈, M, 28, 총무부, 010-3838-8577, 경기도 용인시
insert into worker (id, name, gender, age, department, phone, address) values ('chkim', '김장훈', 'M', 28, '총무 부', '010-3838-8577', '경기도 용인시');

3 worker 테이블의 구조를 보는 데 사용하는 명령을 쓰시오.
desc worker;

④ worker 테이블에 존재하는 모든 레코드의 모든 필드를 보여주는 명령을 쓰시오.
select * from worker;

2. 1번 문제에서 생성한 worker 테이블에 다음 표의 사원 데이터 필드를 일괄 생성하시오
id	name 	gender 	age	department	phone 	address
jhjang	장종훈	M	38	총무부	010-3347-7474	서울시 강동구
jek98	안달훈	M	25	인사부	010-3744-4747	강원도 정선군
lms2	이세영	F	48	경리부	010-3736-4784	전라북도 전주시
apple3	김소영	F	52	총무부	010-2845-8978	전라남도 순천시
sub093	김수정	M	53	홍보부	010-3834-1248	경상북도 상주시
chulsu	김철수	M	23	홍보부	010-1235-3788	경기도 오산시
yckim	김영철	M	32	인사부	010-2222-3334	경기도 용인시
yerin99	김예린	F	25	총무부	010-7777-9999	서울시 강서구
sjjung	정수정	F	35	경리부	010-3636-3563	충청남도 아산시
tuttle7	이예린 	F	21	연구소	010-3756-9823	경기도 성남시

[insert.sql 내용]
insert into worker (id, name, gender, age, department, phone, address) values ('jhjang', '장종훈', 'M', 38, '총무부', '010-3347-7474', '서울시 강동구');
insert into worker (id, name, gender, age, department, phone, address) values ('jek98', '안달훈', 'M', 25, '인사과', '010-3744-4747', '강원도 정선군');
insert into worker (id, name, gender, age, department, phone, address) values ('lms2', '이세영', 'F', 48, '경리부', '010-3736-4784', '전라북도 전주시');
insert into worker (id, name, gender, age, department, phone, address) values ('apple3', '김소영', 'F',	52, '총무부', '010-2845-8978', '전라남도 순천시');
insert into worker (id, name, gender, age, department, phone, address) values ('sub093', '김수정', 'M', 53, '홍보부', '010-3834-1248', '경상북도 상주시');
insert into worker (id, name, gender, age, department, phone, address) values ('chulsu', '김철수', 'M', 23, '홍보부', '010-1235-3788', '경기도 오산시');
insert into worker (id, name, gender, age, department, phone, address) values ('yckim', '김영철', 'M', 32, '인사과', '010-2222-3334', '경기도 용인시');
insert into worker (id, name, gender, age, department, phone, address) values ('yerin99', '김예린', 'F', 25, '총무부', '010-7777-9999', '서울시 강서구');
insert into worker (id, name, gender, age, department, phone, address) values ('sjjung',  '정수정', 'F', 35, '경리부', '010-3636-3563', '충청남도 아산시');
insert into worker (id, name, gender, age, department, phone, address) values ('tuttle7', '이예린', 'F', 21, '연구소', '010-3756-9823', '경기도 성남시');

3. 2번 문제에서 입력한 사원 데이터를 검색하는 SQL 명령에 관한 물음에 답하시오.
① 홍보부에서 근무하는 사원의 모든 필드를 검색하는 명령을 쓰시오.
select * from worker;

② 20대(20~29세)인 사원의 아이디, 이름, 집 주소를 검색하는 명령을 쓰시오.
select id, name, address, from worker where age >=20 and age<=29;

③ 경리부에 근무하고 이름에 ‘정’이 들어간 사원의 이름, 성별, 근무 부서, 휴대전화 번호를 검색하는 명령을 쓰시오.
select name, age, department, phone from worker where name like '정%';

④ 경기도에 사는 사원을 나이순으로 오름차순 정렬한 뒤 이름, 집 주소, 성별, 휴대전화 번호를 검색하는 명령을 쓰시오.
select name, address, gender, phone from worker where address like '경기도%' order by age;

⑤ 여성 사원을 나이순으로 내림차순 정렬한 뒤 이름, 성별, 아이디, 휴대전화 번호, 집 주소를 검색하는 명령을 쓰시오.
select name, gender, id, phone, address from worker where gender like 'F' order by age desc;

⑥ 홍보부에 근무하는 남성 사원의 이름과 휴대전화 번호를 검색하는 명령을 쓰시오.
select name, phone from worker where department like '홍보부';

⑦ 용인시에 사는 사원의 이름과 휴대전화 번호를 검색하는 명령을 쓰시오.
select name, phone from worker where address like '%용인시%';

⑧ ‘김영철’의 휴대전화 번호를 ‘010-2222-3333’으로 수정하는 명령을 쓰시오.
update worker set phone='010-2222-3333' where name='김영철';
select name, phone from worker where name='김영철';

⑨ 아이디가 ‘chulsu’인 사원의 나이를 ‘33’으로 수정하는 명령을 쓰시오.
select name, age from worker where id='chulsu';
update worker set age=33 where id='chulsu';
select name, age from worker where id='chulsu';

⑩ 아이디가 ‘jhjang’인 레코드를 삭제하는 명령을 쓰시오.
Delete from worker where id=’jhjang’;
Select * from worker where id like ‘jhjang’;

⑪ 경리부에서 근무하는 ‘이세영’의 레코드를 삭제하는 명령을 쓰시오.
delete from worker where name=’이세영’;
