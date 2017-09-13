package com.wcc.sort;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int a[] = {1,32,321,4,5,3,49,32,22,13,24,45};
		
		//冒泡排序法
		for(int i=0;i<a.length-1;i++){//外层循环控制趟数
			for(int j=0;j<a.length-1-i;j++){//内层控制前后两项的交换，每轮循环开始都是从第0位开始
				if(a[j]>a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
		


}
