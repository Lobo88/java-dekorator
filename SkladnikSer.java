package Dekorator;

public class SkladnikSer extends  SkladnikDekorator {
    Pizza pizza;

    public  SkladnikSer(Pizza pizza ){
        this.pizza = pizza;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis()+", dodatkowy ser";
    }

    @Override
    public double koszt() {
        return pizza.koszt() +1.80;
    }
}
