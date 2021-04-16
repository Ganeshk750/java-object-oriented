package com.ganesh;


/**
 * @created: 16/04/2021 - 8:17 AM
 * @author: Ganesh
 */


public final class ConversionHelper {

    private static int metersInOneNm;

    static {
        metersInOneNm = 1852;
    }

    public static int fromFeetToFL(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nm) {
        return nm * metersInOneNm;
    }
}
