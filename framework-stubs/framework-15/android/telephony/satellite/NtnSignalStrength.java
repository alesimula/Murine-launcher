package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public final class NtnSignalStrength implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NTN_SIGNAL_STRENGTH_NONE = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NTN_SIGNAL_STRENGTH_POOR = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NTN_SIGNAL_STRENGTH_MODERATE = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NTN_SIGNAL_STRENGTH_GOOD = 3;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NTN_SIGNAL_STRENGTH_GREAT = 4;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final android.os.Parcelable.Creator<android.telephony.satellite.NtnSignalStrength> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public NtnSignalStrength(int p0) {}
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public NtnSignalStrength(android.telephony.satellite.NtnSignalStrength p0) {}
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int getLevel() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NtnSignalStrengthLevel {
    }
}
