package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class UtcModel implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.UtcModel> CREATOR = null;
    public double getA0() { return 0.0; }
    public double getA1() { return 0.0; }
    public int getTimeOfWeek() { return 0; }
    public int getWeekNumber() { return 0; }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.UtcModel.Builder setA0(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.UtcModel.Builder setA1(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.UtcModel.Builder setTimeOfWeek(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.UtcModel.Builder setWeekNumber(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.UtcModel build() { return null; }
    }
}
