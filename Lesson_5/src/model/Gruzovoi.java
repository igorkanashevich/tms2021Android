

package model;

public class Gruzovoi extends Legkovoi {
    private int Gruzopodemnost;

    public Gruzovoi(int moshnasty, int maxSpeed, int massa, String brand, int countWheel, int fuelConsumption, int KolPassazirov) {
        super(moshnasty, maxSpeed, massa, brand, KolPassazirov);
        this.Gruzopodemnost = this.Gruzopodemnost;
    }

    public String toString() {
        int var10000 = this.getMoshnasty();
        return "Truck\npower = " + var10000 + " h.p., top speed = " + this.getMaxSpeed() + " km/h, mass = " + this.getMassa() + " kg, brand '" + this.getBrand() + "', count wheel = " + this.getKolishestvoKolos() + ", fuel consumption = " + this.getRashodTopleva() + " L/100 km, load capacity = " + this.getKolPassazirov() + ", power in kilowatts = " + this.getPowerInKilowatts() + " kW";
    }

    public void checkCargoLoad(int cargo) {
        if (cargo <= this.getGruzopodemnost()) {
            System.out.println("Truck loaded");
        } else {
            System.out.println("You need a bigger truck");
        }

    }

    public int getGruzopodemnost() {
        return this.Gruzopodemnost;
    }

    public void setGruzopodemnost(int gruzopodemnost) {
        this.Gruzopodemnost = gruzopodemnost;
    }
}
