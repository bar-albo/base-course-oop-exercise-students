package AerialVehicles;

import Missions.Mission;

public interface AerialAttackVehicle {
    String attack(String pilotName, String vehicleName, Mission mission);
}
