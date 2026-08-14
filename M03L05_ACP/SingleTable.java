package M03L05_ACP;

// Helper class representing a single table at the restaurant
class SingleTable {
    private int numSeats;
    private double viewQuality;
    private int height;

    public SingleTable(int numSeats, double viewQuality, int height) {
        this.numSeats = numSeats;
        this.viewQuality = viewQuality;
        this.height = height;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        this.viewQuality = value;
    }
}
