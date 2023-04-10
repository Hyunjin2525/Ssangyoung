
public class 문제10 {
	public static void main(String[] arg) 
	{
	    int num1 = 2;
	    int num2 = 7;
	    int num3; 
	    int num4; 
	    num1++; 
	    num3 = --num1; //2
	    --num2;//6 
	    num4 = num2++; 
	    System.out.printf("%d\n", num3);//2
	    System.out.printf("%d\n", num4);//6 
	}


}
