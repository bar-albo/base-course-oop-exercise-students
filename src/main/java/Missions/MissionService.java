package Missions;

public interface MissionService {
    default void begin() {
        System.out.println("Beginning Mission!");
    }
    default void cancel() {
        System.out.println("Abort Mission!");
    }
    default void finish() {
        System.out.println("Finish Mission!");
    }
}
