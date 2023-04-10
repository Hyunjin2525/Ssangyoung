import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 확장
	   int[] arr1= {10,20,30,40,50};
	   int[] arr2=new int[10];
	   //System.arraycopy(arr1,1,arr2,0,3);//arr1의 1번부터 3개를 copy하고 arr2 0번부터 copy한걸 저장한다
	   System.arraycopy(arr1,0,arr2,0,arr1.length);
	   //0,1,2...
	   System.out.println(Arrays.toString(arr2));
	}

}
