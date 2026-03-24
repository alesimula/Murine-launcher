package android.net.wifi.aware;

public final class Characteristics implements android.os.Parcelable {
    public static final java.lang.String KEY_MAX_SERVICE_NAME_LENGTH = "key_max_service_name_length";
    public static final java.lang.String KEY_MAX_SERVICE_SPECIFIC_INFO_LENGTH = "key_max_service_specific_info_length";
    public static final java.lang.String KEY_MAX_MATCH_FILTER_LENGTH = "key_max_match_filter_length";
    private android.os.Bundle mCharacteristics;
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.Characteristics> CREATOR = null;
    public Characteristics(android.os.Bundle p0) {}
    public int getMaxServiceNameLength() { return 0; }
    public int getMaxServiceSpecificInfoLength() { return 0; }
    public int getMaxMatchFilterLength() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
