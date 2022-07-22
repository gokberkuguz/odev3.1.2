public class InstructorManager extends UserManager{
    public void icerikEkle(Instructor instructor){
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+": Icerik ekledi");
    }
}
