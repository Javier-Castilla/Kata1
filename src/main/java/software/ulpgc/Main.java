package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alien alien = new Alien(
                "E.T.",
                LocalDate.of(1982, 6, 11),
                AlienColor.GREEN,
                LocalDate.of(2024, 1, 1)
        );
        System.out.println(alien);
        System.out.println(alien.recentlySeen(270));
    }
}
