import java.util.List;
import java.util.Scanner;

/**
 * Handles console interaction for OceanFleet App.
 *
 * @author Adithya
 * @version 5.0
 */
public class UserInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter vessel details");

        for (int i = 0; i < count; i++) {

            String input = scanner.nextLine();
            String[] data = input.split(":");

            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            util.addVesselPerformance(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String vesselId = scanner.nextLine();

        Vessel vessel = util.getVesselById(vesselId);

        if (vessel != null) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + vesselId + " not found");
        }

        System.out.println("High performance vessels are");

        List<Vessel> highPerf = util.getHighPerformanceVessels();

        for (Vessel v : highPerf) {
            System.out.println(
                    v.getVesselId() + " | " +
                            v.getVesselName() + " | " +
                            v.getVesselType() + " | " +
                            v.getAverageSpeed() + " knots"
            );
        }
    }
}
