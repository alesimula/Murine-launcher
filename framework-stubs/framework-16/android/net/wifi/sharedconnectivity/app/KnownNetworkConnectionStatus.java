package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class KnownNetworkConnectionStatus implements android.os.Parcelable {
    public static final int CONNECTION_STATUS_UNKNOWN = 0;
    public static final int CONNECTION_STATUS_SAVED = 1;
    public static final int CONNECTION_STATUS_SAVE_FAILED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus> CREATOR = null;
    public int getStatus() { return 0; }
    @android.annotation.NonNull
    public android.net.wifi.sharedconnectivity.app.KnownNetwork getKnownNetwork() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public static android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus.Builder setStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus.Builder setKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionStatus {
    }
}
