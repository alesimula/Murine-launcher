package android.hardware.radio.network;

public class SecurityAlgorithmUpdate implements android.os.Parcelable {
    public int connectionEvent;
    public int encryption;
    public int integrity;
    public boolean isUnprotectedEmergency;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.SecurityAlgorithmUpdate> CREATOR = null;
    public SecurityAlgorithmUpdate() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
