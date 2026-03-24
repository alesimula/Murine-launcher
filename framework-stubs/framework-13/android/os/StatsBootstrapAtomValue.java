package android.os;

public final class StatsBootstrapAtomValue implements android.os.Parcelable {
    public static final int boolValue = 0;
    public static final int intValue = 1;
    public static final int longValue = 2;
    public static final int floatValue = 3;
    public static final int stringValue = 4;
    public static final int bytesValue = 5;
    public static final android.os.Parcelable.Creator<android.os.StatsBootstrapAtomValue> CREATOR = null;
    public StatsBootstrapAtomValue() {}
    public int getTag() { return 0; }
    public static android.os.StatsBootstrapAtomValue boolValue(boolean p0) { return null; }
    public boolean getBoolValue() { return false; }
    public void setBoolValue(boolean p0) {}
    public static android.os.StatsBootstrapAtomValue intValue(int p0) { return null; }
    public int getIntValue() { return 0; }
    public void setIntValue(int p0) {}
    public static android.os.StatsBootstrapAtomValue longValue(long p0) { return null; }
    public long getLongValue() { return 0L; }
    public void setLongValue(long p0) {}
    public static android.os.StatsBootstrapAtomValue floatValue(float p0) { return null; }
    public float getFloatValue() { return 0.0f; }
    public void setFloatValue(float p0) {}
    public static android.os.StatsBootstrapAtomValue stringValue(java.lang.String p0) { return null; }
    public java.lang.String getStringValue() { return null; }
    public void setStringValue(java.lang.String p0) {}
    public static android.os.StatsBootstrapAtomValue bytesValue(byte[] p0) { return null; }
    public byte[] getBytesValue() { return null; }
    public void setBytesValue(byte[] p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int boolValue = 0;
        public static final int intValue = 1;
        public static final int longValue = 2;
        public static final int floatValue = 3;
        public static final int stringValue = 4;
        public static final int bytesValue = 5;
    }
}
