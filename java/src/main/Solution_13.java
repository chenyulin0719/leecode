import java.util.HashMap;
import java.util.Map;

public class Solution_13 {
  public int romanToInt(String input) {
    //trace from input's end, if encounter lower value type,minus it
    Map<Character, Integer> valMap = new HashMap<>();
    valMap.put('M',1000);
    valMap.put('D',500);
    valMap.put('C',100);
    valMap.put('L',50);
    valMap.put('X',10);
    valMap.put('V',5);
    valMap.put('I',1);

    int num = 0;
    int typeRecoder = 1;
    for (int i = input.length() - 1; i >= 0; i--) {
      int  val = valMap.get(input.charAt(i));
      if(val < typeRecoder){
        num -= val;
      }else{
        typeRecoder = val;
        num += val;
      }

    }
    return num;
  }
}
