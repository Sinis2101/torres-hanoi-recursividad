package model;

public class Hanoi {

    private int disks;
    private Tower originTower;
    private Tower temporalTower;
    private Tower destinationTower;

    public Hanoi(int disks) {
        this.disks = disks;
        originTower = new Tower(disks, "A");
        temporalTower = new Tower(0, "B");
        destinationTower = new Tower(0, "C");
    }

    public int getDisks() {
        return disks;
    }

    public Tower getOriginTower() {
        return originTower;
    }

    public Tower getTemporalTower() {
        return temporalTower;
    }

    public Tower getDestinationTower() {
        return destinationTower;
    }
}
