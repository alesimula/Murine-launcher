package android.telephony;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.use_oem_domain_selection_service")
public final class EmergencyRegistrationResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.EmergencyRegistrationResult> CREATOR = null;
    public EmergencyRegistrationResult(int p0, int p1, int p2, boolean p3, boolean p4, int p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) {}
    public EmergencyRegistrationResult(android.telephony.EmergencyRegistrationResult p0) {}
    public int getAccessNetwork() { return 0; }
    public int getRegState() { return 0; }
    public int getDomain() { return 0; }
    public boolean isVopsSupported() { return false; }
    public boolean isEmcBearerSupported() { return false; }
    public int getNwProvidedEmc() { return 0; }
    public int getNwProvidedEmf() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getMcc() { return null; }
    @android.annotation.NonNull
    public java.lang.String getMnc() { return null; }
    @android.annotation.NonNull
    public java.lang.String getCountryIso() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
