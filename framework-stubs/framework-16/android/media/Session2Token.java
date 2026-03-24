package android.media;

public final class Session2Token implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.Session2Token> CREATOR = null;
    public static final int TYPE_SESSION = 0;
    public static final int TYPE_SESSION_SERVICE = 1;
    public Session2Token(android.content.Context p0, android.content.ComponentName p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getServiceName() { return null; }
    public int getType() { return 0; }
    public int getUid() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
