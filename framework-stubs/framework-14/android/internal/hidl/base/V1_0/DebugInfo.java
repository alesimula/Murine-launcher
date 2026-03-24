package android.internal.hidl.base.V1_0;

public final class DebugInfo {
    public int pid;
    public long ptr;
    public int arch;
    public DebugInfo() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.internal.hidl.base.V1_0.DebugInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.internal.hidl.base.V1_0.DebugInfo> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}

    public static final class Architecture {
        public static final int UNKNOWN = 0;
        public static final int IS_64BIT = 1;
        public static final int IS_32BIT = 2;
        public Architecture() {}
        public static final java.lang.String toString(int p0) { return null; }
        public static final java.lang.String dumpBitfield(int p0) { return null; }
    }
}
