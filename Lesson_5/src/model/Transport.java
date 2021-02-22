

package model;

public class Transport {
    private int Moshnasty;
    private int MaxSpeed;
    private int Massa;
    private String brand;

    public Transport(int moshnasty, int maxSpeed, int massa, String brand) {
        this.Moshnasty = moshnasty;
        this.MaxSpeed = maxSpeed;
        this.Massa = massa;
        this.brand = brand;
    }

    public void setMoshnasty(int moshnasty) {
        this.Moshnasty = moshnasty;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.MaxSpeed = maxSpeed;
    }

    public void setMassa(int massa) {
        this.Massa = massa;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMoshnasty() {
        return this.Moshnasty;
    }

    public int getMaxSpeed() {
        return this.MaxSpeed;
    }

    public int getMassa() {
        return this.Massa;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPowerInKilowatts() {
        return (double)this.getMoshnasty() * 0.74D;
    }
}
