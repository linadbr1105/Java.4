package sec03.exam01_while;

public class WhileSumFrom1To100Example {
  public static void main(String[] args){

      int sum = 0;
      int i = 1;

      while(i<=100){
        sum += i;
        i++;
      }
    System.println("1~"+(i-1)+"까지의 합:"+ sum);
    }
  }
