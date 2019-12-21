package com.arrays;

public class TestA {

	public static void main(String[] args) {

		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 10;
		nums[3] = 20;
		nums[4] = 10;


		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}

		System.out.println("=====================");

		int[] i = {10,20,30,40,50};
		for(int n : i) {
			System.out.println(n);

		}
		byte[] b = {1,5,8,4,7};
		for(int m = 0; m<b.length;m++) {
			System.out.println(b[m]);
		}
		System.out.println("========byte===========");
		for(int n : b) {
			System.out.println(n);

		}
		System.out.println("======double==========");
		double[] d = {25.5,22.1,44.1,23.8,47.6};
        for(double n=0;n<d.length;n++) {
        	System.out.println(d[(int) n]);
        }
        System.out.println("=========string=========");
        String[] s = {"rrr", "dddd", "eeee", "ggggg"};
        
        for(int e=0;e<s.length;e++) {
        	System.out.println(s[e]);
        }

	}
}
