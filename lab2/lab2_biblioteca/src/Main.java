import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Pagina pag1 = new Pagina(1,"La lumina lunii pline");
        Pagina pag2 = new Pagina(2,"lorem ipsum dormea lat");
        List<Pagina> pagini = new ArrayList<Pagina>();
        pagini.add(pag1);
        pagini.add(pag2);
        Carte carte1 = new Carte("Superb","AO",pagini);
        Carte carte2 = new Carte("Duperb","EO",pagini);
        List<Carte> carti = new ArrayList<Carte>();
        biblioteca.AddCarteToBiblioteca(carte1);
        biblioteca.AddCarteToBiblioteca(carte2);
        biblioteca.AfisareBiblioteca();
        System.out.println();
        System.out.println();
        System.out.println();
        biblioteca.SortareBiblioteca();
        biblioteca.AfisareBiblioteca();
    }
}