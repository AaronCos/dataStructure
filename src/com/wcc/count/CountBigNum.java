package com.wcc.count;

import java.math.BigDecimal;
/**
 *     使用BigDecimal类来进行计算的时候，主要分为以下步骤：

             1、用float或者double变量构建BigDecimal对象。

             2、通过调用BigDecimal的加，减，乘，除等相应的方法进行算术运算。

             3、把BigDecimal对象转换成float，double，int等类型
 * @author Administrator
 *
 */
public class CountBigNum {
	
	public static void main(String[] args) {
		System.out.println("7.22-7.00000001"+(7.22f-0.000001));
		System.out.println("7.22-7.0000001="+subtracts(7.22, 7.00001));
		System.out.println(new BigDecimal(Double.toString(0.488888888888888)));
	}
	
	
	public static BigDecimal subtracts(double d1,double d2){
		BigDecimal b1 = new BigDecimal(Double.toString(d1));//必须转化成字符串，才能狗够实现精确计算
		BigDecimal b2 = new BigDecimal(Double.toString(d2));
		return b1.subtract(b2);
		
		
	}
	

}
