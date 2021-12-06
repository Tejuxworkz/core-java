package com.xworkz.collectionapp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;


public class UtilityClassArraysEx {

	public static void main(String[] args) {
		
	String arr[]= {"Bangalore","Kolkata","Chennai","Hyderbad","Mumbai"};
	byte bt[]= {1,3,5,7,9};
	short sh[]= {1,45,8};
	int in[]= {23,34,56,789};
	long l[]= {2345,976467,457,905634};
	float f[]= {2,9,5,0,34};
	double d[]= {1.2,3.45,897.645,345789.78,86.43};
	char c[]= {'T','E','J','A','S','H','W','I','N','I'};
	boolean b[]= {true,false};
	
	
	System.out.println("The array size : "+arr.length);
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Array sort : "+arr.length);
	Arrays.sort(arr,Collections.reverseOrder());
	for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Byte size : "+bt.length);
	for(int i=0;i<bt.length;i++) {
		byte bt1=Array.getByte(bt, i);
		System.out.print(bt1+",");
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Short size : "+sh.length);
	for(int i=0;i<sh.length;i++) {
		short sh1=Array.getShort(sh, i);
		System.out.print(sh1+",");
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Int size : "+in.length);
	for(int i=0;i<in.length;i++) {
		int in1=Array.getInt(in, i);
		System.out.print(in1+",");
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Long size : "+l.length);
	for(int i=0;i<l.length;i++) {
		long l1=Array.getLong(l, i);
		System.out.print(l1+",");
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Float size : "+f.length);
	for(int i=0;i<f.length;i++) {
		float f1=Array.getFloat(f, i);
		System.out.print(f1+",");
	}
	
	
	System.out.println();
	System.out.println();
	
	System.out.println("Double size : "+d.length);
	for(int i=0;i<d.length;i++) {
		double d1=Array.getDouble(d, i);
		System.out.print(d1+",");
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Character size : "+c.length);
	for(int i=0;i<c.length;i++) {
	char c1=Array.getChar(c, i);
	System.out.print(c1+",");
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Boolean size : "+b.length);
	for(int i=0;i<b.length;i++) {
	boolean a=Array.getBoolean(b, i);
	System.out.println(a);
	}
	}
}
