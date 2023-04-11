package arrays;

import java.util.Scanner;

public class SumOddEvenArray {

	public static void main(String[] args) {

		int odd=0,even=0;
		Scanner sc=new Scanner (System.in);	
    int size = sc.nextInt();
    int arr[] =new int[size];
    System.out.println("Enter the size of array;");
    for(int i=0; i<arr.length; i++) {
    	
    	arr[i] =sc.nextInt();
    }
    for(int i:arr) {
    	
    if(i%2==0)
    	even++;
    else
    	odd++;
	}
    		System.out.println("Total even number:"+even);
    		System.out.println("Total odd number:"+odd);
    	

}}
