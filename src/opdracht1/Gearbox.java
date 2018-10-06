package opdracht1;

public class Gearbox {
    private int maxGears;
    private boolean clutchlsln;
    private Gear[] gears;
    private int currentGear = 0;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears + 1;
        gears = new Gear[this.maxGears];

        for (int i = 0; i < this.maxGears ; i++) {
            gears[i] = new Gear();
            gears[i].setGearNumber(i);
        }
    }

    public void operateClutch(boolean in) {
        clutchlsln = in;
    }

    public double wheelSpeed(int revs) {
        if (clutchlsln) {
            System.out.println("Kapot");
            return 0;
        }else {
            return gears[currentGear].driveSpeed(revs);
        }
    }

    public void changeGear(int  newGear) {
        if (clutchlsln && newGear > 0 && newGear <= maxGears) {
            currentGear = newGear;
            System.out.println("Gear" + newGear + "selected");
        }else {
            currentGear = 0;
            System.out.println("kan niet schakelen");
        }
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public double driveSpeed(int revs) {
            return revs * ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public void setGearNumber(int gearNumber) {
            this.gearNumber = gearNumber;
            this.ratio = gearNumber * 5.3;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
