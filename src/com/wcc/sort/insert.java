package com.wcc.sort;

import java.util.Arrays;



/**
 * 玩扑克牌抽插比较大小的思想，
 * 一旦当前值比前面的小，就需要将这个值取出来单独放到一边，每次循环都需要比较
 * 
 * 结束循环的条件：一是前面的值比当前值小，
 * 二是：到头了，也就是j>0;
 * @author Administrator
 *
 */
public class insert {
	public static void main(String[] args) {
		int a[] = {1,32,321,4,5,3,49,32,22,13,24,45};
		
		//插入排序法
/*		for(int i=1;i<a.length-1;i++){//插入排序第一个数不需要比较。
			if(a[i-1]>a[i]){
				int temp = a[i];   //取出要比较的数
				int j=i;			//将当前的需要赋给新的变量不要影响上面
				while(j>0 && a[j-1]>temp){
					a[j] = a[j-1];
					j--;
				}
				a[j] = temp;
			}
		}*/
		
	for(int i=1;i<a.length;i++){
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
