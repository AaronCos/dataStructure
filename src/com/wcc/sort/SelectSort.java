package com.wcc.sort;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int a[] = {5,23,5,3,1,1,45,90};
		for(int i=0;i<a.length-1;i++){
			int k = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[k]){
					k=j;
				}
			}
			if(k!=i){
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;				
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
