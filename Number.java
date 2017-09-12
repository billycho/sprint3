import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Number {
	int x;
	
	private Number(int x){
		this.x=x;
	}
	public boolean ifMinXStillMoreThanForty(int n) {
		int nminx = n-this.x;
		return isMoreThanForty(nminx);
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
