package OgrenciBilgiSistemi;

public class Student {

    Course c1;
    Course c2;
    Course c3;


    String name;
    String stuNo;
    String classes;
    double avg;

    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;

        this.c1 = course1;
        this.c2 = course2;
        this.c3 = course3;

        this.avg = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int note4, int note5, int note6) {

        if(note1 >= 0 && note1<=100) {
            c1.note = note1;
        }
        if(note2 >= 0 && note2<=100) {
            c2.note = note2;
        }
        if(note3 >= 0 && note3<=100) {
            c3.note = note3;
        }
        if(note4 >= 0 && note4<=100) {
            this.c1.teacherNote = note4;
        }
        if(note5 >= 0 && note5<=100) {
            this.c2.teacherNote = note5;
        }
        if(note6 >= 0 && note6<=100) {
            this.c3.teacherNote = note6;
        }
    }

    void isPass() {
        this.avg = ((this.c1.note*0.20 + this.c1.teacherNote*0.80) + (this.c2.note*0.20 + this.c2.teacherNote*0.80) + (this.c3.note*0.20 + this.c3.teacherNote*0.80)) / 3.00;

        if(this.avg > 55) {
            System.out.println("Sinifi basarili bir sekilde gectiniz..");
            this.isPass = true;
        } else {
            System.out.println("Sinifi gecemediniz..");
            this.isPass = false;
        }

        printNote();
    }

    void calcAvg() {

    }

    void printNote() {
        System.out.println("=======================================");
        System.out.println(c1.name + " Notu\t: " + c1.note);
        System.out.println(c1.name + " Sozlu Notu\t: " + c1.teacherNote);
        System.out.println(c2.name + " Notu\t: " + c2.note);
        System.out.println(c2.name + " Sozlu Notu\t: " + c2.teacherNote);
        System.out.println(c3.name + " Notu\t: " + c3.note);
        System.out.println(c3.name + " Sozlu Notu\t: " + c3.teacherNote);

        System.out.println("Ortalamaniz: " + this.avg);

    }
}
