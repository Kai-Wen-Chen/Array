package array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args){
		int[] a = {10,7,9,2,4,5,1,3,6,8};
		Arrays.sort(a);//��a�������q�p��j�ƦC
		int index = Arrays.binarySearch(a, 0, a.length, 5);
		//��a�HbinarySearch��M����"5"����m
		//�j�M�d��q0��a���̫�(�i�ٲ��A�Y�ܦ������j�M)
		//binarySearch�u��Φb�w�g�ƧǦn��array
		for (int i : a){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("5�b��"+(index+1)+"�Ӧ�m");
	}
}
