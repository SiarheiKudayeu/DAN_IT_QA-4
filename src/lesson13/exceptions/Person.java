package lesson13.exceptions;

public class Person {
    private int salary;
    private int counOfFriends;
    private String name;

    public Person(int salary, int counOfFriends, String name) {
        this.salary = salary;
        this.counOfFriends = counOfFriends;
        this.name = name;
    }

    private void isDayOff(DaysOfWeek days) throws NotWeekEndException {
        if (days.equals(DaysOfWeek.SUN) || days.equals(DaysOfWeek.SAT)) {
            System.out.println("Ура, выходные!!!");
        } else {
            throw new NotWeekEndException();
        }
    }

    private void isSalaryEnough() throws LowSalaryException {
        if (salary < 5000) {
            throw new LowSalaryException();
        } else {
            System.out.println("Денег вроде хватает.");
        }
    }

    private void doYouHaveFriends() throws NoFriendsException {
        if (counOfFriends <= 0) {
            throw new NoFriendsException();
        } else {
            System.out.println("С друзьями все в порядке.");
        }
    }

    public void canIhaveParty(DaysOfWeek days) throws NotWeekEndException, LowSalaryException, NoFriendsException {
        isDayOff(days);
        isSalaryEnough();
        doYouHaveFriends();
        System.out.println("Ура вечеринке быть");
    }


}
