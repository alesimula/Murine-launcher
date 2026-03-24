package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class LeapSecondsModel implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.LeapSecondsModel> CREATOR = null;
    public int getLeapSeconds() { return 0; }
    public int getLeapSecondsFuture() { return 0; }
    public int getWeekNumberLeapSecondsFuture() { return 0; }
    public int getDayNumberLeapSecondsFuture() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.LeapSecondsModel.Builder setLeapSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.LeapSecondsModel.Builder setLeapSecondsFuture(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.LeapSecondsModel.Builder setWeekNumberLeapSecondsFuture(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.LeapSecondsModel.Builder setDayNumberLeapSecondsFuture(int p0) { return null; }
        @android.annotation.NonNull
        public android.location.LeapSecondsModel build() { return null; }
    }
}
