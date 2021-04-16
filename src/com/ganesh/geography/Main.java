package com.ganesh.geography;


import java.util.List;

/**
 * @created: 16/04/2021 - 8:50 AM
 * @author: Ganesh
 */


public class Main {
    public static void main(String[] args) {
        // Create an airspace
        List<Shape> airspace = List.of(
                new Waypoint("CREOL", new LatLon(20.3, 40.7)),
                new Waypoint("ZIDCO", new LatLon(87.1, 20.7)),
                new Waypoint("RYTHM", new LatLon(44.5, 23.2)),
                new Route("ROUTE1",
                        new LatLon(41.3, 2.3),
                        new LatLon(41.5, 2.4),
                        new LatLon(41.7, 2.7))
        );

        // Print wkt for drawing on screen
        airspace.forEach(s -> {
            System.out.println(s.toWkt());
        });
    }
}
