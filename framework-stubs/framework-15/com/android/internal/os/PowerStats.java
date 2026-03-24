package com.android.internal.os;

public final class PowerStats {
    public static final int MAX_STATS_ARRAY_LENGTH = Integer.valueOf(0);
    public static final int MAX_STATE_STATS_ARRAY_LENGTH = Integer.valueOf(0);
    public static final int MAX_UID_STATS_ARRAY_LENGTH = Integer.valueOf(0);
    public final com.android.internal.os.PowerStats.Descriptor descriptor = null;
    public long durationMs;
    public long[] stats;
    public final android.util.SparseArray<long[]> stateStats = null;
    public final android.util.SparseArray<long[]> uidStats = null;
    public PowerStats(com.android.internal.os.PowerStats.Descriptor p0) {}
    public void writeToParcel(android.os.Parcel p0) {}
    @android.annotation.Nullable
    public static com.android.internal.os.PowerStats readFromParcel(android.os.Parcel p0, com.android.internal.os.PowerStats.DescriptorRegistry p1) { return null; }
    public java.lang.String formatForBatteryHistory(java.lang.String p0) { return null; }
    public void dump(android.util.IndentingPrintWriter p0) {}
    public java.lang.String toString() { return null; }

    public static class Descriptor {
        public static final java.lang.String EXTRA_DEVICE_STATS_FORMAT = "format-device";
        public static final java.lang.String EXTRA_STATE_STATS_FORMAT = "format-state";
        public static final java.lang.String EXTRA_UID_STATS_FORMAT = "format-uid";
        public static final java.lang.String XML_TAG_DESCRIPTOR = "descriptor";
        public final int powerComponentId = 0;
        public final java.lang.String name = null;
        public final int statsArrayLength = 0;
        public final android.util.SparseArray<java.lang.String> stateLabels = null;
        public final int stateStatsArrayLength = 0;
        public final int uidStatsArrayLength = 0;
        public final android.os.PersistableBundle extras = null;
        public Descriptor(int p0, int p1, android.util.SparseArray<java.lang.String> p2, int p3, int p4, android.os.PersistableBundle p5) {}
        public Descriptor(int p0, java.lang.String p1, int p2, android.util.SparseArray<java.lang.String> p3, int p4, int p5, android.os.PersistableBundle p6) {}
        public com.android.internal.os.PowerStats.PowerStatsFormatter getDeviceStatsFormatter() { return null; }
        public com.android.internal.os.PowerStats.PowerStatsFormatter getStateStatsFormatter() { return null; }
        public com.android.internal.os.PowerStats.PowerStatsFormatter getUidStatsFormatter() { return null; }
        public java.lang.String getStateLabel(int p0) { return null; }
        public void writeSummaryToParcel(android.os.Parcel p0) {}
        @android.annotation.Nullable
        public static com.android.internal.os.PowerStats.Descriptor readSummaryFromParcel(android.os.Parcel p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public void writeXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
        public static com.android.internal.os.PowerStats.Descriptor createFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class DescriptorRegistry {
        public DescriptorRegistry() {}
        public void register(com.android.internal.os.PowerStats.Descriptor p0) {}
        public com.android.internal.os.PowerStats.Descriptor get(int p0) { return null; }
    }

    public static class PowerStatsFormatter {
        public PowerStatsFormatter(java.lang.String p0) {}
        public java.lang.String format(long[] p0) { return null; }

        private static class Section {
            public java.lang.String label;
            public int position;
            public int length;
            public boolean optional;
            public boolean typePower;
        }
    }
}
