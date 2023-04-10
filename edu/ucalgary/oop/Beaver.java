package edu.ucalgary.oop;

public class Beaver extends Animal {
    private static final int[] FEEDINGTIME = {8, 9, 10};
    private static final int PREPTIME = 0;
    private static final int FEEDDURATION = 5;
    private static final int CLEANINGTIME = 5;

    // Constructor for creating an instance of the beaver class
    // @param animalNickname - the nickname of the beaver
    public Beaver(int animalID, String animalNickname, String animalSpecies) {
        super(animalID, animalNickname, animalSpecies);
    }

    // Getter methods for feeding time, preparation time, feeding duration, and cleaning time
    public int[] getFeedWindow() {
        return FEEDINGTIME;
    }

    public int getPrepTime() {
        return PREPTIME;
    }

    public int getFeedTime() {
        return FEEDDURATION;
    }

    public int getCleanTime() {
        return CLEANINGTIME;
    }
}