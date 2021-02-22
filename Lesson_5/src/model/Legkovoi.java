//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class Legkovoi extends Nazemnay {
    private String TipKyzova;
    private int KolPassazirov;

    public Legkovoi(int moshnasty, int maxSpeed, int massa, String brand, int kolishestvoKolos, int rashodTopleva, String TipKyzova, int KolPassazirov) {
        super(moshnasty, maxSpeed, massa, brand, kolishestvoKolos, rashodTopleva);
        this.TipKyzova = TipKyzova;
        this.KolPassazirov = KolPassazirov;
    }

    public Legkovoi(int moshnasty, int maxSpeed, int massa, String brand, int kolPassazirov) {
        super(moshnasty, maxSpeed, massa, brand);
    }

    public String toString() {
        int var10000 = this.getMoshnasty();
        return "Легковой транспорт\nмощьность = " + var10000 + " h.p., макс скорость = " + this.getMaxSpeed() + " km/h, масса = " + this.getMassa() + " kg, брэнд'" + this.getBrand() + "', кол-во колёс = " + this.getKolishestvoKolos() + ", расход топлива = " + this.getRashodTopleva() + " L/100 km, тип кузова '" + this.TipKyzova + "', подсчет пассажиров = " + this.KolPassazirov + ", мощность в киловаттах = " + this.getPowerInKilowatts() + " kW";
    }

    public void infoMaxKmAndLitersFuel(double time) {
        System.out.println("На время" + time + " автомобиль '" + this.getBrand() + "' движение на макс скорости" + this.getMaxSpeed() + " km/h  " + this.way(time) + " км и использование " + this.fuelСonsumption(this.way(time)) + " литров топлива");
    }

    private double fuelСonsumption(double way) {
        return way / 100.0D * (double)this.getRashodTopleva();
    }

    private double way(double time) {
        return time * (double)this.getMaxSpeed();
    }

    public String getTipKyzova() {
        return this.TipKyzova;
    }

    public void setTipKyzova(String tipKyzova) {
        this.TipKyzova = tipKyzova;
    }

    public int getKolPassazirov() {
        return this.KolPassazirov;
    }

    public void setKolPassazirov(int kolPassazirov) {
        this.KolPassazirov = kolPassazirov;
    }
}
