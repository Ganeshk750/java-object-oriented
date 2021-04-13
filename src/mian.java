import java.time.LocalDateTime;
import java.util.List;

/**
 * @created: 13/04/2021 - 10:08 PM
 * @author: Ganesh
 */

public class mian {

    public static void main(String[] args) {
       // Partial flight plan
        FlightPlan dbgLineToBlr = new FlightPlan("DBG", "SBC");
        dbgLineToBlr.print();
        System.out.println();

        //Complete flight plan
        FlightPlan delhiToMumbai = new FlightPlan(
                "NDLS", "MUM",
                LocalDateTime.of(2021,04,10,23,15),
                List.of("NDLS", "MP", "NGP","MUM"));
         delhiToMumbai.print();
    }
}
