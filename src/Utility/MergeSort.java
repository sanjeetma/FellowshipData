package Utility;

class Divide{
	int a[]=new int[6];
	void divideArr(int arr[],int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			divideArr(arr,low,mid);
			divideArr(arr,mid+1,high);
			mergeArr(arr,low,mid,high);
		}
	}
	 public void mergeArr(int arr[],int low,int mid,int high) 
	 {
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid&&j<=high) {
			if(arr[i]<=arr[j]) {
				a[i]=arr[i];
				i++;
				k++;
			}
			else {
				a[k]=arr[j];
				k++;
				j++;
			}
		}
		if(i>mid) {
			while(j<high) {
				a[k]=arr[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				a[k]=arr[i];
				k++;
				i++;
			}
		}
	}
	 
	 void print() {
		 for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
	 }	 
	
}
public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {5,8,2,7,1,0};
		int low=0;
		int high=arr.length-1;
		Divide obj=new Divide();
		obj.divideArr(arr, low, high);
		obj.print();
	}

}
