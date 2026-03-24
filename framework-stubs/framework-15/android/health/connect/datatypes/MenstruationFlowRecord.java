package android.health.connect.datatypes;

public final class MenstruationFlowRecord extends android.health.connect.datatypes.InstantRecord {
    MenstruationFlowRecord() { super(); }
    public int getFlow() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.MenstruationFlowRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MenstruationFlowRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.MenstruationFlowRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
    }

    public static final class MenstruationFlowType {
        public static final int FLOW_HEAVY = 3;
        public static final int FLOW_LIGHT = 1;
        public static final int FLOW_MEDIUM = 2;
        public static final int FLOW_UNKNOWN = 0;
        MenstruationFlowType() {}
    }
}
