package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut hoca", "TRH", "+90 500 000 00 00");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "+90 511 111 11 11");
        Teacher t3 = new Teacher("Kayhan Kaya", "BIO", "+90 522 222 22 22");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        //tarih.printTeacherInfo();

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Selen", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(90, 90, 90, 60, 60, 60);
        s1.isPass();
    }
}
