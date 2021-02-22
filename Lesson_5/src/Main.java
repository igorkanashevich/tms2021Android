

import java.util.Scanner;
import model.Grazdanscy;
import model.Gruzovoi;
import model.Legkovoi;
import model.Transport;
import model.Voennay;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObjectInfo inputInfoObject = new ObjectInfo();
        boolean isTrue = true;

        do {
            System.out.println("Введите номер объекта\n 1 - Легковой\n 2 - Грузовой\n 3 - Гражданский Возд\n 4 - Военный Возд\n 0 - Выход");
            int number = scanner.nextInt();
            switch(number) {
                case 0:
                    isTrue = false;
                    break;
                case 1:
                    Transport transport = inputInfoObject.createLegkovoi();
                    System.out.println(transport.toString());
                    workWithObjPassenger((Legkovoi)transport);
                    break;
                case 2:
                    transport = inputInfoObject.createGruzovoi();
                    System.out.println(transport.toString());
                    workWithObjTruck((Gruzovoi)transport);
                    break;
                case 3:
                    transport = inputInfoObject.createGrazdanscy();
                    System.out.println(transport.toString());
                    workWithObjCivilair((Grazdanscy)transport);
                    break;
                case 4:
                    transport = inputInfoObject.createVoennay();
                    System.out.println(transport.toString());
                    workWithObjMilitaryairShot((Voennay)transport);
                    workWithObjMilitaryairEnjection((Voennay)transport);
                    break;
                default:
                    System.out.println("введено неверное значение");
            }
        } while(isTrue);

    }

    public static void workWithObjPassenger(Legkovoi passenger) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите рассчитать, сколько километров проедет автомобиль при максимальном движении \" +\n- скорость и сколько топлива он будет потреблять за это время?\n 1 - да\n 0 - нет");
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("Введите время");
                passenger.infoMaxKmAndLitersFuel(scanner.nextDouble());
            case 0:
            default:
        }
    }

    public static void workWithObjTruck(Gruzovoi truck) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите погрузить груз в грузовик?\n 1 - да\n 0 - нет");
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("Введите вес груза");
                truck.checkCargoLoad(scanner.nextInt());
            case 0:
            default:
        }
    }

    public static void workWithObjCivilair(Grazdanscy civilair) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите проверить, поместятся ли пассажиры в самолете?\n 1 - да\n 0 - нет");
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("Введите количество пассажиров");
                civilair.checkCapacity(scanner.nextInt());
            case 0:
            default:
        }
    }

    public static void workWithObjMilitaryairShot(Voennay militaryair) {
        Scanner scanner = new Scanner(System.in);
        boolean yesNo = true;

        do {
            System.out.println("Хочешь попробовать?\n 1 - да\n 0 - нет");
            int number = scanner.nextInt();
            switch(number) {
                case 0:
                    yesNo = false;
                    break;
                case 1:
                    militaryair.shot();
            }
        } while(yesNo);

    }

    public static void workWithObjMilitaryairEnjection(Voennay militaryair) {
        Scanner scanner = new Scanner(System.in);
        boolean yesNo = true;

        do {
            System.out.println("Хотите проверить систему спасения?\n 1 - да\n 0 - нет");
            int number = scanner.nextInt();
            switch(number) {
                case 0:
                    yesNo = false;
                    break;
                case 1:
                    militaryair.ejection();
            }
        } while(yesNo);

    }
}
