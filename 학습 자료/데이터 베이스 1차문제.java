데이터 베이스 1차문제
1. 다음은 MySQL의 특징에 관한 설명이다. 맞으면 O, 틀리면 X 표시를 하시오.
① MySQL 데이터베이스 관리 시스템의 하나이다. (  O  )
② MySQL은 주로 대형 서버 컴퓨터에 사용하고 중소 시스템이나 PC에는 잘 사용하지 않는다. (  X  )
③ MySQL은 테이블을 기본 구조로 하는 관계형 데이터베이스 관리 시스템에 속한다. (  O  )
④ 자바로 웹 프로그래밍을 할 때 데이터베이스로써 MySQL을 많이 사용한다. (  O  )
⑤ SQL은 데이터베이스를 조회하거나 데이터를 갱신할 수 있는 데이터베이스 표준 언어이다. (  O  )
⑥ 스프링의 문자셋은 세계 표준인 euc-kr로 설정하는 것이 바람직하다. ( X )
⑦ MySQL은 처리 속도가 빠르고 성능이 우수한 편이지만 초보자가 익히기 어렵다.( X )

2. MySQL 데이터베이스에서 DB 테이블을 관리하는 SQL 명령에 관한 물음에 답하시오.
① 데이터베이스를 생성하는 명령을 쓰시오.
-	DataBase
② DB 테이블명이 member일 때 이 테이블의 구조를 보는 데 사용하는 명령을 쓰시오.
-	desc member;
③ member 테이블에 age 필드를 int 데이터형으로 추가하는 명령을 쓰시오.
-	alter table member add age int;
④ member 테이블에서 age 필드를 삭제하는 명령을 쓰시오.
-	drop table member age;
⑤ member 테이블의 이름을 members로 변경하는 명령을 쓰시오. 
-	alter table member rename members;
⑥ member 테이블의 name 필드를 char(20)으로 변경하는 명령을 쓰시오.
-	alter table member modify name char(20);
다음은 회사 사원의 인적 사항을 관리하기 위한 DB 테이블(테이블명: employee)의 구조이다.
필드명	데이터형	설명
num	int	일련번호
id 	char(20)	아이디
name	char(10)	성명
gender	char(1)	성별(남성: M, 여성: F)
age	int	나이
department	char(20)	근무 부서
hp 	char(20)	휴대전화 번호
address	char(100)	집 주소

 employee 테이블을 생성하는 명령을 만드시오
	create table employee (
num int ‘일련번호’,
	id char(20) ‘아이디’,
	name char(10) ‘성명’,
	gender int ‘성별(남성:M, 여성:F)’,
	age int ‘나이’,
	department char(20) ‘근무 부서’,
	hp char(20) ‘휴대전화 번호’,
	address char(100) ‘집주소’
 );

② employee 테이블의 구조를 보는 데 사용하는 명령을 쓰시오.
-	desc employee;
③ employee 테이블에 email 필드를 char(30) 데이터형으로 추가하는 명령을 쓰시오.
-	alter table employee add email char(30);
④ 테이블명을 member로 수정하는 명령을 쓰시오.
-	alter table employee rename member;
⑤ age 필드를 삭제하는 명령을 쓰시오.
-	drop table member age;
⑥ employee 테이블을 삭제하는 명령을 쓰시오.
-	drop table employee;



