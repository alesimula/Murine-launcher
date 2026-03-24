package android.os;

@android.annotation.SystemApi
public final class IncidentReportArgs implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.IncidentReportArgs> CREATOR = null;
    public IncidentReportArgs() {}
    public IncidentReportArgs(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void setAll(boolean p0) {}
    public void setPrivacyPolicy(int p0) {}
    public void addSection(int p0) {}
    public boolean isAll() { return false; }
    public boolean containsSection(int p0) { return false; }
    public int sectionCount() { return 0; }
    public void addHeader(byte[] p0) {}
}
