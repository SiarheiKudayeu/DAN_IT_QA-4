package lesson9.constructorTask;

public class Contract {
    private int idOfContract;

    public int getIdOfContract() {
        return idOfContract;
    }

    public Contract(int idOfContract, Human human) {
        this.idOfContract = idOfContract;
        this.human = human;
    }

    public void setIdOfContract(int idOfContract) {
        this.idOfContract = idOfContract;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    private Human human;
}
