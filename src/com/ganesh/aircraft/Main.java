package com.ganesh.aircraft;


import java.time.LocalDateTime;
import java.util.List;

/**
 * @created: 16/04/2021 - 3:11 PM
 * @author: Ganesh
 */


public class Main {
    public static void main(String[] args) {

        List<Aircraft> aircraft = List.of(
                new Aircraft(1000, "B737", WakeTurbulence.LIGHT),
                new Aircraft(1001, "A320", WakeTurbulence.LIGHT),
                new Aircraft(1002, "A330", WakeTurbulence.MEDIUM),
                new Aircraft(1003, "ATR90", WakeTurbulence.LIGHT),
                new Aircraft(1004, "A380", WakeTurbulence.SUPER)
        );

        int offset = 0;
        for (Aircraft a : aircraft) {
            offset += a.getWakeTurbulence().getTimeOffset();
            LocalDateTime depTime = LocalDateTime
                    .now()
                    .plusSeconds(offset);
            System.out.println("Aircraft " + a.getModeAOctal() + " takes off at " + depTime.toLocalTime());
        }
    }
}
