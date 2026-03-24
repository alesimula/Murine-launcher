package android.health.connect.datatypes;

public final class MindfulnessSessionRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> MINDFULNESS_DURATION_TOTAL = null;
    public static final int MINDFULNESS_SESSION_TYPE_BREATHING = 3;
    public static final int MINDFULNESS_SESSION_TYPE_MEDITATION = 1;
    public static final int MINDFULNESS_SESSION_TYPE_MOVEMENT = 5;
    public static final int MINDFULNESS_SESSION_TYPE_MUSIC = 4;
    public static final int MINDFULNESS_SESSION_TYPE_UNGUIDED = 6;
    public static final int MINDFULNESS_SESSION_TYPE_UNKNOWN = 0;
    public static final int MINDFULNESS_SESSION_TYPE_YOGA = 2;
    MindfulnessSessionRecord() { super(); }
    public int getMindfulnessSessionType() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getNotes() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTitle() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, int p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.MindfulnessSessionRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder setNotes(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MindfulnessSessionRecord.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}
