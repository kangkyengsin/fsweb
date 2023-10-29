package a1017.ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재시간: " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈: " + result1.format(dtf));

        LocalDateTime result2 = now.plusYears(2);
        System.out.println("2월 뺄셈: " + result2.format(dtf));
        
        LocalDateTime result3 = now.plusYears(7);
        System.out.println("7일 덧셈: " + result3.format(dtf));
        /* 
        주어진 코드는 Java 8부터 제공되는 java.time 패키지를 사용하여 두 날짜 및 시간을 비교하고, 남은 시간을 계산하는 예제입니다. 코드에서는 다음과 같은 주요 작업을 수행합니다:

        DateTimeFormatter를 사용하여 날짜와 시간을 원하는 형식으로 출력할 수 있도록 형식을 지정합니다. 이 형식은 "yyyy.MM.dd a HH:mm:ss"로 설정되어 있으며 AM 또는 PM을 포함합니다.

        시작일과 종료일을 나타내는 LocalDateTime 객체를 생성합니다. 이 경우 시작일은 2021년 1월 1일 0시 0분 0초로 설정되고, 종료일은 2021년 12월 31일 0시 0분 0초로 설정됩니다.

        isBefore(), isEqual(), isAfter() 메서드를 사용하여 시작일과 종료일을 비교하고, 어떤 상태에 있는지 확인합니다. 시작일이 종료일보다 이전이면 "진행 중입니다."를 출력하고, 같으면 "종료합니다."를 출력하며, 이후면 "종료했습니다."를 출력합니다.

        until() 메서드와 ChronoUnit 열거형을 사용하여 남은 시간을 계산합니다. 이를 통해 남은 해, 월, 일, 시간, 분, 초를 계산하고 출력합니다.

        이 코드는 두 날짜 및 시간을 비교하고, 남은 시간을 측정하는 데 유용한 예제로 활용할 수 있습니다. Java 8 이상에서 java.time 패키지를 사용하면 날짜 및 시간 처리를 효율적으로 수행할 수 있습니다. 
        */
    }
}
