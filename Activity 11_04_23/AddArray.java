package arrays;
import java.util.Arrays;  
public class ArryaAddTwo {


	  
	public static void main(String[] args) {  
	int arr1[]= {1,2,3,4,5,6}; 
	int arr2[] ={2,3,5,6,7,8};
	
	int arr3[] =new int[arr1.length];
	
	if(arr1.length==arr2.length) {
		
	for(int i = 0 ,j=0, k=0; i<arr1.length; i++,j++,k++){
		arr3[k] =arr1[i]+arr2[j];
		}
	System.out.println("Addition of two array :"+Arrays.toString(arr3));
	
		
	}else {
		System.out.println("length is not same for both array");
	}
	
	} 
	}
