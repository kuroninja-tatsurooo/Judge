package igawa.com;

import java.util.List;
import java.util.Map;

public class Judge implements KaraokeJudgement {
  public String KaraokejudgeNumber(int number){
    if(number >= 90){
      return number +"点 "+"Excellent !";
    }else if(75 <= number){
      return number +"点 "+"Wonderful";
    }else{
      return number +"点 "+"Fight";
    }
  }
}
