import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bloc {
    private List<Etaj> listaEtaje = new ArrayList<Etaj>();
    private String nume;

    public Bloc(String nume) {
        this.nume = nume;
    }

    public void adaugaEtaj(Etaj etaj){
        listaEtaje.add(etaj);
    }

    public void afiseazaBloc(){
        Collections.reverse(listaEtaje);
        System.out.println("---------------------------------------------------------------------------------\n" +
                "---------------------------------------------------------------------------------");
        for(Etaj etaj : listaEtaje){
            System.out.print(etaj);
            etaj.afiseazaApartamente();
            System.out.println("---------------------------------------------------------------------------------\n" +
                    "---------------------------------------------------------------------------------");
        }
    }
}
