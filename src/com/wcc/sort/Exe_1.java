package com.wcc.sort;

import java.util.Arrays;
public class Exe_1 {
	static int a[] = { 32, 23, 11, 35, 67, 90 };

	public static void main(String[] args) {
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] < a[i - 1]) {
				int temp = a[i];
				int j = i;
				while (j > 0 && a[j - 1] > temp) {// 1.思维漏洞，就是没有考虑到
					// 不是每次都是交换的。而是都比较完了菜交换
					a[j] = a[j - 1];
					j--;
				}

				a[j] = temp;

			}
		}

		System.out.println(Arrays.toString(a));

	}

}
