package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsExternalCallState implements android.os.Parcelable {
    public static final int CALL_STATE_CONFIRMED = 1;
    public static final int CALL_STATE_TERMINATED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsExternalCallState> CREATOR = null;
    public ImsExternalCallState() {}
    public ImsExternalCallState(int p0, android.net.Uri p1, boolean p2, int p3, int p4, boolean p5) {}
    public ImsExternalCallState(int p0, android.net.Uri p1, android.net.Uri p2, boolean p3, int p4, int p5, boolean p6) {}
    public ImsExternalCallState(java.lang.String p0, android.net.Uri p1, android.net.Uri p2, boolean p3, int p4, int p5, boolean p6) {}
    public ImsExternalCallState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getCallId() { return 0; }
    @android.annotation.NonNull
    public android.net.Uri getAddress() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getLocalAddress() { return null; }
    public boolean isCallPullable() { return false; }
    public int getCallState() { return 0; }
    public int getCallType() { return 0; }
    public boolean isCallHeld() { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExternalCallState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExternalCallType {
    }
}
