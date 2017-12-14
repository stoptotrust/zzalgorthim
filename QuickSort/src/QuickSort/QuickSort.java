package QuickSort;

/** 
 * ���������������ؼ���  ��ע�⴦���ϸ�ڣ�
 * ѡ��Ԫ pivotkey  ȡͷ��β���
 * �Ӽ�����
 * ���Ԫ�ص�����Ԫ��ô�죿  1 ͣ��������  2�������������ƶ�ָ��
 */

public class QuickSort {

	 public static void main(String[] args) {  
	        int[] array = { 49, 38, 65, 97, 76, 13, 27 };  
	        quickSort(array, 0, array.length - 1);  
	        for (int i = 0; i < array.length; i++) {  
	            System.out.print(array[i] + " -- ");  
	        }  
	    }  
	  
	    /** 
	     * �Ȱ�������Ϊ����ԭ��д���㷨����д����չ���㷨������{49,38,65,97,76,13,27} 
	     *  
	     * @param array 
	     * @param left 
	     * @param right 
	     */  
	    public static void quickSort(int[] array, int left, int right) {  
	        int pivotKey;  
	        if (left < right) {  
	            pivotKey = partitionByPivotValue(array, left, right);  
	            // ����������ݹ���ÿ�������ֱ��˳����ȫ��ȷ  
	            quickSort(array, left, pivotKey - 1);  
	            quickSort(array, pivotKey + 1, right);  
	        }  
	    }  
	  
	    /** 
	     * pivotValue��Ϊ���ᣬ��֮С��Ԫ������������󣬽�֮���Ԫ������������� 
	     *  
	     * @param array 
	     * @param left 
	     * @param right 
	     * @return 
	     */  
	    public static int partitionByPivotValue(int[] array, int left, int right) {  
	        int pivotValue = array[left];  
	        // ����ѡ������Զ���䣬�������м䣬ǰС���  
	        while (left < right) {  
	            while (left < right&& array[right] >= pivotValue) {  
	                --right;  
	            }  
	            // ��������С��Ԫ���Ƶ��Ͷˣ���ʱrightλ�൱�ڿգ��ȴ���λ��pivotkey���������  
	            array[left] = array[right];  
	            while (left < right&& array[left] <= pivotValue) {  
	                ++left;  
	            }  
	            // ����������Ԫ���Ƶ��߶ˣ���ʱleftλ�൱�ڿգ��ȴ���λ��pivotkeyС��������  
	            array[right] = array[left];  
	        }  
	        // ��left == right�����һ�˿������򣬴�ʱleftλ�൱�ڿգ��ȴ�pivotkey����  
	        array[left] = pivotValue;  
	        return left;  
	    }  
}
