package com.basic;

public class Objectarray {

	
	
	private void m1() {
		
		int b = 10;
		
		Object a []= new Object [2];
		
		
		a[0]=10;
		a[1]=20;
		
		System.out.println(a[0]);

	}
	private void m2() {
		
		Object a [][]= new Object [2][2];
		
		a[0][0]=10;
		a[0][1]="nisha";
		a[1][0]='n';
		a[1][1]=89.6;
		
for (int i = 0; i < a.length; i++) {
	
	for (int j = 0; j < a.length; j++) {
		
		
		System.out.println(a[i][j]);
		
		
	}
	
}

			
	}
	
	
	public static void main(String[] args) {
		
		Objectarray obj =  new Objectarray();
		
		obj.m2();
		
		
		
		
		
		
	}
	
	
	
	
}
