package android.health.connect.datatypes;

public final class SleepSessionRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> SLEEP_DURATION_TOTAL = null;
    SleepSessionRecord() { super(); }
    @android.annotation.Nullable
    public java.lang.CharSequence getNotes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.SleepSessionRecord.Stage> getStages() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTitle() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord.Builder setNotes(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord.Builder setStages(java.util.List<android.health.connect.datatypes.SleepSessionRecord.Stage> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SleepSessionRecord.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }

    public static class Stage {
        public Stage(java.time.Instant p0, java.time.Instant p1, int p2) {}
        @android.annotation.NonNull
        public java.time.Instant getEndTime() { return null; }
        @android.annotation.NonNull
        public java.time.Instant getStartTime() { return null; }
        public int getType() { return 0; }
    }

    public static final class StageType {
        public static final int STAGE_TYPE_AWAKE = 1;
        public static final int STAGE_TYPE_AWAKE_IN_BED = 7;
        public static final int STAGE_TYPE_AWAKE_OUT_OF_BED = 3;
        public static final int STAGE_TYPE_SLEEPING = 2;
        public static final int STAGE_TYPE_SLEEPING_DEEP = 5;
        public static final int STAGE_TYPE_SLEEPING_LIGHT = 4;
        public static final int STAGE_TYPE_SLEEPING_REM = 6;
        public static final int STAGE_TYPE_UNKNOWN = 0;
        StageType() {}
    }
}
