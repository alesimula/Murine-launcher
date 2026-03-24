package android.telephony.ims;

@android.annotation.SystemApi
public final class AudioCodecAttributes implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.AudioCodecAttributes> CREATOR = null;
    public AudioCodecAttributes(float p0, android.util.Range<java.lang.Float> p1, float p2, android.util.Range<java.lang.Float> p3) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public float getBitrateKbps() { return 0.0f; }
    @android.annotation.NonNull
    public android.util.Range<java.lang.Float> getBitrateRangeKbps() { return null; }
    public float getBandwidthKhz() { return 0.0f; }
    @android.annotation.NonNull
    public android.util.Range<java.lang.Float> getBandwidthRangeKhz() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
