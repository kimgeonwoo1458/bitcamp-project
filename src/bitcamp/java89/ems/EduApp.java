// 주제: 사용자 정의 타입의 인스턴스 - 응용 III
// => 메서드를 이용하여 객체를 생성한다.

package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {

  public static void main(String[] args) {
    System.out.println("비트캠프에오신것을 환영합니다.");
    Scanner keyscan = new Scanner(System.in);
    Lecture lecture = new Lecture();


    System.out.print("이름(예:김건우) : ");
    lecture.name = keyscan.nextLine();
    System.out.printf("이름 : %s\n",lecture.name);
    System.out.print("강사(예:엄진영) : ");
    lecture.teacher = keyscan.nextLine();
    System.out.print("교재(예:자바프로그래밍) : ");
    lecture.book = keyscan.nextLine();
    System.out.print("강의시간(예:60분) : ");
    lecture.time = keyscan.nextLine();
    System.out.print("강의비용(예:120000) : ");
    lecture.cost =Integer.parseInt(keyscan.nextLine());
    System.out.print("강의시작날짜(예:161011) : ");
    lecture.sta =Integer.parseInt(keyscan.nextLine());
    System.out.print("강의종료날짜(예:170328) : ");
    lecture.fin =Integer.parseInt(keyscan.nextLine());
    System.out.print("강의코드(예:123486) : ");
    lecture.code =Integer.parseInt(keyscan.nextLine());

    System.out.printf("이름 : %s\n",lecture.name);





  }
}

/*
#









*/
