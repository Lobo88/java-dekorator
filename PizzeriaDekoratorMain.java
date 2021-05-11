package Dekorator;

public class PizzeriaDekoratorMain {
    public static void main (String args[]){

    Pizza pizza1 = new Mala();
    System.out.println(pizza1.pobierzOpis() +"  " + pizza1.koszt()+ " zl");

    Pizza pizza2 = new Srednia();
    pizza2 = new SkladnikAnanas(pizza2);
    pizza2 = new SkladnikSos(pizza2);
    System.out.println(pizza2.pobierzOpis()+  "  " + pizza2.koszt()+ " zl");

    Pizza pizza3 = new Duza();
    pizza3 = new SkladnikSos(pizza3);
    pizza3 = new SkladnikAnanas(pizza3);
    pizza3 = new SkladnikGyros(pizza3);
    pizza3 = new SkladnikSer(pizza3);
    pizza3 = new SkladnikSer(pizza3);


    System.out.println(pizza3.pobierzOpis()+  "  " + pizza3.koszt()+ " zl");
}}
