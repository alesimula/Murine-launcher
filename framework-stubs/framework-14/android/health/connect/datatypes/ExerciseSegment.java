package android.health.connect.datatypes;

public final class ExerciseSegment {
    ExerciseSegment() {}
    public int getSegmentType() { return 0; }
    public int getRepetitionsCount() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getStartTime() { return null; }
    @android.annotation.NonNull
    public java.time.Instant getEndTime() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(java.time.Instant p0, java.time.Instant p1, int p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder setRepetitionsCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment build() { return null; }
    }
}
