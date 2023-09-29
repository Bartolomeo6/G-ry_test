package pl.zs10.test_gory;public class Pytanie {
    private String trescPyt;
    private boolean odpowiedz;
    private String podpowiedz;
    private int idObraz;
    private boolean czyOdpowiedzPoprawna;

    public Pytanie(String trescPyt, boolean odpowiedz, String podpowiedz, int idObraz) {
        this.trescPyt = trescPyt;
        this.odpowiedz = odpowiedz;
        this.podpowiedz = podpowiedz;
        this.idObraz = idObraz;
        czyOdpowiedzPoprawna = false;
    }

    public void setCzyOdpowiedzPoprawna(boolean czyOdpowiedzPoprawna) {
        this.czyOdpowiedzPoprawna = czyOdpowiedzPoprawna;
    }

    public String getTrescPyt() {
        return trescPyt;
    }

    public boolean isOdpowiedz() {
        return odpowiedz;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public int getIdObraz() {
        return idObraz;
    }

    public boolean isCzyOdpowiedzPoprawna() {
        return czyOdpowiedzPoprawna;
    }
}
