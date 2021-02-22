

package model;

public class Vozdyshnay extends Transport {
    private int RazmahKrilev;
    private int MinDlinnaVzletnoPassadPolosiDlyaVzleta;

    public Vozdyshnay(int moshnasty, int maxSpeed, int massa, String brand, int RazmahKrilev, int MinDlinnaVzletnoPassadPolosiDlyaVzleta) {
        super(moshnasty, maxSpeed, massa, brand);
        this.RazmahKrilev = RazmahKrilev;
        this.MinDlinnaVzletnoPassadPolosiDlyaVzleta = MinDlinnaVzletnoPassadPolosiDlyaVzleta;
    }

    public int getRazmahKrilev() {
        return this.RazmahKrilev;
    }

    public int setRazmahKrilev(int razmahKrilev) {
        return razmahKrilev;
    }

    public int getMinDlinnaVzletnoPassadPolosiDlyaVzleta() {
        return this.MinDlinnaVzletnoPassadPolosiDlyaVzleta;
    }

    public void setMinDlinnaVzletnoPassadPolosiDlyaVzleta(int minDlinnaVzletnoPassadPolosiDlyaVzleta) {
        this.MinDlinnaVzletnoPassadPolosiDlyaVzleta = minDlinnaVzletnoPassadPolosiDlyaVzleta;
    }
}
