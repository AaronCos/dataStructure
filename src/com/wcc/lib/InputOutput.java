package com.wcc.lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
	public static int ans = 33;
	public static void main(String[] args) {
		System.out.println("The number is "+ans);
	}
	
	public static String getString() throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String s = br.readLine();
		return s;
	}
	
	
	public static char getChar() throws IOException{
		String s = getString();
		return s.charAt(0);
	}
	public static int getInt() throws IOException{
		String s = getString();
		return Integer.parseInt(s);
	}
	public static double getDouble() throws IOException{
		String s = getString();
		Double val = Double.valueOf(s);
		return val.doubleValue();
	}
}

/*
 *增加，修改，删除
 *2、array
 *3、c
 *4、
 *5、
 *6、a
 *7、public class A{}
 *8、方法
 *9、.
 *10、基本数据类型
 */
