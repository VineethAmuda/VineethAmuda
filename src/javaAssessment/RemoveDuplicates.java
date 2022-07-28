package javaAssessment;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int arr[], int n) {
		if(n==0 || n==1) {
		return n;
		}
		int[] rem = new int[n];
		int j =0;
		for (int i=0;i<n-1; i++) {
			if(arr[i] !=arr[i+1]) {
				rem[j++] = arr[i];
				
			}
		}
        rem [j++] = arr[n-1];
        
        for(int i=0; i<j; i++) {
        	arr[i]= rem[i];
        }
		return j;
        	
        }
	public static void main(String[] args) {
		
       int arr[] = { 21, 4, 49, 21, 2, 49 };
       Arrays.sort((arr));
       int length = arr.length;
       length = removeDuplicates(arr,length);
       
       for(int i=0; i<length; i++) 
    	   System.out.println(arr[i]+" ");
       
					
		}
	
	}


