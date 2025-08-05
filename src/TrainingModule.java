public class TrainingModule {

    private String title;

    public int getDurationInHrs() {
        return durationInHrs;
    }

    public void setDurationInHrs(int durationInHrs) {
        this.durationInHrs = durationInHrs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TrainingModule(String title, int durationInHrs) {
        this.title = title;
        this.durationInHrs = durationInHrs;
    }

    private int durationInHrs;

}

