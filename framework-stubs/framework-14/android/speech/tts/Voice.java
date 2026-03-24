package android.speech.tts;

public class Voice implements android.os.Parcelable {
    public static final int QUALITY_VERY_LOW = 100;
    public static final int QUALITY_LOW = 200;
    public static final int QUALITY_NORMAL = 300;
    public static final int QUALITY_HIGH = 400;
    public static final int QUALITY_VERY_HIGH = 500;
    public static final int LATENCY_VERY_LOW = 100;
    public static final int LATENCY_LOW = 200;
    public static final int LATENCY_NORMAL = 300;
    public static final int LATENCY_HIGH = 400;
    public static final int LATENCY_VERY_HIGH = 500;
    public static final android.os.Parcelable.Creator<android.speech.tts.Voice> CREATOR = null;
    public Voice(java.lang.String p0, java.util.Locale p1, int p2, int p3, boolean p4, java.util.Set<java.lang.String> p5) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.util.Locale getLocale() { return null; }
    public int getQuality() { return 0; }
    public int getLatency() { return 0; }
    public boolean isNetworkConnectionRequired() { return false; }
    public java.lang.String getName() { return null; }
    public java.util.Set<java.lang.String> getFeatures() { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
