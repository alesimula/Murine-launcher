package com.android.internal.location;

public final class ProviderProperties implements android.os.Parcelable {
    public final boolean mRequiresNetwork = false;
    public final boolean mRequiresSatellite = false;
    public final boolean mRequiresCell = false;
    public final boolean mHasMonetaryCost = false;
    public final boolean mSupportsAltitude = false;
    public final boolean mSupportsSpeed = false;
    public final boolean mSupportsBearing = false;
    public final int mPowerRequirement = 0;
    public final int mAccuracy = 0;
    public static final android.os.Parcelable.Creator<com.android.internal.location.ProviderProperties> CREATOR = null;
    public ProviderProperties(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, int p7, int p8) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private static java.lang.String powerToString(int p0) { return null; }
    private static java.lang.String accuracyToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Accuracy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerRequirement {
    }
}
