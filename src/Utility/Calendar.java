package Utility;
import java.util.*;
class FindCalendar{
	int arr[]= {31,28,31,30,31, 30,31,31,30,31,30,31};
    int arr1[][]=new int[5][7];
    void calendar(int month,int year) {
    	for(int i=1;i<=arr[month];i++) {
    		int day=Util.dayOfWeek(month, i, year);
    	}
    }
}
public class Calendar {

	public static void main(String[] args) {
		
		System.out.println("Enter Month");
		int month=Integer.parseInt(args[0]);
		System.out.println("Enter Year");
		int y=Integer.parseInt(args[1]);
}
}