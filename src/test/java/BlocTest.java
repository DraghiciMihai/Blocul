import org.junit.Test;

public class BlocTest {
    @Test
    public void testBloc(){
        Bloc bloc = new Bloc("E2");
        Etaj etajul0 = new Etaj(0);
        Apartament ap1 = new Apartament(1, "fam Ionescu");
        etajul0.adaugaApartament(ap1);
        Apartament ap2 = new Apartament(2, "fam Popescu");
        etajul0.adaugaApartament(ap2);
        bloc.adaugaEtaj(etajul0);
        Etaj etajul1 = new Etaj(1);
        Apartament ap3 = new Apartament(3, "fam Georgescu");
        etajul1.adaugaApartament(ap3);
        Apartament ap4 = new Apartament(4, "fam Vladimirescu");
        etajul1.adaugaApartament(ap4);
        Apartament ap5 = new Apartament(5, "fam Tutulescu");
        etajul1.adaugaApartament(ap5);
        bloc.adaugaEtaj(etajul1);
        bloc.afiseazaBloc();
    }
}
