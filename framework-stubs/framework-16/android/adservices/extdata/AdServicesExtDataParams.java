package android.adservices.extdata;

@android.annotation.FlaggedApi("com.android.adservices.flags.adext_data_service_apis_enabled")
public final class AdServicesExtDataParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.extdata.AdServicesExtDataParams> CREATOR = null;
    public AdServicesExtDataParams(int p0, int p1, int p2, int p3, int p4, long p5) {}
    public int describeContents() { return 0; }
    public int getIsAdultAccount() { return 0; }
    public int getIsMeasurementConsented() { return 0; }
    public int getIsNotificationDisplayed() { return 0; }
    public int getIsU18Account() { return 0; }
    public int getManualInteractionWithConsentStatus() { return 0; }
    public long getMeasurementRollbackApexVersion() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
