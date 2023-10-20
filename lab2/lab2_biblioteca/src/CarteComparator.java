class CarteComparator implements java.util.Comparator<Carte> {
    @Override
    public int compare(Carte a, Carte b) {
        if(a.autor.compareTo(b.autor)!=0)
            return a.autor.compareTo(b.autor);
        else return a.titlu.compareTo(b.titlu);
    }
}