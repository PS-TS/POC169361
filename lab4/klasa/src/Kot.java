public class Kot{
    String imie;

    public Kot stworzKota(String catname){
        if(catname.isEmpty())
            return null;
        Kot mlody = new Kot();
        mlody.imie=catname;
        return mlody;
    }
}
