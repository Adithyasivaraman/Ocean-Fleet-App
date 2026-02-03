import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to manage vessel records.
 *
 * @author Adithya
 * @version 2.0
 */
public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    /**
     * Adds vessel performance record to list.
     */
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    /**
     * Retrieves vessel details by vesselId.
     */
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        return null;
    }

    /**
     * Retrieves vessels with highest average speed.
     */
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> result = new ArrayList<>();

        if (vesselList.isEmpty()) {
            return result;
        }

        double maxSpeed = vesselList.get(0).getAverageSpeed();

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                result.add(vessel);
            }
        }

        return result;
    }

}
