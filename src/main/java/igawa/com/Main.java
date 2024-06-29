package igawa.com;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    Judge judge = new Judge();
//    String message = judge.toString();
    int number = 60;

    Feeling feeling = new Feeling();
    String message1 = feeling.Feelings("30℃");

    Image image = new Image();
    int number1 = 0;


    String message = judge.KaraokejudgeNumber(number);
    String message2 = image.ImageJudgement(number1);

    Printer printer = new Printer();
    printer.printmessage(message);
    printer.printmessage(message1);
    printer.printmessage(message2);
  }
}