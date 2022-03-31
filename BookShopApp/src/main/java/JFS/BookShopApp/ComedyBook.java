package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComedyBook {
	@Value("#{19+10}")
	private int y;
	
	@Value("#{'Saranya ' + 'Saravanan'}") 
	private String addString;
	
	@Value("#{20 - 1}") 
	private int subtract;
	
	@Value("#{36 / 2}") 
	private double divideAlphabetic; 
	
	@Value("#{37 mod 10}") 
	private double moduloAlphabetic;
	
	@Value("#{2 ^ 9}") 
	private double powerOf;

	@Value("#{(2 + 2) * 2 + 9}")
	private int brackets;
	
	@Value("#{1 == 1}")
	private boolean equal;
	
	@Value("#{1 != 1}") 
	private boolean notEqual;
	
	@Value("#{1 lt 1}") 
	private boolean lessThanAlphabetic;

	@Value("#{1 <= 1}")
	private boolean lessThanOrEqual;

	@Value("#{1 > 1}") 
	private boolean greaterThan;

	@Value("#{1 >= 1}")
	private boolean greaterThanOrEqual;
	
	@Value("#{250 > 200 && 200 < 4000}") 
	private boolean and; 

	@Value("#{250 > 200 and 200 < 4000}") 
	private boolean andAlphabetic;

	@Value("#{400 > 300 || 150 < 100}")
	private boolean or;

	@Value("#{400 > 300 or 150 < 100}") 
	private boolean orAlphabetic;

	@Value("#{!false}")
	private boolean not;

	@Value("#{not true}") 
	private boolean notAlphabetic;
	@Value("#{2 < 1 ? 'a' : 'b'}") 
	private String ternary;
	
	
		public Integer comedyBookCount()
		{
			Integer count = 100;
			count+=y;
			System.out.println("Arthimetic Operators");
			System.out.println(count);
			System.out.println(addString);
			System.out.println(subtract);
			System.out.println(divideAlphabetic);
			System.out.println(moduloAlphabetic);
			System.out.println(powerOf);
			System.out.println(brackets);
			System.out.println("Relational and Logical Operators");
			System.out.println(equal);
			System.out.println(notEqual);
			System.out.println(lessThanAlphabetic);
			System.out.println(lessThanOrEqual);
			System.out.println(greaterThan);
			System.out.println(greaterThanOrEqual);
			System.out.println("Logical Operators ");
			System.out.println(and);
			System.out.println(andAlphabetic);
			System.out.println(or);
			System.out.println(orAlphabetic);
			System.out.println(not);
			System.out.println(notAlphabetic);
			System.out.println("Conditional Operators  ");
			System.out.println(ternary);
		
		
			return count;
			
		}
	}
