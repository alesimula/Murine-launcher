package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class SharedConnectivitySettingsState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState> CREATOR = null;
    public boolean isInstantTetherEnabled() { return false; }
    @android.annotation.Nullable
    public android.app.PendingIntent getInstantTetherSettingsPendingIntent() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public static android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState.Builder setInstantTetherEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState.Builder setInstantTetherSettingsPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState build() { return null; }
    }
}
