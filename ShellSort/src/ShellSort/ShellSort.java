package ShellSort;

import java.util.Random;


public class ShellSort {
	 /**  
     * ���������㷨ʵ��  
     * @author zz  
     * @param arr  
     * @return  
     */  
    public static int[] shellSort(int[] arr) {   
        int temp=0;
        int k =(int) (arr.length+1)/2;
        for (k; k>0 ;--k ) {
        for (int i = 0; i < arr.length; i++) {   
            outPrint(arr);   
            if (arr[i]>arr[i+k]) {   
                temp = arr[i]  ;
                arr[i] = arr[i+k];
                arr[i+k] = temp;
            }
        }   
        }
  
    private static Object k(boolean b, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**  
     * ���  
     */  
    private static void outPrint(int[] arr) {   
        System.out.println();   
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + "|");   
        }   
    }   
    /**  
     * ������  
     */  
    private static boolean check(int[] arr) {   
        System.out.println();   
        for (int i = 1; i < arr.length; i++) {   
            if (arr[i] < arr[i - 1]) {   
                System.out.println("Sort Error!");   
                return false;   
            }   
        }   
        System.out.println("Sort Success!");   
        return true;   
    }   
    /**  
     * ���Է���  
     * @param args  
     */  
    public static void main(String[] args) {   
        // TODO Auto-generated method stub   
        Random ran = new Random();   
        int[] arr = new int[60];   
        for (int i = 0; i < arr.length; i++) {   
            arr[i]=ran.nextInt(300000);   
        }   
        System.out.println("Befor sort:");   
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i]+"|");   
        }   
        arr = ShellSort.shellsort(arr);   
        System.out.println("After sort:");   
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i]+"|");   
        }   
           
} 
}
