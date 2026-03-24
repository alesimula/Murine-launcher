package android.content;

public final class ComponentName implements android.os.Parcelable, java.lang.Cloneable, java.lang.Comparable<android.content.ComponentName> {
    public static final android.os.Parcelable.Creator<android.content.ComponentName> CREATOR = null;
    public static android.content.ComponentName createRelative(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.content.ComponentName createRelative(android.content.Context p0, java.lang.String p1) { return null; }
    public ComponentName(java.lang.String p0, java.lang.String p1) {}
    public ComponentName(android.content.Context p0, java.lang.String p1) {}
    public ComponentName(android.content.Context p0, java.lang.Class<?> p1) {}
    public android.content.ComponentName clone() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getClassName() { return null; }
    public java.lang.String getShortClassName() { return null; }
    public static java.lang.String flattenToShortString(android.content.ComponentName p0) { return null; }
    public java.lang.String flattenToString() { return null; }
    public java.lang.String flattenToShortString() { return null; }
    public void appendShortString(java.lang.StringBuilder p0) {}
    public static void appendShortString(java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2) {}
    public static void printShortString(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2) {}
    public static android.content.ComponentName unflattenFromString(java.lang.String p0) { return null; }
    public java.lang.String toShortString() { return null; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int compareTo(android.content.ComponentName p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static void writeToParcel(android.content.ComponentName p0, android.os.Parcel p1) {}
    public static android.content.ComponentName readFromParcel(android.os.Parcel p0) { return null; }
    public ComponentName(android.os.Parcel p0) {}

    @java.lang.FunctionalInterface
    public static interface WithComponentName {
        public android.content.ComponentName getComponentName();
    }
}
