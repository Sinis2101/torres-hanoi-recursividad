package model;

public class Tower {

    private int disks;
    private String id;

    public Tower(int disks, String id) {
        this.id = id;
        this.disks = disks;
    }

    public int getDisks() {
        return disks;
    }

    public void addDisk() {
        disks++;
    }

    public void removeDisk() {
        disks--;
    }

    public String getId() {
        return id;
    }
}
