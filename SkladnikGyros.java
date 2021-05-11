package Dekorator;


    public class SkladnikGyros extends  SkladnikDekorator {
        Pizza pizza;

        public  SkladnikGyros(Pizza pizza ){
            this.pizza = pizza;
        }

        @Override
        public String pobierzOpis() {
            return pizza.pobierzOpis()+", dodatkowy gyros";
        }

        @Override
        public double koszt() {
            return pizza.koszt() + 4.99;
        }
    }

