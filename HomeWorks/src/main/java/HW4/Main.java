package HW4;

public class Main {

    public static void main(String[] args) {

        int fuelСost = Integer.valueOf(args[0]);

        int odessaToKyivKm = 959;
        int odessaToKrivoyeOzero = 179;
        int krivoyeOzeroToZhashkov = 153;
        int zhashkovToKyiv = 148;

        Car car = new Car();

        System.out.println("The trip Odessa-Kiev : ");
        car.go(odessaToKyivKm,"Kyiv");

        System.out.println("Estimated  cost per trip Odessa-Kiev " +
                String.format("%.2f",fuelСost * (car.getFuelConsumptionPerHundredKm() * odessaToKyivKm)) + " UAH");

        System.out.println("-----------");
        car.fillFullTank(fuelСost);
        System.out.println("-----------");

        car.go(odessaToKrivoyeOzero,"Krivoye ozero");
        System.out.println("-----------");

        car.go(krivoyeOzeroToZhashkov,"Zhashkov");

        System.out.println("-----------");
        car.go(zhashkovToKyiv,"Kyiv");
        System.out.println("-----------");

        car.fillFullTank(fuelСost);

        System.out.println("-----------");

        car.go(zhashkovToKyiv,"Kyiv");

    }
}
