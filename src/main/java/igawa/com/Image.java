package igawa.com;

public class Image extends Judge {
  public String imageJudgement(int number){
    if (number == 0){
      return "not sing";
    }else {
      return "enjoy singing";
    }
  }
}
