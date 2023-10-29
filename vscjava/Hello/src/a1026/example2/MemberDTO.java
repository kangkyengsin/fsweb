package a1026.example2;

public class MemberDTO {
    private int id;
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // 기본생성자
	public MemberDTO() {
		
	}

    public MemberDTO(int id, String name, int age, int kor, int eng, int math) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // toString
	public String toString () {
		return " "+ id + "\t" + name + "\t" + age + "\t" + kor + "\t" + eng + "\t" + math;
	}

}
