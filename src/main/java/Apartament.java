public class Apartament {
    private int numar;
    private String nume;

    public Apartament(int numar, String nume) {
        this.numar = numar;
        this.nume = nume;
    }

    @Override
    public String toString(){
        return "||" + this.numar + ". " + this.nume + "||";
    }
}
