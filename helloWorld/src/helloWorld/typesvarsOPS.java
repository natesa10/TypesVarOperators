package helloWorld;

public class typesvarsOPS {
	public static void main(String[] args) {
		System.out.println("Yo");
		//Error for uninitialized 
		int field1 = 0;
		
		int field2;
		System.out.println("Field1 Val: "+field1+" field2 Val:"+field2);
		//Error for illegal field name
		int field x=0;
		
		int fieldtemp="hi";
		int fieldx=field2; 
		
		
	}
}
