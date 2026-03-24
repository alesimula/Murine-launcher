package android.health.connect.datatypes;

public final class PlannedExerciseSessionRecord extends android.health.connect.datatypes.IntervalRecord {
    PlannedExerciseSessionRecord() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.PlannedExerciseBlock> getBlocks() { return null; }
    @android.annotation.Nullable
    public java.lang.String getCompletedExerciseSessionId() { return null; }
    @android.annotation.NonNull
    public java.time.Duration getDuration() { return null; }
    public int getExerciseType() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getNotes() { return null; }
    @android.annotation.NonNull
    public java.time.LocalDate getStartDate() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTitle() { return null; }
    public boolean hasExplicitTime() { return false; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, int p1, java.time.Instant p2, java.time.Instant p3) {}
        public Builder(android.health.connect.datatypes.Metadata p0, int p1, java.time.LocalDate p2, java.time.Duration p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder addBlock(android.health.connect.datatypes.PlannedExerciseBlock p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearBlocks() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setBlocks(java.util.List<android.health.connect.datatypes.PlannedExerciseBlock> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setEndTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setExerciseType(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setMetadata(android.health.connect.datatypes.Metadata p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setNotes(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setStartTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseSessionRecord.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}
