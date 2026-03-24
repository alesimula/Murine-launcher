package android.app.timezonedetector;

public final class TelephonyTimeZoneSuggestion implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.timezonedetector.TelephonyTimeZoneSuggestion> CREATOR = null;
    public static final int MATCH_TYPE_NA = 0;
    public static final int MATCH_TYPE_NETWORK_COUNTRY_ONLY = 2;
    public static final int MATCH_TYPE_NETWORK_COUNTRY_AND_OFFSET = 3;
    public static final int MATCH_TYPE_EMULATOR_ZONE_ID = 4;
    public static final int MATCH_TYPE_TEST_NETWORK_OFFSET_ONLY = 5;
    public static final int QUALITY_NA = 0;
    public static final int QUALITY_SINGLE_ZONE = 1;
    public static final int QUALITY_MULTIPLE_ZONES_WITH_SAME_OFFSET = 2;
    public static final int QUALITY_MULTIPLE_ZONES_WITH_DIFFERENT_OFFSETS = 3;
    @android.annotation.NonNull
    public static android.app.timezonedetector.TelephonyTimeZoneSuggestion createEmptySuggestion(int p0, java.lang.String p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getSlotIndex() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getZoneId() { return null; }
    public int getMatchType() { return 0; }
    public int getQuality() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getDebugInfo() { return null; }
    public void addDebugInfo(java.lang.String p0) {}
    public void addDebugInfo(java.util.List<java.lang.String> p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static android.app.timezonedetector.TelephonyTimeZoneSuggestion parseCommandLineArg(android.os.ShellCommand p0) throws java.lang.IllegalArgumentException { return null; }
    public static void printCommandLineOpts(java.io.PrintWriter p0) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.timezonedetector.TelephonyTimeZoneSuggestion.Builder setZoneId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.timezonedetector.TelephonyTimeZoneSuggestion.Builder setMatchType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.timezonedetector.TelephonyTimeZoneSuggestion.Builder setQuality(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.timezonedetector.TelephonyTimeZoneSuggestion.Builder addDebugInfo(java.lang.String p0) { return null; }
        void validate() {}
        @android.annotation.NonNull
        public android.app.timezonedetector.TelephonyTimeZoneSuggestion build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MatchType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Quality {
    }
}
