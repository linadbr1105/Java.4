package sec03.exam01_for;

public class ForFloatCounterExample {
  public static void main(String[] args){

    for(float x = 0.1f; x<=1.0f; x+=0.1f;){
      System.out.println(x);
      //10번 반복할 것 같지만 float이 정확한 정수가 아니라 0.90000001이런 쓰레기값을 가져서
      //9번까지만 한다.
    }

    }
  }
