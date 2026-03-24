package android.content.pm;

@android.annotation.SystemApi
public final class UserProperties implements android.os.Parcelable {
    public static final int SHOW_IN_LAUNCHER_WITH_PARENT = 0;
    public static final int SHOW_IN_LAUNCHER_SEPARATE = 1;
    public static final int SHOW_IN_LAUNCHER_NO = 2;
    public static final int SHOW_IN_SETTINGS_WITH_PARENT = 0;
    public static final int SHOW_IN_SETTINGS_SEPARATE = 1;
    public static final int SHOW_IN_SETTINGS_NO = 2;
    public static final int INHERIT_DEVICE_POLICY_NO = 0;
    public static final int INHERIT_DEVICE_POLICY_FROM_PARENT = 1;
    public static final int CROSS_PROFILE_INTENT_FILTER_ACCESS_LEVEL_ALL = 0;
    public static final int CROSS_PROFILE_INTENT_FILTER_ACCESS_LEVEL_SYSTEM = 10;
    public static final int CROSS_PROFILE_INTENT_FILTER_ACCESS_LEVEL_SYSTEM_ADD_ONLY = 20;
    public static final int CROSS_PROFILE_INTENT_RESOLUTION_STRATEGY_DEFAULT = 0;
    public static final int CROSS_PROFILE_INTENT_RESOLUTION_STRATEGY_NO_FILTERING = 1;
    public static final android.os.Parcelable.Creator<android.content.pm.UserProperties> CREATOR = null;
    public UserProperties(android.content.pm.UserProperties p0) {}
    public UserProperties(android.content.pm.UserProperties p0, boolean p1, boolean p2, boolean p3) {}
    public long getPropertiesPresent() { return 0L; }
    public int getShowInLauncher() { return 0; }
    public void setShowInLauncher(int p0) {}
    public int getShowInSettings() { return 0; }
    public void setShowInSettings(int p0) {}
    public boolean getStartWithParent() { return false; }
    public void setStartWithParent(boolean p0) {}
    public boolean getDeleteAppWithParent() { return false; }
    public void setDeleteAppWithParent(boolean p0) {}
    public int getInheritDevicePolicy() { return 0; }
    public void setInheritDevicePolicy(int p0) {}
    public boolean getUseParentsContacts() { return false; }
    public void setUseParentsContacts(boolean p0) {}
    public boolean getUpdateCrossProfileIntentFiltersOnOTA() { return false; }
    public void setUpdateCrossProfileIntentFiltersOnOTA(boolean p0) {}
    public boolean isMediaSharedWithParent() { return false; }
    public void setMediaSharedWithParent(boolean p0) {}
    public boolean isCredentialShareableWithParent() { return false; }
    public void setCredentialShareableWithParent(boolean p0) {}
    public int getCrossProfileIntentFilterAccessControl() { return 0; }
    public void setCrossProfileIntentFilterAccessControl(int p0) {}
    public int getCrossProfileIntentResolutionStrategy() { return 0; }
    public void setCrossProfileIntentResolutionStrategy(int p0) {}
    public java.lang.String toString() { return null; }
    public void println(java.io.PrintWriter p0, java.lang.String p1) {}
    public UserProperties(com.android.modules.utils.TypedXmlPullParser p0, android.content.pm.UserProperties p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void updateFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.content.pm.UserProperties.Builder setShowInLauncher(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setStartWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setShowInSettings(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setInheritDevicePolicy(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setUseParentsContacts(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setUpdateCrossProfileIntentFiltersOnOTA(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setCrossProfileIntentFilterAccessControl(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setCrossProfileIntentResolutionStrategy(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setMediaSharedWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setCredentialShareableWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setDeleteAppWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CrossProfileIntentFilterAccessControlLevel {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CrossProfileIntentResolutionStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InheritDevicePolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface PropertyIndex {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowInLauncher {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowInSettings {
    }
}
