//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class Nazemnay extends Transport {
    private int kolishestvoKolos;
    private int rashodTopleva;

    public Nazemnay(int moshnasty, int maxSpeed, int massa, String brand) {
        super(moshnasty, maxSpeed, massa, brand);
        this.kolishestvoKolos = this.kolishestvoKolos;
        this.rashodTopleva = this.rashodTopleva;
    }

    public Nazemnay(int moshnasty, int maxSpeed, int massa, String brand, int kolishestvoKolos, int rashodTopleva) {
        super(moshnasty, maxSpeed, massa, brand);
        this.kolishestvoKolos = kolishestvoKolos;
        this.rashodTopleva = rashodTopleva;
    }

    public int getKolishestvoKolos() {
        return this.kolishestvoKolos;
    }

    public void setKolishestvoKolos(int kolishestvoKolos) {
    }

    public int getRashodTopleva() {
        return this.rashodTopleva;
    }

    public void setRashodTopleva(int rashodTopleva) {
    }
}
