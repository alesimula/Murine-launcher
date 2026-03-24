package android.net;

public final class NetworkScore implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkScore> CREATOR = null;
    public static final int KEEP_CONNECTED_FOR_HANDOVER = 1;
    public static final int KEEP_CONNECTED_NONE = 0;
    NetworkScore() {}
    public int getLegacyInt() { return 0; }
    public int getKeepConnectedReason() { return 0; }
    public boolean isTransportPrimary() { return false; }
    public boolean isExiting() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.NetworkScore.Builder setLegacyInt(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkScore.Builder setTransportPrimary(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkScore.Builder setExiting(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkScore.Builder setKeepConnectedReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkScore build() { return null; }
    }
}
