package a1026.example;

import java.io.File;

public class FileClass {
    private File file;
    private String dir;
    private String fileName;
    public FileClass(){
        file = new File("d:\\");

    }
    public FileClass(String dir, String fileName) {
        file = new File("d:\\" + dir + "\\" + fileName + ".txt");
        this.dir = "d:\\" + dir;
        this.fileName = fileName + ".txt";
        // d:\Temp\abc.txt
    }
    // 파일명이 잇는지 확인하기
    public boolean check(File file){
        if(file.exists()){
            return true;
        }
        return false;
    }

    //create
    public void create() throws Exception{
        boolean exist = check(file);
        if(exist){
            file.delete();
            
        }
    }

}
