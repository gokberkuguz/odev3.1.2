public class StudentManager extends UserManager{
    public void odevYukle(Student student){
        System.out.println(student.getFirstName()+" "+student.getLastName()+": Odev Yukledi");
    }
}
