package software.ulpgc;

import java.time.LocalDate;

public class Alien {
    public static final int DAYS_PER_YEAR = 365;
    private final String name;
    private final LocalDate birthDate;
    private final AlienColor color;
    private LocalDate lastSeen;

    public Alien(String name, LocalDate birthDate, AlienColor color, LocalDate lastSeen) {
        this.name = name;
        this.birthDate = birthDate;
        this.color = color;
        this.lastSeen = lastSeen;
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public AlienColor color() {
        return color;
    }

    public LocalDate lastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LocalDate lastSeen) {
        this.lastSeen = lastSeen;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }

    public boolean recentlySeen(long days) {
        long daysSinceLastSeen = LocalDate.now().toEpochDay() - lastSeen.toEpochDay();
        return daysSinceLastSeen <= days;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + getAge() +
                ", color=" + color +
                ", lastSeen=" + lastSeen +
                '}';
    }
}
