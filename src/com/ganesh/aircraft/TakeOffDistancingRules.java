package com.ganesh.aircraft;


import java.util.Map;

/**
 * @created: 16/04/2021 - 3:13 PM
 * @author: Ganesh
 */


public class TakeOffDistancingRules {
    private Map<WakeTurbulence, Integer> rules;

    public TakeOffDistancingRules() {
        rules = Map.of(
                WakeTurbulence.LIGHT, 60,
                WakeTurbulence.MEDIUM, 90,
                WakeTurbulence.HEAVY, 110,
                WakeTurbulence.SUPER, 180
        );
    }

    public int calculateWaitTime(Aircraft a) {
        return rules.get(a.getWakeTurbulence());
    }
}
