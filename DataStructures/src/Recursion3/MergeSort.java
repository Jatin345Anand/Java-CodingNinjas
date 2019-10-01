package Recursion3;

import Recursion.TakeData;

public class MergeSort {
 
   	public static int[] ans;
	public static void merge(int input[], int start, int mid, int end) {
		int i = 0, j = 0, k = start;
		int nL;
		int nR;
		nL = mid -start +1;
		nR = end-mid;
//		if(end%2==0) {
//			nL = mid -start +1;
//			nR = end-mid;
//		}
//		else {
//			nL = mid -start+1;
//			nR = (end-mid)+1;
//		}
		int L[] = new int[nL];
		int R[] = new int[nR];
		System.out.println("LEFT");
		for(int i1=0;i1<nL;i1++) {
			L[i1] = input[start+i1];
			System.out.print(L[i1]+" ");
		}
		System.out.println();
		System.out.println("RIGHT");
		for(int i1=0;i1<nR;i1++) {
			R[i1] = input[mid+1+i1];
			System.out.print(R[i1]+" ");
		}
		System.out.println();
 		System.out.println("Mid index : " + mid + " Mid Value : " + input[mid]+" Start :"+start+" end : "+end);
		while(i< nL && j< nR) {
			if(L[i] <= R[j]) {
				
				input[k] = L[i];
				System.out.println(" small A[i] "+input[k]);
				i++;
			}
			else {
			    input[k] = R[j];
			    System.out.println(" small A[j] "+input[k]);
                j++;
			}
			k++;
//			System.out.println("i terms : "+ input[i] );
//            System.out.println("j terms : "+ input[j] );
			
		}
		System.out.println("i+k : "+i+" mid : "+mid);
		while(i<nL) {
			input[k] = L[i];
			i++;
			k++;
			
		}
		System.out.println("j+k : "+j+" end : "+end);
		while(j<nR) {
			input[k] = R[j];
			j++;
			k++;
			
		}
//		System.out.println();
//		for(int l=0;l<input.length;l++) {
//			System.out.print(input[l]+" ");
//		}
//		System.out.println();
//		while(i<=mid) {
//			System.out.println("i terms remains : "+input[i]);
//		}
//		while(j<=end) {
//			System.out.println("j terms remains : "+input[j]);
//		}
		if (mid < input.length / 2) {
			System.out.println("Left Array");
			for (i = start; i <= end; i++) {
				System.out.print(input[i] + " ");
			}
			System.out.println();
//			System.out.println("Mid index : " + m + " Mid Value : " + input[m]);
//			mergeSortH(input, m, end);
		} else {
			System.out.println("Right Array");
			for (i = start; i <= end; i++) {
				System.out.print(input[i] + " ");
			}
			System.out.println();
//			System.out.println("Mid index : " + m + " Mid Value : " + input[m]);
//			mergeSortH(input, start, m - 1);
		}
//		System.out.println(i+"  "+j+ " "+eL+" "+eR);
//		while (i < eL && j < eR) {
//			System.out.println("inside while "+input[i]+ " "+ input[j]);
//			if (input[i] <= input[j]) {
//				ans[k++] = input[i];
//			}
//			else {
//				ans[k++] = input[j];
//			}
//			i++; j++;
//		}
//		while (i < eL) {
//			ans[k++] = input[i];
//			i++;
//		}
//		while (j < eR) {
//			ans[k++] = input[j];
//			j++;
//		}
//		return ans;
	}
//9
//9 8 5 6 7 4 1 2 3
	public static void MergeSort(int[] input, int left, int right) {
		if (left < right) {
			int m = left + (right - left) / 2;
//			for (int i = left; i < right; i++) {
//				System.out.print(input[i] + " ");
//			}
//			System.out.println("Sub array printed");
//			System.out.println("Left Call");
			MergeSort(input, left, m);

//			System.out.println("Right Call");
			MergeSort(input, m + 1, right);

			merge(input, left, m, right);
		}

	}

	public static void mergeSort(int[] input) {
		// Write your code here
		MergeSort(input, 0, input.length-1);
//		System.out.println("M : " + input[input.length / 2] + " Lenght : " + input.length);
		System.out.println();

//			System.out.print(input[i] + "  ");
//		}		for (int i = 0; i < ans.length; i++) {
		return;
	}

//8
//2 4 1 6 8 5 3 7 
	public static void main(String[] args) {
		int n = TakeData.TakeInt();
		int A[] = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = TakeData.TakeInt();
		}
//		int e = TakeData.TakeInt();
//	    System.out.println("Ans :"+	binarySearch(A, e));
		mergeSort(A);
//		System.out.println("ANS2 : "+Arrays.binarySearch(A, 436)+Arrays.search);
	}
}
