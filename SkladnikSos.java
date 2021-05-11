package Dekorator;


    public class SkladnikSos extends  SkladnikDekorator {
        Pizza pizza;

        public  SkladnikSos(Pizza pizza ){
            this.pizza = pizza;
        }

        @Override
        public String pobierzOpis() {
            return pizza.pobierzOpis()+", dodatkowy sos firmowy";
        }

        @Override
        public double koszt() {
            return pizza.koszt() +1.50;
        }
    }



