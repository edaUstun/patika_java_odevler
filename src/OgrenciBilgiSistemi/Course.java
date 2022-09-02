package OgrenciBilgiSistemi;

public class Course {

    String name;
    String code;
    String prefix;
    Teacher teacher;

    int note;

    int teacherNote;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        int note = 0;
        int teacherNote = 0;
    }

    void addTeacher(Teacher teacher) {

        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ogretmen ve Ders bolumleri uyusmamaktadir.");
        }
    }

    void printTeacherInfo() {
        this.teacher.printTeacher();
    }

}
