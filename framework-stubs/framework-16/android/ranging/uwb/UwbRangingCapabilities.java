package android.ranging.uwb;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class UwbRangingCapabilities implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.uwb.UwbRangingCapabilities> CREATOR = null;
    UwbRangingCapabilities() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.time.Duration getMinimumRangingInterval() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedChannels() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedConfigIds() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedNotificationConfigurations() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedPreambleIndexes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedRangingUpdateRates() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedSlotDurations() { return null; }
    public boolean isAzimuthalAngleSupported() { return false; }
    public boolean isBackgroundRangingSupported() { return false; }
    public boolean isDistanceMeasurementSupported() { return false; }
    public boolean isElevationAngleSupported() { return false; }
    public boolean isRangingIntervalReconfigurationSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
