package android.app.timedetector;

public final class TelephonyTimeSuggestion implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.timedetector.TelephonyTimeSuggestion> CREATOR = null;
    public static android.app.timedetector.TelephonyTimeSuggestion parseCommandLineArg(android.os.ShellCommand p0) throws java.lang.IllegalArgumentException { return null; }
    public static void printCommandLineOpts(java.io.PrintWriter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getSlotIndex() { return 0; }
    @android.annotation.Nullable
    public android.app.time.UnixEpochTime getUnixEpochTime() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getDebugInfo() { return null; }
    public void addDebugInfo(java.lang.String p0) {}
    public void addDebugInfo(java.util.List<java.lang.String> p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.timedetector.TelephonyTimeSuggestion.Builder setUnixEpochTime(android.app.time.UnixEpochTime p0) { return null; }
        @android.annotation.NonNull
        public android.app.timedetector.TelephonyTimeSuggestion.Builder addDebugInfo(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.timedetector.TelephonyTimeSuggestion build() { return null; }
    }
}
