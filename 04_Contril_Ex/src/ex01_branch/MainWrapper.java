package ex01_branch;

public class MainWrapper {
  
  public static void ex01() {
    
    //점수에 따른 학점(if문)
    int score = 100;
    char grade;  // 'A', 'B', 'C', 'D', 'F'    (한 글자만 저장할 수 있는 char 타입을 썼음).
    if(score >= 90 ) {
        grade = 'A';
    }
      else if(score >= 80) {
        grade = 'B';
      }
      else if(score >= 70) {
        grade = 'C';
      }
      else if(score >= 60) {
        grade = 'D';
      }
      else {
        grade = 'F';
      }
      System.out.println(score + "점은 " + grade+ "학점입니다.");
  }
  
  public static void ex02() {
  
    //점수에 따른 학점(switch문)
    int score = 100;
    char grade;  // 'A', 'B', 'C', 'D', 'F'    (한 글자만 저장할 수 있는 char 타입을 썼음).
    switch(score / 10) {
      case 10:        // 100점과 90점은 학점이 같기 때문에 같이 둔다.
      case 9:
        grade = 'A';
        break;
      case 8:
        grade = 'B';
        break;
      case 7:
        grade = 'C';
        break;
      case 6:
        grade = 'D';
        break;
      default:
        grade = 'F';
    }
    System.out.println("당신의 점수는 " + score + "점, 학점은 " + grade + "입니다." );
  }

  public static void ex03() {
  
    //점수와 학년에 따른 학점
    //1~3학년 : 60점 이상 합격, 아니면 불합격
    //4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 100; // 점수
    int scYear = 1;  // 학년
    String pass;  // "합격", "불합격"
    
    if(scYear >= 1 && scYear <= 3) {
        if(score >= 60) {
        pass = "합격";
      } else {
        pass = "불합격";
      }
    } else {
        if(score >= 70) {
          pass = "합격";
        } else {
          pass = "불합격";
        }
    }
    System.out.println(scYear + "학년이고, 점수는 " + score + "입니다. 따라서" + pass + "입니다." );
    
  }
  
  public static void ex03_2( ) {
    
    //위와 같은 문제(다른방법으로 풀기)
    //점수와 학년에 따른 학점
    //1~3학년 : 60점 이상 합격, 아니면 불합격
    //4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 60; // 점수
    int scYear = 4;  // 학년
    String pass;  // "합격", "불합격"
    int passScore;      // 합격의 최소 점수
    
    if(scYear <= 3) {
      passScore = 60;
    } else {
      passScore = 70;
    }
    if(score >= passScore) {
      pass = "합격";
    } else {
      pass = "불합격";
    }
    System.out.println(pass);
  }
  
  public static void ex04() {
    
  //메뉴에 따른 가격
    //아메리카노 : 2000
    //카페라떼 : 2500
    //밀크티 : 3000
    //기타 : 5000
    String order = "아메리카노";  //문자열은 기본적으로 참조타입이어서 주소값을 가지고 있음.
    int price;                    //if는 문자열의 비교는 못한다.
    
   switch(order) {
     case "아메리카노":          //case에 숫자 외에도 문자도 입력가능.
      price = 2000;
      break;
     case "카페라떼":
      price = 2500;
      break;
     case "밀크티":
      price = 3000;
      break;
     default:
      price = 5000;
   
    }
    System.out.println(order + "의 가격은 " + price + "입니다.");
  }
  
  public static void ex05() {
    
  //월에 따른 계절
    //3 ~ 5 : 봄
    //6 ~ 8 : 여름
    //9 ~ 11: 가을
    //12 ~ 2: 겨울
    int month = 7;
    String season;  // "봄", "여름", "가을", "겨울"
    
    if(month >= 3 && month <= 5) {
      season = "봄";
    } else if(month >= 6 && month <= 8) {
      season = "여름";
    } else if(month >= 9 && month <= 11) {
      season = "가을";
    } else {
      season = "겨울";
    }
    System.out.println(month + "월은 " + season + "입니다.");
  }
  
  public static void ex06() {
    
  //월에 따른 분기
    //1 ~ 3 : 1분기
    //4 ~ 6 : 2분기
    //7 ~ 9 : 3분기
    //10 ~ 12 : 4분기
    int m = 7;
    
    
    
    
  }
  
  public static void ex07() {
    
  //10일 후 요일은?
    int day = 13;  // 13일은 목요일
    int nDay = 10;  // 10일
    String weekname;  // "월", "화", "수", "목", "금", "토", "일"
    
  }
  
  public static void main(String[] args) {
  //ex01();
  //ex02();
  //ex03();
  //ex03_2();
  ex04();
   
  }

}
