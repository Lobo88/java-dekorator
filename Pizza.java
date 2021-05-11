package Dekorator;

public abstract class Pizza {
    String rozmiar = "Rozmiar nieznany";
    String opis;

    public String pobierzOpis(){
        return opis;
    }
    public abstract double koszt();
}
