package android.hardware.tv.tuner;

public class FrontendIsdbtSettings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int inversion;
    public int bandwidth;
    public int mode;
    public int guardInterval;
    public int serviceAreaId;
    public int partialReceptionFlag;
    public android.hardware.tv.tuner.FrontendIsdbtLayerSettings[] layerSettings;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbtSettings> CREATOR = null;
    public FrontendIsdbtSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
