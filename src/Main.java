import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setNationalIdentiy("123");
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setEmail("123@456.com");
        instructor1.setPassword("1234");
        List<String> verdigiKurslar = new ArrayList<>();
        verdigiKurslar.add("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)");
        verdigiKurslar.add("Yazılım Geliştirici Yetiştirme Kampı");
        verdigiKurslar.add("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        verdigiKurslar.add("Programlamaya Giriş İçin Temel Kurs");
        instructor1.setVerdigiKurs(verdigiKurslar);
        List<String> sertifikalar = new ArrayList<String>();
        sertifikalar.add("MCT");
        sertifikalar.add("PMP");
        sertifikalar.add("ITIL");
        instructor1.setSertifika(sertifikalar);
        instructor1.setWebSitesi(
                "https://www.youtube.com/channel/UCRjiquPh4mjPNoOV9eCilXQ");


        Student student1 = new Student();
        student1.setId(2);
        student1.setNationalIdentiy("124");
        student1.setFirstName("Ali Gokberk");
        student1.setLastName("Uguz");
        student1.setEmail("789@123.com");
        student1.setPassword("1234");
        List<String> aldigiKurslar = new ArrayList<>();
        aldigiKurslar.add("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        student1.setAldigiKurs(aldigiKurslar);
        student1.setKurum("Etiya");


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.delete(instructor1);
        instructorManager.add(instructor1);
        instructorManager.icerikEkle(instructor1);


        StudentManager studentManager = new StudentManager();
        studentManager.delete(student1);
        studentManager.add(student1);
        studentManager.odevYukle(student1);

    }
}