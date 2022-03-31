package CoreJava;

public class ArrayDemo {
	public static void main(String[] args) {
		int evenno[]= {1,2,5,6,3,2,8,10,12,13};
		int oddno[]={1,2,5,6,3,2,8,9,11,25};  
		int primeno[]=new int[4];
		primeno[0]=3;
		primeno[1]=5;
		primeno[2]=7;
		primeno[3]=3;
		for(int p=0;p<primeno.length;p++){ 
			System.out.println("prime Numbers is "+primeno[p]);
		}
	    System.out.println("Odd Numbers:");  
	    for(int i=0;i<oddno.length;i++){  
	    if(oddno[i]%2!=0){  
	    System.out.println(oddno[i]);  
	} 
	    }
	    System.out.println("Even Numbers:");  
	    for(int s=0;s<evenno.length;s++){  
	    if(evenno[s]%2==0){  
	    System.out.println(evenno[s]);  
	} 
	}
	}
	}


