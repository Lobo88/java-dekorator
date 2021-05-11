package Dekorator;

public class Srednia extends Pizza {



    public Srednia (){
        opis = "Pizza srednia";
    }

    @Override
    public double koszt() {
        return 14.99;
    }
}