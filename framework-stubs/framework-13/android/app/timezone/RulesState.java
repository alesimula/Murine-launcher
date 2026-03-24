package android.app.timezone;

public final class RulesState implements android.os.Parcelable {
    public static final int STAGED_OPERATION_UNKNOWN = 0;
    public static final int STAGED_OPERATION_NONE = 1;
    public static final int STAGED_OPERATION_UNINSTALL = 2;
    public static final int STAGED_OPERATION_INSTALL = 3;
    public static final int DISTRO_STATUS_UNKNOWN = 0;
    public static final int DISTRO_STATUS_NONE = 1;
    public static final int DISTRO_STATUS_INSTALLED = 2;
    public static final android.os.Parcelable.Creator<android.app.timezone.RulesState> CREATOR = null;
    public RulesState(java.lang.String p0, android.app.timezone.DistroFormatVersion p1, boolean p2, int p3, android.app.timezone.DistroRulesVersion p4, int p5, android.app.timezone.DistroRulesVersion p6) {}
    public java.lang.String getBaseRulesVersion() { return null; }
    public boolean isOperationInProgress() { return false; }
    public int getStagedOperationType() { return 0; }
    public android.app.timezone.DistroRulesVersion getStagedDistroRulesVersion() { return null; }
    public int getDistroStatus() { return 0; }
    public android.app.timezone.DistroRulesVersion getInstalledDistroRulesVersion() { return null; }
    public boolean isDistroFormatVersionSupported(android.app.timezone.DistroFormatVersion p0) { return false; }
    public boolean isBaseVersionNewerThan(android.app.timezone.DistroRulesVersion p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface DistroStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface StagedOperationType {
    }
}
