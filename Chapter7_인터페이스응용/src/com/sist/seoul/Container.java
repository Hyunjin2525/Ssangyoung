package com.sist.seoul;
import java.util.*;

public class Container {
	String[] clsArr= {
			"com.sist.seoul.SeoulLocation",
			"com.sist.seoul.SeoulNature",
			"com.sist.seoul.SeoulShopping",
			"com.sist.seoul.SeoulHotel",
			"com.sist.seoul.SeoulGestHouse"
	};
	private String[] key=
		{
				"loc","nat", "shop","hotel","guest"
		};
	private Map clsMap=new HashMap();
	//Map=> key,value ==> interface
	public Container()
	{
		try {
			for(int i=0;i<key.length;i++)
			{
				Class clsName=Class.forName(clsArr[i]);
				Object obj=clsName.getDeclaredConstructor().newInstance();
				System.out.println(obj);
				clsMap.put(key[i], obj);
			}
			
		}catch(Exception e) {}
	}

	public Object getBean(String key)
	{
		return clsMap.get(key);
	}
	public static void main(String[] args) {
		Container c=new Container();
		
	}
}
