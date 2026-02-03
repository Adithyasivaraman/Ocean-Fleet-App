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
}
