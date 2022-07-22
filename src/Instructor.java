import java.util.List;

public class Instructor extends User{
    private List<String> verdigiKurs;
    private List<String> sertifika;
    private String webSitesi;

    public Instructor(){

    }


    public List<String> getVerdigiKurs() {
        return verdigiKurs;
    }

    public void setVerdigiKurs(List<String> verdigiKurs) {
        this.verdigiKurs = verdigiKurs;
    }

    public List<String> getSertifika() {
        return sertifika;
    }

    public void setSertifika(List<String> sertifika) {
        this.sertifika = sertifika;
    }

    public String getWebSitesi() {
        return webSitesi;
    }

    public void setWebSitesi(String webSitesi) {
        this.webSitesi = webSitesi;
    }
}
