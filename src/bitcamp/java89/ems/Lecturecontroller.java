// 주제: 사용자 정의 타입의 인스턴스 - 응용 III
// => 메서드를 이용하여 객체를 생성한다.

package bitcapm.java89.ems;
import java.util.Scanner;

public class Lecturecontroller {

  static Lecture[] lectures = new Lecture[100];
  static int length = 0;
  static Scanner keyscan;

  static void doList(){
    Lecture lecture = null;
    for(int i = 0; i < length; i++){
      lecture = lectures[i];
      System.out.printf("%s, %s, %s, %s, %d, %d, %d, %d \n",
      lecture.name,
      lecture.teacher,
      lecture.book,
      lecture.time,
      lecture.cost,
      lecture.sta,
      lecture.fin,
      lecture.code);
  }
}
  static void doAdd(){
    while (length < lectures.length){
      Lecture lecture = new Lecture();

      System.out.print("강의이름(예:김건우) : ");
      lecture.name = keyscan.nextLine();
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


      lectures[length++] = lecture;
      System.out.print("계속입력하시겠습니까?(y/n)? ");
      if(!keyscan.nextLine().equals("y"))
      break;
    }
  }
  static void doView(){
  System.out.print("조회할 강의는?");
  String name = keyscan.nextLine().toLowerCase();
  for(int i = 0; i < length; i++){
    if (lectures[i].name.toLowerCase().equals(name)){
      System.out.printf("강의이름 : %s\n",lectures[i].name);
      System.out.printf("강사 : %s\n",lectures[i].teacher);
      System.out.printf("교재 : %s\n",lectures[i].book);
      System.out.printf("강의시간 : %s\n",lectures[i].time);
      System.out.printf("강의비용 : %d\n",lectures[i].cost);
      System.out.printf("강의시작날짜 : %d\n",lectures[i].sta);
      System.out.printf("강의종료날짜 : %d\n",lectures[i].fin);
      System.out.printf("강의코드 : %d\n",lectures[i].code);
      break;
      }
    }
  }
}



/*
#









*/
