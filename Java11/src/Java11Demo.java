import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Java11Demo {

	public static void IsBlankExample()
	{
		String s1="";
		System.out.println(s1.isBlank());
	}
	public static void linesExample() {
		String s1="Hi Dear \n Welcome sweet home"+"\nBye Dear";
	    Stream<String> l=s1.lines();
		System.out.println(s1);
	    l.forEach(System.out::println);
		
	}
	public static void repeatExample() {
		String s1="*";
		System.out.println(s1.repeat(5));
		
	}
	public static void stripExample() {
		String s1="   Welcome  Everyone"+" how are you?     Hello    A";
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		
	}
	public static void timeunitExample() {
		TimeUnit myhrs=TimeUnit.HOURS;
		System.out.println(myhrs.convert(Duration.ofDays(2)));
		TimeUnit mydate=TimeUnit.DAYS;
		System.out.println(mydate.convert(Duration.ofDays(2)));
		System.out.println(mydate.convert(Duration.ofHours(36)));
		
	}
	

	
	public static void main(String[] args) {
		IsBlankExample();
		linesExample();
		repeatExample();
		stripExample();
	    timeunitExample();
		
		
	}
}
