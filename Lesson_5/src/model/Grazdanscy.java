

package model;

public class Grazdanscy extends Vozdyshnay {
    private int KoiPassazirov;
    private boolean NalishieBiznesClassa;

    public Grazdanscy(int moshnasty, int maxSpeed, int massa, String brand, int RazmahKrilev, int MinDlinnaVzletnoPassadPolosiDlyaVzleta, int KoiPassazirov, boolean NalishieBiznesClassa) {
        super(moshnasty, maxSpeed, massa, brand, RazmahKrilev, MinDlinnaVzletnoPassadPolosiDlyaVzleta);
        this.KoiPassazirov = KoiPassazirov;
        this.NalishieBiznesClassa = NalishieBiznesClassa;
    }

    public String toString() {
        int var10000 = this.getMoshnasty();
        return "Civilair\npower = " + var10000 + " h.p., top speed = " + this.getMaxSpeed() + " km/h, mass = " + this.getMassa() + " kg, brand '" + this.getBrand() + "' wingspan" + this.getRazmahKrilev() + " m, minimum runway length for take-off " + this.getMinDlinnaVzletnoPassadPolosiDlyaVzleta() + " m, count passengers = " + this.getKoiPassazirov() + ", Business class = " + this.isNalishieBiznesClassa() + ", power in kilowatts = " + this.getPowerInKilowatts() + " kW";
    }

    public void checkCapacity(int countPassengers) {
        if (countPassengers <= this.getKoiPassazirov()) {
            System.out.println("Passengers are placed on the plane");
        } else {
            System.out.println("You need a bigger plane");
        }

    }

    public int getKoiPassazirov() {
        return this.KoiPassazirov;
    }

    public void setKoiPassazirov(int koiPassazirov) {
        this.KoiPassazirov = koiPassazirov;
    }

    public boolean isNalishieBiznesClassa() {
        return this.NalishieBiznesClassa;
    }

    public void setNalishieBiznesClassa(boolean nalishieBiznesClassa) {
        this.NalishieBiznesClassa = nalishieBiznesClassa;
    }
}
