import java.time.LocalDate;
import java.time.LocalDateTime;

public  class Vine implements AddVine {
    private  String name;
    private  String brand;
    private  String country;
    private LocalDate date;
public void Vine(){
};
    public Vine(String name, String brand, String country, LocalDate date) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Vine{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public void newVine(Vine vine) {
        System.out.println("Input name");
        vine.getName();
        System.out.println("input brand");
        vine.getBrand();
        System.out.println("input date");
        vine.getDate();
        System.out.println("input country");
        vine.getCountry();
    }
}
