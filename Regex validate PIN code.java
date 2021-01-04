public class Solution {

  public static boolean validatePin(String pin) {
    String rgx = "\\d+";
    if(pin.length() == 4 || pin.length() == 6){
        return pin.matches(rgx);
    }else{
        return false;
    }
  }

}