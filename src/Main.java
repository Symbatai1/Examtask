import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Vine vine=new Vine("red","x","France",LocalDate.of(2022,1,1));
Vine vin1=new Vine("black","xl","France",LocalDate.of(2021,1,1));
Vine vin2=new Vine("white","xm","France",LocalDate.of(2023,1,1));


Vine [] vines1={vine,vin2};


   Vine[]vines={vine,vin1,vin2};

   Vinedepartment vinedepartment= new Vinedepartment("Dana",vines,5,"ganover 109");
   Vinedepartment vinedepartmen2= new Vinedepartment("Yana",vines1,3,"yower 22");

        System.out.println(vinedepartment);
        System.out.println(vinedepartmen2);

    }

}