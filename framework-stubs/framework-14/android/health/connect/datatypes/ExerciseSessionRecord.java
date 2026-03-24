package android.health.connect.datatypes;

public final class ExerciseSessionRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> EXERCISE_DURATION_TOTAL = null;
    ExerciseSessionRecord() { super(); }
    public int getExerciseType() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getNotes() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.Nullable
    public android.health.connect.datatypes.ExerciseRoute getRoute() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.ExerciseSegment> getSegments() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.ExerciseLap> getLaps() { return null; }
    @android.annotation.NonNull
    public boolean hasRoute() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, int p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder setNotes(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder setTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder setRoute(android.health.connect.datatypes.ExerciseRoute p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder setLaps(java.util.List<android.health.connect.datatypes.ExerciseLap> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord.Builder setSegments(java.util.List<android.health.connect.datatypes.ExerciseSegment> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSessionRecord build() { return null; }
    }
}
