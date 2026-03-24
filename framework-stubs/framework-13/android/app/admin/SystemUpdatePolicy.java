package android.app.admin;

public final class SystemUpdatePolicy implements android.os.Parcelable {
    public static final int TYPE_INSTALL_AUTOMATIC = 1;
    public static final int TYPE_INSTALL_WINDOWED = 2;
    public static final int TYPE_POSTPONE = 3;
    @android.annotation.SystemApi
    public static final int TYPE_PAUSE = 4;
    static final int FREEZE_PERIOD_MAX_LENGTH = 90;
    static final int FREEZE_PERIOD_MIN_SEPARATION = 60;
    public static final android.os.Parcelable.Creator<android.app.admin.SystemUpdatePolicy> CREATOR = null;
    public static android.app.admin.SystemUpdatePolicy createAutomaticInstallPolicy() { return null; }
    public static android.app.admin.SystemUpdatePolicy createWindowedInstallPolicy(int p0, int p1) { return null; }
    public static android.app.admin.SystemUpdatePolicy createPostponeInstallPolicy() { return null; }
    public int getPolicyType() { return 0; }
    public int getInstallWindowStart() { return 0; }
    public int getInstallWindowEnd() { return 0; }
    public boolean isValid() { return false; }
    public void validateType() {}
    public android.app.admin.SystemUpdatePolicy setFreezePeriods(java.util.List<android.app.admin.FreezePeriod> p0) { return null; }
    public java.util.List<android.app.admin.FreezePeriod> getFreezePeriods() { return null; }
    public android.util.Pair<java.time.LocalDate, java.time.LocalDate> getCurrentFreezePeriod(java.time.LocalDate p0) { return null; }
    public void validateFreezePeriods() {}
    public void validateAgainstPreviousFreezePeriod(java.time.LocalDate p0, java.time.LocalDate p1, java.time.LocalDate p2) {}
    @android.annotation.SystemApi
    public android.app.admin.SystemUpdatePolicy.InstallationOption getInstallationOptionAt(long p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.app.admin.SystemUpdatePolicy restoreFromXml(android.util.TypedXmlPullParser p0) { return null; }
    public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}

    @android.annotation.SystemApi
    public static class InstallationOption {
        InstallationOption(int p0, long p1) {}
        public int getType() { return 0; }
        public long getEffectiveTime() { return 0L; }
        protected void limitEffectiveTime(long p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface InstallationOptionType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface SystemUpdatePolicyType {
    }

    public static final class ValidationFailedException extends java.lang.IllegalArgumentException implements android.os.Parcelable {
        public static final int ERROR_NONE = 0;
        public static final int ERROR_UNKNOWN = 1;
        public static final int ERROR_DUPLICATE_OR_OVERLAP = 2;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_LONG = 3;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE = 4;
        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG = 5;
        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE = 6;
        public static final android.os.Parcelable.Creator<android.app.admin.SystemUpdatePolicy.ValidationFailedException> CREATOR = null;
        public int getErrorCode() { return 0; }
        public static android.app.admin.SystemUpdatePolicy.ValidationFailedException duplicateOrOverlapPeriods() { return null; }
        public static android.app.admin.SystemUpdatePolicy.ValidationFailedException freezePeriodTooLong(java.lang.String p0) { return null; }
        public static android.app.admin.SystemUpdatePolicy.ValidationFailedException freezePeriodTooClose(java.lang.String p0) { return null; }
        public static android.app.admin.SystemUpdatePolicy.ValidationFailedException combinedPeriodTooLong(java.lang.String p0) { return null; }
        public static android.app.admin.SystemUpdatePolicy.ValidationFailedException combinedPeriodTooClose(java.lang.String p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface ValidationFailureType {
        }
    }
}
