package Utility;
import java.util.*;
 class Anagram{
	 ArrayList<Integer> list=new ArrayList<Integer>();
	 void find(int n1,int n2) {
		 
		 int j=0;
		 int count=0;
		 for(int i=n1;i<=n2;i++) {
			 if(Util.isPrime(i)) {
				 list.add(i);
	               }
           }
		 checkAnagram(list);
      }
	 void checkAnagram(ArrayList<Integer> list)
	 {
		 int counter=0;
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
			if(Util.isAnagramDigit(list.get(i), list.get(j))) {
				System.out.print(list.get(i)+"-->"+list.get(j)+" ");
				counter++;
			}
		}
			System.out.println();
		}
	 }
 }

public class PrimeAnagram {

	public static void main(String[] args) {
		Anagram obj=new Anagram();
		obj.find(0,1000);
		//obj.show();

	}

}
