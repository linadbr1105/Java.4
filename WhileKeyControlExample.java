package sec03.exam01_while;

public class WhileKeyControlExample {
  public static void main(String[] args) throws Exception{

    boolean run = true;
    int speed = 0;
    int keyCode = 0;
    
    While(run){
      if(keyCode!=13 && keyCode!=10){
        System.out.println("------------------");
        System.out.println("1.증속|2.감속|3.중지");
        System.out.println("------------------");
        System.out.print("선택:");
      }
    }
      keyCode = System.in.read();
      
      if(keyCode == 49){
        speed++;
        System.out.println("현재속도="+speed);
      }else if(keyCode==50){
        speed--;
        System.out.println("현재속도="+speed);
      }else if(keyCode==51){
        run = flase;
      }
    }
    System.out.println("프로그램이 종료되었습니다.")
  }

  //키보드의 enter키는 keyCode 13과 10을 갖기 때문에 enter누르는 걸로 혼란이 생기지 않도록 한다.
