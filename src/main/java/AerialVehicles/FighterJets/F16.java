package AerialVehicles.FighterJets;

import AerialVehicles.AerialVehicle;
import AerialVehicles.AttackMode;
import AerialVehicles.BdaMode;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends AerialVehicle {
    AttackMode am;
    BdaMode bm;

    public F16(String cameraType, int numMissles, String missleType, String name, Mission mission,
               int numHoursToLastRepair, boolean readyToFly) {
        super(name, mission, numHoursToLastRepair, readyToFly);
        am = new AttackMode(numMissles, missleType);
        bm = new BdaMode(cameraType);
    }

    public void setHoursOfFlightSinceLastRepair(int numHoursToLastRepair) {
        super.setHoursOfFlightSinceLastRepair(numHoursToLastRepair);
    }

    public int getHoursOfFlightSinceLastRepair() { return super.getHoursOfFlightSinceLastRepair(); }

    @Override
    public boolean isNeedsRepairing(int numHoursToLastRepair) {
        return numHoursToLastRepair >= 250;
    }

    public String attack() {
        return am.attack(name, "F16", mission);
    }

    public String preformBda() {
        return bm.performBda(name, "F16", mission);
    }
}
