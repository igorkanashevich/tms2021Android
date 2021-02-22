

package model;

public class Voennay extends Vozdyshnay {
    private Boolean NalishieCatapultirovaniya;
    private int KolishestvoRaketNaBorty;

    public Voennay(int moshnasty, int maxSpeed, int massa, String brand, int RazmahKrilev, int MinDlinnaVzletnoPassadPolosiDlyaVzleta, Boolean NalishieCatapultirovaniya, int KolishestvoRaketNaBorty) {
        super(moshnasty, maxSpeed, massa, brand, RazmahKrilev, MinDlinnaVzletnoPassadPolosiDlyaVzleta);
        this.NalishieCatapultirovaniya = NalishieCatapultirovaniya;
        this.KolishestvoRaketNaBorty = KolishestvoRaketNaBorty;
    }

    public String toString() {
        int var10000 = this.getMoshnasty();
        return "Militaryairpower = " + var10000 + " h.p., top speed = " + this.getMaxSpeed() + " km/h, mass = " + this.getMassa() + " kg, brand '" + this.getBrand() + "' wingspan" + this.getRazmahKrilev() + " m, Minimum runway length for take-off " + this.getMinDlinnaVzletnoPassadPolosiDlyaVzleta() + " m,  ejection system = " + this.getNalishieCatapultirovaniya() + ", count missiles = " + this.getKolishestvoRaketNaBorty() + ", power in kilowatts = " + this.getPowerInKilowatts() + " kW";
    }

    public void shot() {
        if (this.getKolishestvoRaketNaBorty() != 0) {
            System.out.println("The rocket went ...");
            --this.KolishestvoRaketNaBorty;
        } else {
            System.out.println("No ammunition!");
        }

    }

    public void ejection() {
        if (this.getNalishieCatapultirovaniya()) {
            System.out.println("The ejection was successful");
        } else {
            System.out.println("You don't have such a system");
        }

    }

    public Boolean getNalishieCatapultirovaniya() {
        return this.NalishieCatapultirovaniya;
    }

    public void setNalishieCatapultirovaniya(Boolean nalishieCatapultirovaniya) {
        this.NalishieCatapultirovaniya = nalishieCatapultirovaniya;
    }

    public int getKolishestvoRaketNaBorty() {
        return this.KolishestvoRaketNaBorty;
    }

    public void setKolishestvoRaketNaBorty(int kolishestvoRaketNaBorty) {
        this.KolishestvoRaketNaBorty = kolishestvoRaketNaBorty;
    }
}
