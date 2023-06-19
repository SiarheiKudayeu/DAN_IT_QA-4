package lesson13.enums.ex2;

public class Person {
    int money;
    String name;

    public Person(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void canIgoToQueen() {
        if (money < Groups.QUEEN.getCostOfTicket() && money > Groups.ACDC.getCostOfTicket()) {
            System.out.println(name + " ты можешь сходить или на "
                    + Groups.ACDC + ", или на " + Groups.METALLICA.getName());
        } else if (money > Groups.QUEEN.getCostOfTicket()) {
            System.out.println(name + ", да ты можешь пойти на Queen");
        } else {
            System.out.println(name + " сиди дома");
        }
    }
}
