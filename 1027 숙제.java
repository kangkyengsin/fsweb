/* 
1. mvc란?
- MVC란 Model, View, Controller를 의미한다.
 애플리케이션이나 프로젝트를 구성할 때 그 구성요소를 세가지 역할로 구분한 것이다. 

View는 사용자가 보는 화면으로 text, inputbox, textarea가 있는 인터페이스 요소를 나타낸다.
 즉, 데이터를 화면에 보여주는 담당이다.

Model은 애플리케이션의 데이터를 나타낸다.
 그래서 View는 Model의 데이터를 랜더링 하여 사용한다.

Controller는 앞에서 말한 화면(View)과 데이터(Model)을 잇는 역할을 한다.
 사용자가 화면에서 데이터를 활용해 조회하고 수정하고 저장하는 등 이러한 이벤트들을 처리한다.

그래서 View는 화면을 그리는 것에 집중하고,
 Model,Controller는 비즈니스 로직 또는 내부로직 처리에 집중한다!

2. 스프링과 스프링 부트 차이
- Spring과 Spring Boot는 모두 스프링 프레임워크를 기반으로 한 자바 웹 개발 프레임워크입니다.
둘 간에는 몇 가지 차이점이 있습니다.

Spring은 스프링 프레임워크의 핵심 모듈을 모아서 만든 프레임워크입니다.
 Spring에서는 개발자가 직접 설정 파일을 작성하여 스프링 컨테이너를 구성하고,
 필요한 빈 객체를 등록하고, 빈 객체 간의 의존성을 설정해야 합니다.
 Spring은 특정한 구성을 위해 추가적인 라이브러리와 설정이 필요합니다.

반면, Spring Boot는 스프링 프레임워크를 보다 쉽게 사용할 수 있도록 만든 프레임워크입니다.
 Spring Boot에서는 개발자가 설정 파일을 작성할 필요 없이,
 프로젝트의 설정과 라이브러리 의존성을 자동으로 처리해주는 기능을 제공합니다.
 또한, Spring Boot는 실행 가능한 JAR 파일을 만들 수 있습니다.

Spring Boot는 Spring에서 제공하는 여러 기능들을 자동으로 설정하여 개발자가 보다 쉽게 사용할 수 있도록 해줍니다.
 예를 들어, Spring Boot는 스프링 MVC, 스프링 Data JPA, 스프링 Security 등의 기능을 자동으로 설정하며,
 개발자가 별도로 설정 파일을 작성하지 않아도 사용할 수 있습니다.
 또한, Spring Boot는 Actuator라는 모니터링과 관리를 위한 기능을 제공하여,
 애플리케이션의 상태를 모니터링하고, 필요한 조치를 취할 수 있도록 해줍니다.

이러한 차이점들은 Spring과 Spring Boot의 사용 목적과 방식을 크게 달리 합니다.
 Spring은 개발자가 직접 설정 파일을 작성하고, 빈 객체를 등록하고,
 빈 객체 간의 의존성을 설정하는 것을 요구합니다.
 반면, Spring Boot는 개발자가 보다 쉽게 스프링을 사용할 수 있도록 설정과 의존성 처리 등을 자동으로 처리합니다.
 Spring은 스프링 프레임워크를 보다 세밀하게 제어하고자 하는 경우에,
 Spring Boot는 빠르고 간단하게 스프링 애플리케이션을 개발하고자 하는 경우에 사용됩니다.

간단 요약 : 스프링(Spring)은 프레임워크이며,
 스프링 부트(Spring Boot)는 스프링 프레임워크를 기반으로 한 도구입니다.
 스프링은 설정 파일을 작성해야 하지만, 스프링 부트는 자동 설정을 제공하여 간편하게 개발할 수 있습니다.
 또한, 스프링 부트는 내장 서버를 제공하여 쉽게 웹 애플리케이션을 실행할 수 있습니다.
 Spring은 스프링 프레임워크를 보다 세밀하게 제어하고자 하는 경우에,
 Spring Boot는 빠르고 간단하게 스프링 애플리케이션을 개발하고자 하는 경우에 사용됩니다.
3. 
@Controller
- 전통적인 Spring MVC의 컨트롤러 어노테이션인 @Controller는 주로 View(화면)를 반환하기 위해 사용합니다.
Dispatcher는 @Controller가 있는 클래스들을 확인해서 @RequestMapping이 있는 메서드들을 확인합하여 요청을 처리합니다.
 해당 어노테이션은 @Service, @Repository와는 구분되어 사용됩니다.

@Service
- 특정 예외를 잡아, 스프링의 unchecked 예외로 다시 던집니다.
 PersistenceExceptionTranslationPostProcessor를 구현하여야 합니다.
 따라서 플랫폼 상세 예외를 잡으면, 스프링의 DataAccessException로 다시 던질 수 있습니다.

@Repository
- 특정 예외를 잡아, 스프링의 unchecked 예외로 다시 던집니다. PersistenceExceptionTranslationPostProcessor를 구현하여야 합니다.
 따라서 플랫폼 상세 예외를 잡으면, 스프링의 DataAccessException로 다시 던질 수 있습니다.

  란?
4, GetMapping, postMapping
-  Spring MVC에서 각각의 컨트롤러에서 Http Methods을 간단하게 하기 위하여 새로이 등장한 어노테이션입니다.
 위의 어노테이션을 사용하면 기존보다 간단하게 Http Methods를 매핑할 수 있습니다.
 아래 코드에서 보다시피 훨씬 간결하게 Http Methods에 매핑할 수 있습니다.
 또한 PUT, DELETE, PATCH 방식 또한 사용이 가능합니다.

GET 방식은 클라이언트에서 서버로 어떠한 리소스로 부터 정보를 요청하기 위해 사용되는 메서드입니다.
 같은 리소스로부터 정보를 요청하면 그 값은 동일한 결과를 받아오기 때문에 조회하는 데 많이 사용이 됩니다.
 또한 대용량의 데이터의 재조회를 막기 위해 첫 요청에 캐시를 해두고 재조회시 서버 요청 없이 캐시 된 데이터를 사용합니다.
 반면에 쿼리스트링으로 전송되기 때문에 데이터의 길이가 제한되며, 보안에도 취약하다는 단점이 있습니다. 

POST 방식은 리소스를 생성 및 수정하기 위해 데이터를 보낼 때 주로 사용됩니다.
 POST 방식은 GET 방식과 다르게 Http Body에 리소스가 담겨 전송되기 때문에 데이터의 제한도 없을뿐더러 비교적 데이터 유출로부터 안전합니다. 

5. 인테리제이 단축키
창 닫기	                            ctrl + w	                    ctrl + F4
창 크게하기	                        ctrl + m	                    ctrl + shift + F12
import 하기	                        ctrl + 1	                    alt + enter
method 단위로 커서 위치 이동	 	 alt + ↑, alt + ↓
커서 위치한 line 옮기기	            alt + ↑, alt + ↓	            ctrl + alt + ↑, ctrl + alt + ↓
커서 위치한 line 삭제	            ctrl + d	                    ctrl + y
커서 위치한 line 복제	            ctrl + alt + ↑, ctrl + alt + ↓	ctrl + d
특정 line 번호로 이동	            ctrl + l (엘)	                ctrl + g
특정 문자가 들어있는 파일 찾기	     ctrl + h	                     ctrl + shift + f
파일 검색	                        ctrl + h	double shift
클래스명 검색	 	                ctrl + n
실행취소(undo)	                    ctrl + z	                    ctrl + z
재실행(redo)	                    ctrl + y	                   ctrl + shift + z
setting 창 열기	 	                ctrl + alt + s
메소드 속으로 들어가기	             F3	F4 또는 ctrl + b
불필요한 import 제거	            ctrl + shift + o            	ctrl + alt + o
call depth 보기	                   ctrl + alt + h	               ctrl + alt + h
호출하는 곳 보기	                ctrl + alt + g	                ctrl + alt + F7
find한 것 다음으로 넘기기	        ctrl + k	F3

[리팩토링]
변수명 메소드명 등 한꺼번에 바꾸기	  alt + shift + r	              shift + F6
메소드 추출(Extract Method)	        alt + shift + m	                ctrl + alt + m

선택된 블럭
if, for, while
등으로 감싸기(surround with)	 	ctrl + alt + t
Run	                               ctrl + F11	                    shift + F10
[Debug]
Run	 	                           shift + F9
한스텝씩 진행	                    F7                            	 F8
메소드 안으로 들어가면서 진행	     F6	                              F7
다음 브레이크 포인트까지 넘김	     F8	                              F9
에러 지점 바로 가기	 	            shift + F2
특정 인터페이스를 구현하는 클래스 찾기	ctrl + t	                    ctrl + alt + b
코드 자동 정렬하기	                ctrl + shift + f	              ctrl + alt + l(엘)

6. restapi란?
REST API는 HTTP 요청을 통해 통신함으로써 리소스 내에서 레코드(CRUD 라고도 함)의 작성, 읽기, 업데이트 및 삭제 등의 표준 데이터베이스 기능을 수행합니다. 예를 들어, REST API는 GET 요청을 사용하여 레코드를 검색하고, POST 요청을 사용하여 레코드를 작성하며, PUT 요청을 사용하여 레코드를 업데이트하고, DELETE 요청을 사용하여 레코드를 삭제합니다. 모든 HTTP 메소드는 API 호출에서 사용될 수 있습니다. 잘 디자인된 REST API는 HTTP 기능이 내장된 웹 브라우저에서 실행되는 웹 사이트와 유사합니다.

특정 순간 또는 타임스탬프의 리소스 상태를 리소스 표현이라고 합니다. 이러한 정보는 JSON(JavaScript Object Notation), HTML, XLT, Python, PHP 또는 일반 텍스트를 포함하여 실제로 거의 모든 형식으로 클라이언트에 전달될 수 있습니다. JSON은 사람과 기계가 모두 읽을 수 있고 프로그래밍 언어에 구애받지 않기 때문에 자주 사용됩니다.

요청 헤더와 매개변수 역시 메타데이터, 권한 부여, URI(Uniform Resource Identifier), 캐싱, 쿠키 등의 중요한 식별자 정보를 포함하므로 REST API 호출에서 중요합니다. 요청 헤더와 응답 헤더는 일반적인 HTTP 상태 코드와 함께 잘 디자인된 REST API 내에서 사용됩니다.

7. Model model 이란?
Model이란?

Model은 HashMap 형태를 갖고 있으며, key, value값을 가지고 있습니다. 또한 addAttribute()와 같은 기능을 통해 모델에 원하는 속성과 그것에 대한 값을 주어 전달할 뷰에 데이터를 전달할 수 있습니다.

Spring에서 Controller의 메서드를 작성할 때는 특별하게 Model이라는 타입을 파라미터로 지정할 수 있습니다. Model 객체는 JSP에 컨트롤러에서 생성된 데이터를 담아서 전달하는 역할을 하는 존재입니다. 이를 이용해서 JSP와 같은 뷰(View)로 전달해야 하는 데이터를 담아서 보낼 수 있습니다. 메서드의 파라미터에 Model 타입이 지정된 경우에는 스프링은 특별하게 Model 타입의 객체를 만들어서 메서드에 주입하게 됩니다.

8. model.addAttribute
Model addAttribute(String name, Object value)
- value 객체를 name 이름으로 추가한다. 뷰 코드에서는 name으로 지정한 이름을 통해서 value를 사용한다.

Model addAttribute(Object value)
- value를 추가한다. value의 패키지 이름을 제외한 단순 클래스 이름을 모델 이름으로 사용한다. 이 때 첫 글자는 소문자로 처리한다.

- value가 배열이거나 컬렉션인 경우 첫 번째 원소의 클래스 이름 뒤에 "List"를 붙인 걸 모델 이름으로 사용한다. 이 경우에도 클래스 이름의 첫자는 소문자로 처리한다.

9.dto란?
우선, DTO 의 정의를 간략하게 알아보겠습니다. DTO는 프로세스 간에 데이터를 전달하는 용도의 객체입니다. 비즈니스 로직을 포함하지 않는 데이터를 전달하기 위한 단순한 객체 를 뜻합니다. MVC 패턴에서는 주로 Client 와 Controller 사이에서 DTO 가 사용됩니다.

10.entity란? 
Entity란? Entity(엔티티)는 데이터베이스에 쓰일 필드와 여러 엔티티간 연관관계를 정의하는 역할을 합니다. 테이블에 대응하는 하나의 클래스라고 생각하시면 됩니다. Entity 어노테이션과 함께 여러 관련 어노테이션을 사용하여 설계할 수 있습니다.
*/