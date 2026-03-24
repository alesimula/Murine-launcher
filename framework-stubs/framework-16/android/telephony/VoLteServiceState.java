package android.telephony;

@java.lang.Deprecated
public final class VoLteServiceState implements android.os.Parcelable {
    public static final int INVALID = 2147483647;
    public static final int NOT_SUPPORTED = 0;
    public static final int SUPPORTED = 1;
    public static final int HANDOVER_STARTED = 0;
    public static final int HANDOVER_COMPLETED = 1;
    public static final int HANDOVER_FAILED = 2;
    public static final int HANDOVER_CANCELED = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.VoLteServiceState> CREATOR = null;
    public static android.telephony.VoLteServiceState newFromBundle(android.os.Bundle p0) { return null; }
    public VoLteServiceState() {}
    public VoLteServiceState(int p0) {}
    public VoLteServiceState(android.telephony.VoLteServiceState p0) {}
    protected void copyFrom(android.telephony.VoLteServiceState p0) {}
    public VoLteServiceState(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void validateInput() {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void fillInNotifierBundle(android.os.Bundle p0) {}
    public int getSrvccState() { return 0; }
}
