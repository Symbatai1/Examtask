import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Vinedepartment  {

    private String department;
    private Vine[] vines;
    private int experience;
    private String adress;


    public Vinedepartment(String department, Vine[] vines, int experience, String adress) {
        this.department = department;
        this.vines = vines;
        this.experience = experience;
        this.adress = adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Vine[] getVines() {
        return vines;
    }

    public void setVines(Vine[] vines) {
        this.vines = vines;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Vinedepartment{" + Arrays.toString(vines)+
                "department='" + department + '\'' +
                ", experience=" + experience +
                ", adress='" + adress + '\'' +
                '}';
    }
}
