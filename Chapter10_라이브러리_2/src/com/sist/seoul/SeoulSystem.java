package com.sist.seoul;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.sist.movie.MovieVO;

public class SeoulSystem {
	private static ArrayList list = new ArrayList();
	
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0;
			StringBuffer sb = new StringBuffer();
			
			while((i=fr.read()) != -1) {
				sb.append((char)i);
			}
			fr.close();
			String[] seouls = sb.toString().split("\n");
			for(String s:seouls) {
				StringTokenizer st = new StringTokenizer(s, "|");
				SeoulVO vo = new SeoulVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setName(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAddress(st.nextToken());
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//menu
		public int SeoulMenu() {
			System.out.println("===== 영화 메뉴 =====");
			System.out.println("1. 목록출력");
			System.out.println("2. 상세보기");
			System.out.println("9. 종료하기");
			System.out.println("===================");
			System.out.print("메뉴 선택:");
			Scanner scan = new Scanner(System.in);
			return scan.nextInt();
		}
		
		//목록출력
		public ArrayList seoulListData(int page) {
			int start = (page-1)*10;
			int end = page*10;
			int totalPage=(int)(Math.ceil(list.size()/10.0));
			
			if(page==totalPage) {
				end=list.size();
			}
			
			ArrayList seoulData = new ArrayList(list.subList(start, end));
			
			return seoulData;
			
		}
		
		//상세 보기
		public SeoulVO seoulDetailData(int no) {
			return (SeoulVO)list.get(no-1);
		}
		
	
		//process
		public void process() {
			while(true) {
				int menu=SeoulMenu();
				
				if(menu==9) {
					System.out.println("프로그램을 종료합니다");
					break;
				} else if(menu==1) {
					Scanner scan = new Scanner(System.in);
					int num;
					ArrayList seoulData;
					
					while(true) {
						System.out.print("페이지 입력(1~28):");
						num=scan.nextInt();
						
						if(num<1 || num>28) {
							System.out.println("페이지가 없습니다");
							continue;
						}
						
						seoulData = seoulListData(num);
						
						for(int i=0;i<seoulData.size();i++) {
							SeoulVO vo = (SeoulVO)seoulData.get(i);
							System.out.println(vo.getNo()+"."+vo.getName());
						}
						break;
					}
					
					
				} else if(menu==2) {
					Scanner scan = new Scanner(System.in);
					int num;
					SeoulVO vo;
					while(true) {
						System.out.print("상세볼 명소 번호 입력(1~273):");
						num=scan.nextInt();
						
						if(num<1 || num>273) {
							System.out.println("데이터가 없습니다.");
							continue;
						}
						
						vo = seoulDetailData(num);
						break;
					}
					
					System.out.println("번호:"+vo.getNo());
					System.out.println("이름:"+vo.getName());
					System.out.println("내용:"+vo.getContent());
					System.out.println("주소:"+vo.getAddress());
					
				
				}
				
			}
		}
}
