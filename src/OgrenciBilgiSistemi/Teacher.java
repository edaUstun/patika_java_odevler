package OgrenciBilgiSistemi;

public class Teacher {
    String name;
    String branch;
    String mpno;


    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void printTeacher() {
        System.out.println("Adi: " + this.name);
        System.out.println("Adi: " + this.branch);
        System.out.println("Adi: " + this.mpno);
    }
}
