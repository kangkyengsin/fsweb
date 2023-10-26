package a1026.example2;

import java.util.ArrayList;
import java.util.Scanner;

import ch18.sec10.Member;

public class DAO {
    Scanner sc = new Scanner(System.in);

    private ArrayList<MemberDTO> mlist;

    //file 직접 d: 저장하려면 클래스인 FileClass 만들예정
    private FileClass file = new FileClass("sun1","memberInfo");

    //생성자 constructor
    public DAO(){
        mlist = new ArrayList<MemberDTO>();	

        //테이스용 데이터
        MemberDTO m1= new MemberDTO(0, "테스트1", 11, 100, 90, 80);
        MemberDTO m2= new MemberDTO(0, "테스트2", 22, 90, 89, 91);
        MemberDTO m3= new MemberDTO(0, "테스트3", 33, 85, 77, 55);
        MemberDTO m4= new MemberDTO(0, "테스트4", 44, 77, 68, 85);
        
        mlist.add(m1);
        mlist.add(m2);
		mlist.add(m3);
		mlist.add(m4);
    }




    //CRUD
    //create
    private void insert(MemberDTO m){
        // 데이터 추가
		mlist.add(m);
        //listSize++;
    }
    //delete
    private void delete(int index) {
		mlist.remove(index);
	}
    //select (검색)
    private MemberDTO select(int index) {	
		return mlist.get(index);
	}

    //update
    private void update(int index, MemberDTO m){
        mlist.set(index,m);
    }

    // user 메소드 : 사용자의 입력값있음.
    //user Insert

    public void userInsert(){
        MemberDTO m = new MemberDTO();
        System.out.println("< 회원 정보입력 >");
        System.out.print("회원번호 : ");
        int id =  sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("국어 : ");
        int ko = sc.nextInt();
        System.out.print("영어 : ");
        int en = sc.nextInt();
        System.out.print("수학 : ");
        int ma = sc.nextInt();
        m.setId(id);
        m.setName(name);
        m.setAge(age);
        m.setKor(ko);
        m.setEng(en);
        m.setMath(ma);
        insert(m);
    }

    //인덱스 찾기 : 키 - 이름
    private int findIndex(){
        System.out.println("회원이름을 입력하시오 : ");
        String name = sc.next();
        for(int i=0; i < mlist.size();i++){
            if(mlist.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }




    //user Delete
    public void userDelete(){
        int index = findIndex();
        if(index != -1){
            delete(index);
            System.out.println("회원을 삭제했습니다."); 
        }else{
            // 이름이 없는 경우
			System.out.println("해당 회원이 없습니다.");
        }

    }

    //userSelect 멤버 값 리턴하기
    public void userSelect(){
        int index = findIndex();
        if(index != -1){ //인덱스 있는 경우
            MemberDTO m = select(index);
            int id = m.getId();
            int age = m.getAge();
			String name = m.getName();
			int kor = m.getKor();
			int eng = m.getEng();
			int math = m.getMath();
            System.out.println("< "+name + " 의 회원정보 >");
			System.out.println(" - 회원번호 : " + id);
			System.out.println(" - 이름 : " + name);
			System.out.println(" - 나이 : " + age);
			System.out.println(" - 국어 : " + kor);
			System.out.println(" - 영어 : " + eng);
			System.out.println(" - 수학 : " + math);
        }else{
            System.out.println("회원이 없습니다."); 
        }

    }  
    
    //user Update
    public void userUpdate(){
        int index = findIndex();
        if(index != -1){
            //이름이 있는 경우
            MemberDTO m = new MemberDTO();
            m.setId(mlist.get(index).getId());
            m.setName(mlist.get(index).getName());
            System.out.println("< "+ m.getName() + " 회원 정보수정 >");
            System.out.println("회원번호 : " + m.getId() );
            System.out.println("나이 :");
            m.setAge(sc.nextInt());
            System.out.print("국어 : ");
			m.setKor(sc.nextInt());
            System.out.print("영어 : ");
			m.setEng(sc.nextInt());
            System.out.print("수학 : ");
			m.setMath(sc.nextInt());

            update(index, m);
            System.out.println("수정되었습니다.");

        }else{
            // 이름이 없는 경우
			System.out.println("해당 회원이 없습니다.");
        }

    }
    //printAll - 전체리스트 출력
    public void printAll(){
        System.out.println("<전체회원목록>");
        int index = 1;
        for(int i = 0; i < mlist.size(); i++){
            System.out.println("<"+index+"."+mlist.get(i).getName()+"회원 >");
            System.out.println("회원번호 : " + mlist.get(i).getId());
            System.out.println("나이: " + mlist.get(i).getAge());
            System.out.println("국어: " + mlist.get(i).getKor());
            System.out.println("영어: " + mlist.get(i).getEng());
            System.out.println("수학: " + mlist.get(i).getMath());
            index++;
        }

    }
    
    //File method

    public void dataSave() throws Exception{
        file.create();
        String str = " 번호\t 이름\t 나이\t 국어\t 영어\t 수학\n"
				+ "----------------------------------------------------\n";
        for (int i = 0; i < mlist.size(); i++) {
            str += mlist.get(i).toString()+"\n";
        }
        System.out.println("데이터를 저장했습니다.");
        file.write(str);    
    }
    public void dataLoad() {
		try {
			file.read();
		} catch (Exception e) {
			System.out.println("읽을 파일이 없습니다.");
		}
	}


}
