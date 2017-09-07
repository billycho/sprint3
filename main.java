package pbi_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(3,2,5,1,2,6,5,3,2,1);
//		Collections.sort(numbers,(x,  y) ->  x - y);
//		System.out.println(numbers);
//		
	
		
		List<User> users = Arrays.asList(new  User(3,"Name #3"),new User(1,"Name #1"),
				new User(2,"Name #2"),new User(4,"Name #4"),new User(6,"Name #6"),new User(5,"Name #5"),new User(2,"Name #2"),new User(8,"Name #8"),new User(8,"Name #8"));
		
		System.out.println("lambda expression sorting. Before: ");
		for(int i = 0;i<users.size();i++)
		{
			System.out.print(users.get(i).getId());
			
			if(i + 1<users.size())
			{
				System.out.print(", ");
			}
		}
		
		System.out.println("");
		
		//Collections.sort(users,(x,  y) ->  x.getId() - y.getId());
		users.sort((x,  y) ->  x.getId() - y.getId());
	
		System.out.println("After: ");
		for(int i = 0;i<users.size();i++)
		{
			System.out.print(users.get(i).getId());
			
			if(i + 1<users.size())
			{
				System.out.print(", ");
			}
		}
		
		System.out.println("");
		
	
		
		 users = users.stream().filter(u -> u.getId() > 5).collect(Collectors.toList());
		 
			System.out.println("Lambda filtering. After: ");
			for(int i = 0;i<users.size();i++)
			{
				System.out.print(users.get(i).getId());
				
				if(i + 1<users.size())
				{
					System.out.print(", ");
				}
			}
			
			System.out.println("");
			
			users.forEach(f -> f.setId(f.getId() + 5));
			
			System.out.println("Lambda list value after all the value added by 5. After: ");
			for(int i = 0;i<users.size();i++)
			{
				System.out.print(users.get(i).getId());
				
				if(i + 1<users.size())
				{
					System.out.print(", ");
				}
			}
		 
	}

}
