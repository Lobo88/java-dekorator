package Dekorator;

public class Mala extends Pizza {



    public  Mala (){
      opis = "Pizza mala";
    }

    @Override
    public double koszt() {
        return 9.99;
    }
}
