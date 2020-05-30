package advancedJavaLearning;

public class Preke {
    private int id;
    private String pavadinimas;
    private int kiekis;
    private double kaina;
    public Preke(int id, String pavadinimas, int kiekis, double kaina) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.kiekis = kiekis;
        this.kaina = kaina;
    }
    public Preke() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPavadinimas() {
        return pavadinimas;
    }
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    public int getKiekis() {
        return kiekis;
    }
    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }
    public double getKaina() {
        return kaina;
    }
    public void setKaina(double kaina) {
        this.kaina = kaina;
    }
    @Override
    public String toString() {
        return "Preke{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", kiekis=" + kiekis +
                ", kaina=" + kaina +
                '}';
    }
}
