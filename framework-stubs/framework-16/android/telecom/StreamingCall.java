package android.telecom;

@android.annotation.SystemApi
public final class StreamingCall implements android.os.Parcelable {
    public static final int STATE_STREAMING = 1;
    public static final int STATE_HOLDING = 2;
    public static final int STATE_DISCONNECTED = 3;
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.call_details_id_changes")
    public static final java.lang.String EXTRA_CALL_ID = "android.telecom.extra.CALL_ID";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.StreamingCall> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public StreamingCall(android.content.ComponentName p0, java.lang.CharSequence p1, android.net.Uri p2, android.os.Bundle p3) {}
    public void setAdapter(android.telecom.StreamingCallAdapter p0) {}
    @android.annotation.NonNull
    public android.content.ComponentName getComponentName() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getDisplayName() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getAddress() { return null; }
    public int getState() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public void requestStreamingState(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamingCallState {
    }
}
