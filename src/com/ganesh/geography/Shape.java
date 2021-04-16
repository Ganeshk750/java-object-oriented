package com.ganesh.geography;


/**
 * @created: 16/04/2021 - 8:46 AM
 * @author: Ganesh
 */


public abstract class Shape {
    public String toWkt() {
        String wkt = this.convertToWkt();

        if (this.isWktValid(wkt)) {
            return wkt;
        }
        throw new RuntimeException("Can not draw shape");
    }

    protected abstract String convertToWkt();

    private boolean isWktValid(String wkt) {
        if (wkt == null || wkt.length() == 0) {
            return false;
        }

        return wkt.startsWith("POINT") ||
                wkt.startsWith("LINESTRING") ||
                wkt.startsWith("POLYGON");
    }
}