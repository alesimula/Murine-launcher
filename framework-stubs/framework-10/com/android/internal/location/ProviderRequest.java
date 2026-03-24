package com.android.internal.location;

public final class ProviderRequest implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public boolean reportLocation;
    @android.annotation.UnsupportedAppUsage
    public long interval;
    public boolean locationSettingsIgnored;
    public boolean lowPowerMode;
    @android.annotation.UnsupportedAppUsage
    public final java.util.List<android.location.LocationRequest> locationRequests = null;
    public static final android.os.Parcelable.Creator<com.android.internal.location.ProviderRequest> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public ProviderRequest() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
