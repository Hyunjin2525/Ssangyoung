
//유튜브 영상
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;
public class 선택조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String fd=scan.next();
		
		Document doc=Jsoup.connect("https://genie.co.kr/chart/top200").get();
	   Elements title=doc.select("tr.list a.title");
	   Elements singer=doc.select("tr.list a.artist");
	   for(int i=0;i<title.size();i++)
	   {
		   String s=title.get(i).text();
		   if(s.contains(fd))
		   {	   
		   System.out.println(title.get(i).text()+" "
				   +singer.get(i).text());
		   }
	   }
	   Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
			   +"http://youtube.com/embed/BBdC1rl5sKY\\u0026pp"
			   + "");

		}catch(Exception ex) {}

} 
}