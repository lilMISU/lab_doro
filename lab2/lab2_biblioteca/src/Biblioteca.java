import java.util.*;


public class Biblioteca {

    List<Carte> carti=new ArrayList<Carte>();
    Map<String,Carte> cartiMap=new HashMap<String,Carte>();

    public Biblioteca(){

    }
    public Biblioteca(List<Carte> carti) {
        this.carti = carti;
        for(Carte carte : carti)
        cartiMap.put(carte.titlu,carte);
    }

    public void AddCarteToBiblioteca(Carte carte){
        carti.add(carte);
        cartiMap.put(carte.titlu,carte);
    }

    public void AfisareBiblioteca(){
        for(Carte carte : carti){
            System.out.println("Carte:" + carte.titlu + " Autor:" + carte.autor);
            for(Pagina pagina : carte.pagini){
                System.out.println(pagina.nr);
                System.out.println(pagina.continut);
            }
        }
    }

    public void SortareBiblioteca(){
        Collections.sort(carti, new CarteComparator());
    }

    public Nush2sec CautareFraza(String fraza){
        return;
    }
}
