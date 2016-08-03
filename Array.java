package array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args){
		int[] a = {10,7,9,2,4,5,1,3,6,8};
		Arrays.sort(a);//對a的元素從小到大排列
		int index = Arrays.binarySearch(a, 0, a.length, 5);
		//對a以binarySearch找尋元素"5"的位置
		//搜尋範圍從0到a的最後(可省略，即變成全部搜尋)
		//binarySearch只能用在已經排序好的array
		for (int i : a){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("5在第"+(index+1)+"個位置");
	}
}
