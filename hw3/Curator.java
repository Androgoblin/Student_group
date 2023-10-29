package hw3;

public class Curator extends User{
    private int curatorId;

    public Curator(String lastName, String firstName, String secondName, int curatorId) {
        super(lastName, firstName, secondName);
        this.curatorId = curatorId;
    }

    public int getCuratorId() {
        return curatorId;
    }

    @Override
    public String toString() {
        return "Куратор: " +
                "Имя: " + super.getFirstName() +
                ", Отчество: " + super.getSecondName() +
                ", Фамилия: " + super.getLastName() +
                ", Идентификатор: " + curatorId;
    }
}
