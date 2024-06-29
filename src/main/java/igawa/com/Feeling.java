package igawa.com;

import java.util.List;

public class Feeling implements Temperature {
  @Override
  public String Feelings(String feeling) {
    return feeling + "it's hot";
  }
}

