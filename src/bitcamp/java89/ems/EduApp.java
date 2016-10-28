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
        case "menu" : doMenu(); break;
        case "go 1": lecturecontroller.service(); break;

        case "quit":
          System.out.println("good bye!");
          break loop;
          default:
          System.out.println("지원하지않는 명령어입니다.");

      }
    }
  }
  static void doMenu(){
    System.out.println("[메뉴]");
    System.out.println("1. 강의관리");
    System.out.println("메뉴이동은 'go 메뉴번호'를 입력하세요.");

  }
}

/*
#









*/
