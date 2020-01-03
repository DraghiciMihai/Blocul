import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Etaj {
    private List <Apartament> listaApartamente = new ArrayList<Apartament>();
    private int etaj;

    public Etaj(int etaj) {
        this.etaj = etaj;
    }

    public void adaugaApartament(Apartament apartament){
        listaApartamente.add(apartament);
    }

    public void afiseazaApartamente(){
        Iterator iterator = listaApartamente.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            if(iterator.hasNext())
                System.out.print(" ");
        }
        System.out.println();
    }

    @Override
    public String toString(){
        return "et-" + etaj + ":";
    }
}
