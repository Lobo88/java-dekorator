package Dekorator;

public class Duza extends Pizza {



    public Duza(){
         opis = "Pizza duza";
    }

    @Override
    public double koszt() {
        return 19.99;
    }
}