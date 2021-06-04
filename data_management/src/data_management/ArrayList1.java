package data_management;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
     
  /*  public static void printAttendanceList() {
        for (Attendance Attendance : Attendancelist) {
            System.out.println(Attendance);
        }
    }
    */
public class ArrayList1 {
	static Scanner scan = new Scanner(System.in);
	
	static ArrayList<PhoneItem> phonelist = new ArrayList<PhoneItem>();
	
    public static void main(String[] args) throws IOException 
	    
       #메모장에 저장해둔 파일
       String filePath = "C:/Users/opkln/eclipse-workspace/data.txt";
       
       File file = new File(filePath);
        if(file.exists()){ 
           BufferedReader reader = new BufferedReader(new FileReader(file)); 
           //System.out.println("파일내용 출력—————————"); 
           String line = null; 
           while ((line = reader.readLine()) != null){ 
              //System.out.println(line); 
              String[] strArray = line.split(",");
              //System.out.println("strArray 값내 첫번째 값 확인: "+strArray[0]);
              //System.out.println("strArray 값내 두번째 값 확인: "+strArray[1]);
              //System.out.println("strArray 값내 세번째 값 확인: "+strArray[2]);
              phonelist.add(new PhoneItem(strArray[0], strArray[1], strArray[2]));
              } 
           //System.out.println("———————————————"); 
           reader.close(); 
           }
        // System.out.println(file);
        printPhoneList();
        PhoneStart();
        }
    
    public static void printPhoneList() {
        //enhanced for loop
        for (PhoneItem phoneItem : phonelist) {
            System.out.println(phoneItem);
        }
    }
    public static void addPhoneList() {
    	System.out.println();
		System.out.println("새롭게 등록할 사내연락처 정보를 입력하세요");
		System.out.print("부서명 >> ");
		String name = scan.next();
		
		System.out.print("직함 >> ");
		String title = scan.next();
		
		System.out.print("전화번호 >> ");
		scan.nextLine();
		String telNum = scan.nextLine();
		
		phonelist.add(new PhoneItem(name, title, telNum));
		System.out.println(telNum + "전화번호의 정보 등록 완료");
    }
    
    /*public static void setPhoneList() {
    	System.out.println();
		System.out.println("새롭게 수정할 사내연락처 정보를 입력하세요");
		System.out.print("부서명 >> ");
		String name = scan.next();
		
		System.out.print("직함 >> ");
		String title = scan.nextLine();
		
		System.out.print("전화번호 >> ");
		scan.nextLine();	
		String telNum = scan.next();
		
		//PhoneItem p = new PhoneItem(name, title, telNum);
		int index = Arrays.binarySearch(strArray, name);
		phonelist.set(name, new PhoneItem(name, title, telNum));

		System.out.println(telNum + "전화번호의 정보 수정 완료");
		
    }*/
    public static void removePhoneList() {
    	System.out.println();
		System.out.println("삭제할 사내연락처 정보를 입력하세요");
		System.out.print("전화번호 >> ");
		String telNum = scan.next();
		
		phonelist.remove(telNum);
		
		System.out.println("삭제 작업 완료");
    }
    public static void displayMenu(){
		System.out.println();
		System.out.println("메뉴를 선택하세요.");
		System.out.println(" 1. 사내연락처 등록");
		System.out.println(" 2. 사내연락처 수정");
		System.out.println(" 3. 사내연락처 삭제");
		System.out.println(" 0. 프로그램 종료");
		System.out.print(" 번호입력 >> ");		
	}
    public static void PhoneStart() {
    	while(true){
    		displayMenu();
    		
			int menuNum = scan.nextInt();   // 메뉴 번호 입력
			
			switch(menuNum){
				case 1 : addPhoneList();		// 등록
					break;
				//case 2 : update();		// 수정
				//	break;
				case 3 : removePhoneList();		// 삭제
					break;
				case 0 :
					System.out.println("프로그램을 종료합니다");
					return;
				default :
					System.out.println("잘못 입력했습니다. 다시입력하세요.");
			} 
		} 
    }
}
