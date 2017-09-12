import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Main {
	public static void main(String args[]){
		//PBI 3
		//Predicate example
		List<Integer> numbers = Arrays.asList(3,2,5,1,11,6,5,3,2,1);
		
		System.out.println("Predicate Example print even number:");
	    predicateEx(numbers, n-> n%2 == 0 );
	    
	    //BinaryOperator Example
	    BinaryOperator<Integer> add = (a,b)->a+b;
	    System.out.println(add.apply(100,4));
	    
	    //Function Example
	    Function<Integer,String> converter = (i)-> Integer.toString(i);
	    
	    System.out.println(converter.apply(3000).length());
	    System.out.println(converter.apply(30).length());
	    
	    //Consumer Example
	    Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
	    c.accept("MITRAIS");
	    
	    //Supplier Example
	    Supplier<String> i  = ()-> "mitrais";
	    System.out.println(i.get());
	    
	    //PBI 4
	    List<Integer> list = Arrays.asList(42,45,85,18,33,74,50);
	    List<Integer> res;

		 // Using an anonymous class
//		 res = Number.findNumbers(list, new Predicate< Integer>() {
//		 public boolean test( Integer i) {
//		     return Number.isMoreThanFifty(i);
//		 }
//		 });
//		 System.out.println("Anonymous class: ");
//		 for (Integer j: res){
//			 System.out.print(j+", ");
//		 }
//		 System.out.println();
		 
		 // Using a method reference for static method
		 res = Number.findNumbers(list, Number::isMoreThanForty);
		 System.out.println("Method reference static method: ");
		 for (Integer j: res){
			 System.out.print(j+", ");
		 }
		 
		 // Using a lambda expression for non static method
		 Number number = new Number(2);
		 
		 res = Number.findNumbers(list, x -> number.ifMinXStillMoreThanForty(x));
		 System.out.println("Lambda Expression non static method: ");
		 for (Integer j: res){
			 System.out.print(j+", ");
		 }
		 System.out.println();
		 
		// Using a method reference for non static method
		res = Number.findNumbers(list, Number::ifMinXStillMoreThanForty());
		System.out.println("Method Reference non static method: ");
		for (Integer j: res){
			System.out.print(j+", ");
			}
		System.out.println();
		}
	
	public static void predicateEx(List<Integer> list, Predicate<Integer> predicate) {
	      for(Integer n: list) {
			
	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }
}
