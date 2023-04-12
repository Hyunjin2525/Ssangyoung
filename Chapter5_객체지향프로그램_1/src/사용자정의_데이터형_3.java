/*
 *  1. 같은 자바파일에 클래스 여러개 만들 수 있다
 *     -----------------
 *     public은 한개의 class에서만 사용이 가능
 *  2. 권장 사항 => 파일을 따로 만든다
 */
class Category
{   
	int no;  //카테고리 구분 // 모든 클래스안에는 구분자가 있어야 됨// 중복이 안된 숫자로
	String poster;
	String title;
	String subject;
}
/*
 * 맴버변수 (인스턴스변수)
 * -------------------
 * 1. 기본형
 * 2. 배열
 * 3. 클래스
 * 
 * 
 * 
 * 
 */
class FoodHouse
{
	int no; //중복이 안된 숫자 => primary key => 상세보기   //
	int cno;// 참조키 => foreign key                    //  눈에 보이지 않는 변수 2개 
	String[] poster=new String[5];//동일한 여러개는 배열로
	String name;
	double score;
	String adress1,adress2; 
	String tel;
	String type;
	String price;
	String parking;
	String stime,etime;
	String hol;
	String menu; // 각 지점마다 메뉴가 다르기 때문에 배열로 저장하면 안됨
	
}
public class 사용자정의_데이터형_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
