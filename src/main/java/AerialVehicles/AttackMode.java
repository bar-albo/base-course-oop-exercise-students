package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;

public class AttackMode implements AerialAttackVehicle {
    int numMissiles;
    String missilesType;

    public AttackMode(int numMissles, String missleType) {
        this.numMissiles = numMissles;
        this.missilesType = missleType;
    }

    @Override
    public String attack(String pilotName, String vehicleName, Mission mission) {
        if (mission instanceof AttackMission) {
            String target = ((AttackMission) mission).getTarget();
            return String.format("%s: %s Attacking %s with: %sX%d", pilotName, vehicleName, target, missilesType, numMissiles);
        }
        return null;
    }
}
