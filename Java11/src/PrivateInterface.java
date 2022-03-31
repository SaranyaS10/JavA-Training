
public interface PrivateInterface {

	public abstract void abstractMethod();
	private static void privateMethod() {
		System.out.println("I am inside privateMethod");
	}
	public default void defaultMethod() {
		privateMethod();
		normalMethod();
	}
	public static void staticMethod() {
		privateMethod();
	}
	private  void normalMethod() {
		privateMethod();
	}
	
	
}
