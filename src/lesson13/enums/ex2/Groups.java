package lesson13.enums.ex2;

public enum Groups {
    METALLICA("Metallica", 4000), ACDC("AC/DC", 4000), QUEEN("Queen",7000);
    private String name;
    private int costOfTicket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostOfTicket() {
        return costOfTicket;
    }

    public void setCostOfTicket(int costOfTicket) {
        this.costOfTicket = costOfTicket;
    }

    Groups(String name, int costOfTicket) {
        this.name = name;
        this.costOfTicket = costOfTicket;
    }
}
