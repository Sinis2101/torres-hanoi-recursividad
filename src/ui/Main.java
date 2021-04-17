package ui;

import model.Hanoi;
import model.Tower;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Hanoi> hanoiCases = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < cases; i++) {
            int disks = sc.nextInt(); sc.nextLine();
            Hanoi hanoiCase = new Hanoi(disks);
            hanoiCases.add(hanoiCase);
        }

        for(Hanoi hanoiCase : hanoiCases) {
            System.out.println(hanoiCase.getOriginTower().getDisks()+" "+ hanoiCase.getTemporalTower().getDisks()+" "+ hanoiCase.getDestinationTower().getDisks());
            solveHanoi(hanoiCase.getDisks(), hanoiCase.getOriginTower(), hanoiCase.getTemporalTower(), hanoiCase.getDestinationTower(), hanoiCase);
            System.out.println();
        }

    }

    public static void solveHanoi(int disks, Tower origin, Tower temporal, Tower destination, Hanoi hanoi) {
        if(disks==1) {
            moveDisk(origin, destination, hanoi);
            System.out.println(hanoi.getOriginTower().getDisks()+" "+ hanoi.getTemporalTower().getDisks()+" "+ hanoi.getDestinationTower().getDisks());
        } else {
            solveHanoi(disks-1, origin, destination, temporal, hanoi);
            moveDisk(origin, destination, hanoi);
            System.out.println(hanoi.getOriginTower().getDisks()+" "+ hanoi.getTemporalTower().getDisks()+" "+ hanoi.getDestinationTower().getDisks());
            solveHanoi(disks-1, temporal, origin, destination, hanoi);
        }
    }

    public static void moveDisk(Tower origin, Tower destination, Hanoi hanoi) {
        switch (origin.getId()) {
            case("A"):
                hanoi.getOriginTower().removeDisk();
                break;
            case("B"):
                hanoi.getTemporalTower().removeDisk();
                break;
            case("C"):
                hanoi.getDestinationTower().removeDisk();
                break;
        }
        switch (destination.getId()) {
            case("A"):
                hanoi.getOriginTower().addDisk();
                break;
            case("B"):
                hanoi.getTemporalTower().addDisk();
                break;
            case("C"):
                hanoi.getDestinationTower().addDisk();
                break;
        }
    }

}