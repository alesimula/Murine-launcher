package android.telephony;

@android.annotation.SystemApi
public final class ThermalMitigationRequest implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_ACTION_DATA_THROTTLING = 0;
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_ACTION_VOICE_ONLY = 1;
    @android.annotation.SystemApi
    public static final int THERMAL_MITIGATION_ACTION_RADIO_OFF = 2;
    public static final android.os.Parcelable.Creator<android.telephony.ThermalMitigationRequest> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public int getThermalMitigationAction() { return 0; }
    public android.telephony.DataThrottlingRequest getDataThrottlingRequest() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder() {}
        public android.telephony.ThermalMitigationRequest.Builder setThermalMitigationAction(int p0) { return null; }
        public android.telephony.ThermalMitigationRequest.Builder setDataThrottlingRequest(android.telephony.DataThrottlingRequest p0) { return null; }
        public android.telephony.ThermalMitigationRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ThermalMitigationAction {
    }
}
