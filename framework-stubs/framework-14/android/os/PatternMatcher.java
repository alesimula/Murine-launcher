package android.os;

public class PatternMatcher implements android.os.Parcelable {
    public static final int PATTERN_LITERAL = 0;
    public static final int PATTERN_PREFIX = 1;
    public static final int PATTERN_SIMPLE_GLOB = 2;
    public static final int PATTERN_ADVANCED_GLOB = 3;
    public static final int PATTERN_SUFFIX = 4;
    public static final android.os.Parcelable.Creator<android.os.PatternMatcher> CREATOR = null;
    public PatternMatcher(java.lang.String p0, int p1) {}
    public final java.lang.String getPath() { return null; }
    public final int getType() { return 0; }
    public boolean match(java.lang.String p0) { return false; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean check() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public PatternMatcher(android.os.Parcel p0) {}
    static boolean matchPattern(java.lang.String p0, java.lang.String p1, int[] p2, int p3) { return false; }
    static boolean matchGlobPattern(java.lang.String p0, java.lang.String p1) { return false; }
    static synchronized int[] parseAndVerifyAdvancedPattern(java.lang.String p0) { return null; }
    static boolean matchAdvancedPattern(int[] p0, java.lang.String p1) { return false; }
}
