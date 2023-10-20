import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carte {

    String titlu;
    String autor;
    List<Pagina> pagini;
    Map<Integer, String> paginiMap = new HashMap<Integer, String>();

    public Carte(String titlu, String autor, List<Pagina> pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.pagini = pagini;
        for (Pagina pagina : pagini)
            paginiMap.put(pagina.nr, pagina.continut);
    }


}
