import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Number {
	public static boolean isMoreThanFifty(int n) {
	    return (n > 50);
	  }
	public static boolean isMoreThanForty(int n) {
	    return (n > 40);
	  }
	  public static List<Integer> findNumbers(
	    List<Integer> l, Predicate<Integer> p) {
	      List<Integer> newList = new ArrayList<>();
	      for(Integer i : l) {
	        if(p.test(i)) {
	          newList.add(i);
	        }
	      }
	      return newList;
	  }
}
