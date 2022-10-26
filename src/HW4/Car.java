package HW4;

public class Car {
    private final int tankVolume = 60;
    private int restInTank = 0;
    private double fuelConsumptionPerHundredKm = 0.14;

    //    залить полный бак с учетом объема остатка
    public void fillFullTank(int fuelCost) {
        int sumToFull = tankVolume - restInTank;
        restInTank += sumToFull;
        int costForFillTank=fuelCost*sumToFull;
        System.out.println("The tank was filled with " + sumToFull + " liters of fuel. Tank is full.");
        System.out.println("Cost for fill tank " + costForFillTank + " UAH");

    }

    //    определить остаток топлива по преодолении N км
    public double remainingFuelAfterDrivingN(int traveledKm) {
        double usedFuel = fuelConsumptionPerHundredKm * traveledKm;
         restInTank-=usedFuel;
        return restInTank;
    }

    //    определить сколько надо дозаправить топлива для преодоления N км
    public double determineMuchFuelNeeds(int traveledKm) {
        double needFuel = fuelConsumptionPerHundredKm * traveledKm;
        double needToRefill = 0;
        System.out.println("for go need fuel " +String.format("%.2f",needFuel)+" liters");
        System.out.println("rest in tank "+restInTank+" liters");
        if (needFuel > restInTank) {
            needToRefill= Math.abs(restInTank - needFuel);
            System.out.println("You need to refill the tank to " + String.format("%.2f", Math.abs(needToRefill))
             + " liters");
        } else {
            System.out.println("No need to refill.");
        }
        return needToRefill;
    }

    public void go(int distanceInKm, String dist){
        if(determineMuchFuelNeeds(distanceInKm)==0){
            System.out.println( "You can go to the next stop at " +dist+
            "\nAt stop " +dist+ " fuel balance = " + remainingFuelAfterDrivingN(distanceInKm));
        } else System.out.println("You cant go. You need to refill the tank. ");
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public int getRestInTank() {
        return restInTank;
    }

    public void setRestInTank(int restInTank) {
        this.restInTank = restInTank;
    }

    public double getFuelConsumptionPerHundredKm() {
        return fuelConsumptionPerHundredKm;
    }

    public void setFuelConsumptionPerHundredKm(double fuelConsumptionPerHundredKm) {
        this.fuelConsumptionPerHundredKm = fuelConsumptionPerHundredKm;
    }
}
