
import java.util.Scanner;
import model.Grazdanscy;
import model.Gruzovoi;
import model.Legkovoi;
import model.Voennay;

public class ObjectInfo {
    public Legkovoi createLegkovoi() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите мощьность  \t");
            int moshnasty = scanner.nextInt();
                System.out.print("Введите макс скорость  \t");
                int maxSpeed = scanner.nextInt();
                    System.out.print("Введите массу \t");
                    int massa = scanner.nextInt();
                        System.out.print("Введите бренд \t");
                        String brand = scanner.next();
                            System.out.print("Введите кол колёс \t");
                            int kolishestvoKolos = scanner.nextInt();
                                System.out.print("Введите расход топлива \t");
                                int rashodTopleva = scanner.nextInt();
                                    System.out.print("Введите тип кузова \t");
                                    String tipKyzova = scanner.next();
                                        System.out.print("Введите счет пассажиров \t");
                                        int kolPassazirov = scanner.nextInt();
        return new Legkovoi(moshnasty,
                maxSpeed, massa, brand,
                kolishestvoKolos, rashodTopleva,
                tipKyzova, kolPassazirov);
    }

    public Gruzovoi createGruzovoi() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите мощьность \t");
            int moshnasty = scanner.nextInt();
                System.out.print("Введите макс скорость \t");
                int maxSpeed = scanner.nextInt();
                    System.out.print("Введите массу \t");
                    int massa = scanner.nextInt();
                        System.out.print("Введите бренд \t");
                        String brand = scanner.next();
                            System.out.print("Введите кол колёс \t");
                            int kolishestvoKolos = scanner.nextInt();
                                System.out.print("Enter расход топлива \t");
                                int rashodTopleva = scanner.nextInt();
                                    System.out.print("Введите грузоподъемность \t");
                                    int gruzopodemnost = scanner.nextInt();
        return new Gruzovoi(moshnasty,
                maxSpeed, massa, brand,
                kolishestvoKolos, rashodTopleva,
                gruzopodemnost);
    }

    public Grazdanscy createGrazdanscy() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите мощьность \t");
            int moshnasty = scanner.nextInt();
                System.out.print("Введите макс скорость \t");
                int maxSpeed = scanner.nextInt();
                    System.out.print("Введите массу \t");
                    int massa = scanner.nextInt();
                        System.out.print("Введите бренд \t");
                        String brand = scanner.next();
                            System.out.print("Введите размах крыльев \t");
                            int razmahKrilev = scanner.nextInt();
                                System.out.print("Введите минимальная длина взлетно-посадочной полосы для взлета \t");
                                int minDlinnaVzletnoPassadPolosiDlyaVzleta = scanner.nextInt();
                                    System.out.print("Введите счет пассажиров \t");
                                    int koiPassazirov = scanner.nextInt();
                                        System.out.print("Введите бизнес-класс \t");
                                        boolean nalishieBiznesClassa = scanner.nextBoolean();
        return new Grazdanscy(moshnasty,
                maxSpeed, massa, brand,
                razmahKrilev,
                minDlinnaVzletnoPassadPolosiDlyaVzleta,
                koiPassazirov, nalishieBiznesClassa);
    }

    public Voennay createVoennay() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите мощьность \t");
            int power = scanner.nextInt();
                System.out.print("Введите макс скорость \t");
                int top_speed = scanner.nextInt();
                    System.out.print("Введите массу \t");
                    int mass = scanner.nextInt();
                        System.out.print("Введите бренд \t");
                        String brand = scanner.next();
                            System.out.print("Введите размах крыльев \t");
                            int wingspan = scanner.nextInt();
                                System.out.print("Введите минимальная длина взлетно-посадочной полосы для взлета \t");
                                int minLengthRunway = scanner.nextInt();
                                    System.out.print("Введите счёт ракет \t");
                                    int countMissiles = scanner.nextInt();
                                        System.out.print("Введите наличие катапульты \t");
                                        boolean isEjectionSystem = scanner.nextBoolean();
        return new Voennay(power, top_speed,
                mass, brand, wingspan,
                minLengthRunway, isEjectionSystem,
                countMissiles);
    }
}
