package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService {
    protected String name;
    protected Mission mission;
    protected int numHoursToLastRepair;
    protected boolean readyToFly;

    public AerialVehicle(String name, Mission mission, int numHoursToLastRepair, boolean readyToFly) {
        this.name = name;
        this.mission = mission;
        this.numHoursToLastRepair = numHoursToLastRepair;
        this.readyToFly = readyToFly;
    }

    public Mission getMission() { return mission; }

    public void setMission(Mission mission) { this.mission = mission; }

    public void setHoursOfFlightSinceLastRepair(int numHoursToLastRepair) {
        this.numHoursToLastRepair = numHoursToLastRepair;
    }

    public int getHoursOfFlightSinceLastRepair() { return numHoursToLastRepair; }

    public abstract boolean isNeedsRepairing(int numHoursToLastRepair);

    @Override
    public void flyTo() {
        Coordinates dest = mission.getDestination();
        System.out.printf("Flying to: %f, %f\n", dest.getLatitude(), dest.getLongitude());
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }


    @Override
    public void check() {
        if(isNeedsRepairing(numHoursToLastRepair))
            repair();
    }

    @Override
    public void repair() {
        readyToFly = true;
        numHoursToLastRepair = 0;
    }
}
