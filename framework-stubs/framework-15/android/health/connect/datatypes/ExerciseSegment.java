package android.health.connect.datatypes;

public final class ExerciseSegment {
    ExerciseSegment() {}
    @android.annotation.NonNull
    public java.time.Instant getEndTime() { return null; }
    public int getRepetitionsCount() { return 0; }
    public int getSegmentType() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getStartTime() { return null; }

    public static final class Builder {
        public Builder(java.time.Instant p0, java.time.Instant p1, int p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder setRepetitionsCount(int p0) { return null; }
    }
}
