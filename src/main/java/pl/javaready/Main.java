package pl.javaready;

public class Main {
    public static void main(String[] args) {
        String magazyn = "laptop,telefon,ksiazka";
        System.out.println("W magazynie jest: " + magazyn);
        String zamowienieKoncowe = "";
        String produkt = "laptop";
        if (magazyn.contains(produkt)) {
            zamowienieKoncowe += produkt;
            System.out.println("jest w magazynie! Dodaje do zamowienia");
        } else {
            System.out.println("nie ma w magazynie");
        }
        produkt = "telefon";
        if (magazyn.contains(produkt)) {
            zamowienieKoncowe = zamowienieKoncowe + ", " + produkt;
            System.out.println("jest w magazynie! Dodaje do zamowienia");
        } else {
            System.out.println("nie ma w magazynie");
        }
        produkt = "krzeslo";
        if (magazyn.contains(produkt)) {
            zamowienieKoncowe = zamowienieKoncowe + ", " + produkt;
            System.out.println("jest w magazynie! Dodaje do zamowienia");
        } else {
            System.out.println("nie ma w magazynie");
        }

        System.out.println("Koncowe zamówienie to: " + zamowienieKoncowe);
    }
}