package practiceCode;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JAVA";  // here s1 referring JAVA
		 
        String s2 = "JAVA";
 
        System.out.println(s1 == s2);    // output true
 
        s1 = s1 + "J2EE";  // here s1 referring JAVAJ2EE different object
 
        System.out.println(s1 == s2);    // output false

	}

}
