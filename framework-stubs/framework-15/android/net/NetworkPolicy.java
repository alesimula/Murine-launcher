package android.net;

public class NetworkPolicy implements android.os.Parcelable, java.lang.Comparable<android.net.NetworkPolicy> {
    public static final int CYCLE_NONE = -1;
    public static final long WARNING_DISABLED = -1L;
    public static final long LIMIT_DISABLED = -1L;
    public static final long SNOOZE_NEVER = -1L;
    public android.net.NetworkTemplate template;
    public android.util.RecurrenceRule cycleRule;
    public long warningBytes;
    public long limitBytes;
    public long lastWarningSnooze;
    public long lastLimitSnooze;
    public long lastRapidSnooze;
    @java.lang.Deprecated
    public boolean metered;
    public boolean inferred;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkPolicy> CREATOR = null;
    public static android.util.RecurrenceRule buildRule(int p0, java.time.ZoneId p1) { return null; }
    @java.lang.Deprecated
    public NetworkPolicy(android.net.NetworkTemplate p0, int p1, java.lang.String p2, long p3, long p4, boolean p5) {}
    @java.lang.Deprecated
    public NetworkPolicy(android.net.NetworkTemplate p0, int p1, java.lang.String p2, long p3, long p4, long p5, long p6, boolean p7, boolean p8) {}
    @java.lang.Deprecated
    public NetworkPolicy(android.net.NetworkTemplate p0, android.util.RecurrenceRule p1, long p2, long p3, long p4, long p5, boolean p6, boolean p7) {}
    public NetworkPolicy(android.net.NetworkTemplate p0, android.util.RecurrenceRule p1, long p2, long p3, long p4, long p5, long p6, boolean p7, boolean p8) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> cycleIterator() { return null; }
    public boolean isOverWarning(long p0) { return false; }
    public boolean isOverLimit(long p0) { return false; }
    public void clearSnooze() {}
    public boolean hasCycle() { return false; }
    public int compareTo(android.net.NetworkPolicy p0) { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public byte[] getBytesForBackup() throws java.io.IOException { return null; }
    public static android.net.NetworkPolicy getNetworkPolicyFromBackup(java.io.DataInputStream p0) throws java.io.IOException, android.util.BackupUtils.BadVersionException { return null; }
    public static boolean isTemplatePersistable(android.net.NetworkTemplate p0) { return false; }
}
