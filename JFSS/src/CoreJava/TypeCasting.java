package CoreJava;

public class TypeCasting {
	public static void main(String[] args) {
    int i=8;
    long l=i;
    float f=(float)l;

    System.out.println("Before type casting, int value "+i);  
    System.out.println("implicit or upper casting, int value "+l);  
    System.out.println("explicit or lower casting, int value "+f);

    
	}
}
