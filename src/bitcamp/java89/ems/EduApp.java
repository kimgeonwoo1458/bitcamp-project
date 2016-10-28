// 주제: 사용자 정의 타입의 인스턴스 - 응용 III
// => 메서드를 이용하여 객체를 생성한다.

package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {

  static Scanner keyscan = new Scanner(System.in);


  public static void main(String[] args) {
    Lecturecontroller lecturecontroller = new Lecturecontroller(keyscan);
    System.out.println("비트캠프에오신것을 환영합니다.");

    loop:
    while (true){
      System.out.println("------------------------------");
      System.out.print("명령>");

      String command = keyscan.nextLine().toLowerCase();

      switch (command) {
        case "add": lecturecontroller.doAdd(); break;
        case "list": lecturecontroller.doList(); break;
        case "view": lecturecontroller.doView(); break;
        case "delete": lecturecontroller.doDelete(); break;
        case "update": lecturecontroller.doUpdate(); break;
        case "quit":
          System.out.println("good bye!");
          break loop;
          default:
          System.out.println("지원하지않는 명령어입니다.");

      }
    }
  }
}

/*
#









*/
