public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": Eklendi");
    }

    public void delete(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": Silindi");
    }
}
