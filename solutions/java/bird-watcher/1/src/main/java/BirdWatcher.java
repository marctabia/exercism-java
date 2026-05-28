
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        BirdWatcher watcher = new BirdWatcher(new int[]{0, 2, 5, 3, 7, 8, 4});
        return watcher.birdsPerDay;
    }

    public int getToday() {
        int latestCount = this.birdsPerDay.length - 1;
        return this.birdsPerDay[latestCount];
    }

    public void incrementTodaysCount() {
        int latestCount = this.birdsPerDay.length - 1;
        System.out.println(latestCount);
        int todaysBirdCount = this.getToday();
        System.out.println(todaysBirdCount);
        int incBirdCount = ++todaysBirdCount;
        System.out.println(incBirdCount);
        this.birdsPerDay[latestCount] = incBirdCount;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : this.birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsTotal = 0;
        int iterLength = this.birdsPerDay.length < numberOfDays ? this.birdsPerDay.length : numberOfDays;
        for (int i = 0; i < iterLength; i++) {
            birdsTotal += this.birdsPerDay[i];
        }
        return birdsTotal;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds : this.birdsPerDay) {
            if (birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
