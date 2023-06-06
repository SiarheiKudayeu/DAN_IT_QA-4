package lesson9.constructorTask;

public class Servis {
    private String name;

    public String getName() {
        return name;
    }

    public Servis(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void readyForService(Contract contract, City city) {
        int distanceToCity = city.getDistanceToGet();
        int currentDistanceAfterLastTo = contract.getHuman().getAuto().getCurrentDistance() -
                contract.getHuman().getAuto().getLastToDistance();
        int distanceForTo = contract.getHuman().getAuto().getFutureToDistance() -
                contract.getHuman().getAuto().getLastToDistance();
        int distanseThatLeftForNextTo = distanceForTo - currentDistanceAfterLastTo;
        if (distanseThatLeftForNextTo > distanceToCity) {
            System.out.println("Уважаемый " + contract.getHuman().getName() + ".\n" +
                    "            Езжайте в " + city.getName() + ". Но не забывайте, что согласно\n" +
                    "            договору " + contract.getIdOfContract() + " вы обслуживаетесь у нас.\n" +
                    "            Ваша " + name + ".");
        } else {
            System.out.println("Уважаемый " + contract.getHuman().getName() + ".\n" +
                    "Прежде чем вы направитесь в " + city.getName() + " вам понадобится пройти ТО.");
        }
    }
}
