package android.adservices.ondevicepersonalization;

public final class TrainingInterval {
    public static final int SCHEDULING_MODE_ONE_TIME = 1;
    public static final int SCHEDULING_MODE_RECURRENT = 2;
    TrainingInterval() {}
    @android.annotation.NonNull
    public java.time.Duration getMinimumInterval() { return null; }
    public int getSchedulingMode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.TrainingInterval build() { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.TrainingInterval.Builder setMinimumInterval(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.TrainingInterval.Builder setSchedulingMode(int p0) { return null; }
    }
}
