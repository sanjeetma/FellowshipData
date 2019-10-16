import Utility.*;
public class Abc {

	public static void main(String[] args) {
		String s[]= {"ram","apple","shyam","banana"};
		String find="ram";
		String str1="madam";
		
		
		int n1=Util.binarySearch(find, s);
		int arr[]= {1,2,5,7,3,11};
		int fin=5;
		int n2=Util.binarySearch(fin, arr);
		System.out.println(n1);
		System.out.println(n2);
	   if(!Util.pallindrom(str1)) {
		   System.out.println("Pallindrome String");  
	   }
	   else {
	    System.out.println("No Pallindrome string");
	   }
	   for(int i=2;i<=10;i++) {
	   if(Util.isPrime(i)) {
		   System.out.print(i+" ");   
	   }
	   }
	  /* else {
		   System.out.println("no prime");
	   }*/
		  
	   if(Util.isPallindromeInteger(121)) {
		   System.out.println("pallindrome");
	   }
	   else {
		   System.out.println("no Pallindrome");
	   }
	String str2="heart";
	String str3="earth";
	if(Util.isAnagram(str2, str3)) {
		   System.out.println("anagram");
	   }
	   else {
		   System.out.println("no anagram");
	   }
	if(Util.isAnagramDigit(123, 123555)) {
		System.out.println("anagram digit");
	}
	else {
		System.out.println("no anagram digit");
	}
	  
	float f1=Util.Celsius(212);
	
	   System.out.println(f1);
	   
	  float f2=Util.Fahrenheit(100);
	  System.out.println(f2);
int arr1[]= {10,5,2,1,79,20};
       Util.insertionInteger(arr1);
       for(int i=0;i<arr1.length;i++) {
    	   System.out.print(arr1[i]+" ");
       }
       String s1[]= {"ram","apple","shyam","banana"};
       Util.insertionString(s1);
       for(int i=0;i<s1.length;i++) {
    	   System.out.print(s1[i]+" ");
       }
       int day=Util.dayOfWeek(9, 26, 2019);
       String str[]= {"sun","mon","tue","wed","thurs","fri","sat"};
       System.out.println(str[day]);
       double out=Util.monthlyPayment(8, 1000, 12);
       System.out.println(out);
}
}
