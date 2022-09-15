package com.sort.pll;
import java.util.*;

public class SortArray {
	public static void main(String[]args) {
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("ener the elements you want:");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter all the elememts:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("Sorted list:");
			 for(int i=0;i<n;i++) {
			    System.out.println(a[i]);
			    sc.close();
		}
		
	}

}
