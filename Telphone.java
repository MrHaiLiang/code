package com.unknown.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Telphone {

	public static void main(String[] args) {
		String arr[]=new String[26];
		for(int i = 0;i<26;i++){
			arr[i]=((char)(96+i+1)+"").toUpperCase();
		}
	

		List<String> list= new ArrayList(Arrays.asList(arr));
		 
		String data[]=new String[12];
		for (int i = 0; i <data.length; i++) {
				
				if(i==0) {data[i]=i+1+"";}
				if(i>0 && i<9) {
					
					if(i+1==7 || i+1==9) {
						data[i]=list.get(0)+list.get(1)+list.get(2)+list.get(3)+" "+(i+1);
						list.remove(0);
						list.remove(0);
						list.remove(0);
						list.remove(0);
					}else {
						data[i]=list.get(0)+list.get(1)+list.get(2)+"  "+(i+1);
						list.remove(0);
						list.remove(0);
						list.remove(0);
					}
				}
				if(i+1==10) {
					data[i]="*";
				}if(i+1==11) {
					data[i]="0";
					
				}if(i+1==12) {
					data[i]="#";
				}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
