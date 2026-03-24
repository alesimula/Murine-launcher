package android.hardware.biometrics.common;

public class OperationContext implements android.os.Parcelable {
    public int id;
    public byte reason;
    @java.lang.Deprecated
    public boolean isAod;
    public boolean isCrypto;
    public int wakeReason;
    public int displayState;
    public android.hardware.biometrics.common.AuthenticateReason authenticateReason;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationContext> CREATOR = null;
    public OperationContext() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
