package lesson13.exceptions;

public class Test {
    public static void main(String[] args) throws LowSalaryException {
        Person person = new Person(4000, 4, "Иван");
   /*     try {
            person.canIhaveParty(DaysOfWeek.SAT);
        } catch (NoFriendsException e) {
            System.err.println(e.getMessage());
        } catch (NotWeekEndException e) {
            System.err.println(e.getMessage());
        } catch (LowSalaryException e) {
            System.err.println(e.getMessage());
        }*/

       /* try {
            person.canIhaveParty(DaysOfWeek.SUN);
        }catch (NotWeekEndException | NoFriendsException | LowSalaryException ex){
            System.err.println(ex.getMessage());
        }*/

     /*   try {
            person.canIhaveParty(DaysOfWeek.SUN);
        }catch (NotWeekEndException | NoFriendsException ex){
            System.err.println(ex.getMessage());
        }*/


    }
}
