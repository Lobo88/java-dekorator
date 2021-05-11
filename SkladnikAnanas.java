package Dekorator;


    public class SkladnikAnanas extends  SkladnikDekorator {
        Pizza pizza;

        public  SkladnikAnanas(Pizza pizza ){
            this.pizza = pizza;
        }

        @Override
        public String pobierzOpis() {
            return pizza.pobierzOpis()+", dodatkowo ananas";
        }

        @Override
        public double koszt() {
            return pizza.koszt() + 2.30;
        }
    }

