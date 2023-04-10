
public class 문제11 {
	public static void main(String[] arg) 
	{
	    int i = 0;
	    int re = 0; 
	    i=3;
	    re = ++i;
	    System.out.println("re:"+re + ", i:"+i);//re:4,i:4
	    i = 3;
	    re = i++;
	    System.out.println("re:"+re + ", i:"+i);//re:3 i:4 
	}


}
