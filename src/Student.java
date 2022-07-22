import java.util.List;

public class Student extends User{
    private List<String> aldigiKurs;
    private String kurum;

    public Student(){

    }


    public List<String> getAldigiKurs() {
        return aldigiKurs;
    }

    public void setAldigiKurs(List aldigiKurs) {
        this.aldigiKurs = aldigiKurs;
    }

    public String getKurum() {
        return kurum;
    }

    public void setKurum(String kurum) {
        this.kurum = kurum;
    }
}
