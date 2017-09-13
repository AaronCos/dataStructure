package com.wcc.sort;
import java.util.Arrays;
public class insert1 {
	public static void main(String[] args) {
	int a[]  = {4,45,12,45,67};
		for(int i=1;i<a.length-1;i++){
			if(a[i]<a[i-1]){
				int temp = a[i];
				int j = i;
				while(j>0 && a[j-1]>temp){
					a[j] = a[j-1];
					j--;
				}
				a[j] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
