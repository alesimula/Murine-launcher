package android.app;

public final class AutomaticZenRule implements android.os.Parcelable {
    private static final int ENABLED = 1;
    private static final int DISABLED = 0;
    private boolean enabled;
    private java.lang.String name;
    private int interruptionFilter;
    private android.net.Uri conditionId;
    private android.content.ComponentName owner;
    private android.content.ComponentName configurationActivity;
    private long creationTime;
    private android.service.notification.ZenPolicy mZenPolicy;
    private boolean mModified;
    private java.lang.String mPkg;
    public static final android.os.Parcelable.Creator<android.app.AutomaticZenRule> CREATOR = null;
    @java.lang.Deprecated
    public AutomaticZenRule(java.lang.String p0, android.content.ComponentName p1, android.net.Uri p2, int p3, boolean p4) {}
    public AutomaticZenRule(java.lang.String p0, android.content.ComponentName p1, android.content.ComponentName p2, android.net.Uri p3, android.service.notification.ZenPolicy p4, int p5, boolean p6) {}
    public AutomaticZenRule(java.lang.String p0, android.content.ComponentName p1, android.content.ComponentName p2, android.net.Uri p3, android.service.notification.ZenPolicy p4, int p5, boolean p6, long p7) {}
    public AutomaticZenRule(android.os.Parcel p0) {}
    public android.content.ComponentName getOwner() { return null; }
    public android.content.ComponentName getConfigurationActivity() { return null; }
    public android.net.Uri getConditionId() { return null; }
    public int getInterruptionFilter() { return 0; }
    public java.lang.String getName() { return null; }
    public boolean isEnabled() { return false; }
    public boolean isModified() { return false; }
    public android.service.notification.ZenPolicy getZenPolicy() { return null; }
    public long getCreationTime() { return 0L; }
    public void setConditionId(android.net.Uri p0) {}
    public void setInterruptionFilter(int p0) {}
    public void setName(java.lang.String p0) {}
    public void setEnabled(boolean p0) {}
    public void setModified(boolean p0) {}
    public void setZenPolicy(android.service.notification.ZenPolicy p0) {}
    public void setConfigurationActivity(android.content.ComponentName p0) {}
    public void setPackageName(java.lang.String p0) {}
    public java.lang.String getPackageName() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
