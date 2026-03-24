package android.media.tv;

public final class TvInputInfo implements android.os.Parcelable {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "TvInputInfo";
    public static final int TYPE_TUNER = 0;
    public static final int TYPE_OTHER = 1000;
    public static final int TYPE_COMPOSITE = 1001;
    public static final int TYPE_SVIDEO = 1002;
    public static final int TYPE_SCART = 1003;
    public static final int TYPE_COMPONENT = 1004;
    public static final int TYPE_VGA = 1005;
    public static final int TYPE_DVI = 1006;
    public static final int TYPE_HDMI = 1007;
    public static final int TYPE_DISPLAY_PORT = 1008;
    public static final java.lang.String EXTRA_INPUT_ID = "android.media.tv.extra.INPUT_ID";
    private final android.content.pm.ResolveInfo mService = null;
    private final java.lang.String mId = null;
    private final int mType = 0;
    private final boolean mIsHardwareInput = false;
    private android.net.Uri mIconUri;
    private final java.lang.CharSequence mLabel = null;
    private final int mLabelResId = 0;
    private final android.graphics.drawable.Icon mIcon = null;
    private final android.graphics.drawable.Icon mIconStandby = null;
    private final android.graphics.drawable.Icon mIconDisconnected = null;
    private final java.lang.String mSetupActivity = null;
    private final boolean mCanRecord = false;
    private final int mTunerCount = 0;
    private final android.hardware.hdmi.HdmiDeviceInfo mHdmiDeviceInfo = null;
    private final boolean mIsConnectedToHdmiSwitch = false;
    private final int mHdmiConnectionRelativePosition = 0;
    private final java.lang.String mParentId = null;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.media.tv.TvInputInfo> CREATOR = null;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static android.media.tv.TvInputInfo createTvInputInfo(android.content.Context p0, android.content.pm.ResolveInfo p1, android.hardware.hdmi.HdmiDeviceInfo p2, java.lang.String p3, java.lang.String p4, android.net.Uri p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static android.media.tv.TvInputInfo createTvInputInfo(android.content.Context p0, android.content.pm.ResolveInfo p1, android.hardware.hdmi.HdmiDeviceInfo p2, java.lang.String p3, int p4, android.graphics.drawable.Icon p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static android.media.tv.TvInputInfo createTvInputInfo(android.content.Context p0, android.content.pm.ResolveInfo p1, android.media.tv.TvInputHardwareInfo p2, java.lang.String p3, android.net.Uri p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static android.media.tv.TvInputInfo createTvInputInfo(android.content.Context p0, android.content.pm.ResolveInfo p1, android.media.tv.TvInputHardwareInfo p2, int p3, android.graphics.drawable.Icon p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private TvInputInfo(android.content.pm.ResolveInfo p0, java.lang.String p1, int p2, boolean p3, java.lang.CharSequence p4, int p5, android.graphics.drawable.Icon p6, android.graphics.drawable.Icon p7, android.graphics.drawable.Icon p8, java.lang.String p9, boolean p10, int p11, android.hardware.hdmi.HdmiDeviceInfo p12, boolean p13, int p14, java.lang.String p15, android.os.Bundle p16) {}
    public java.lang.String getId() { return null; }
    public java.lang.String getParentId() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.content.ComponentName getComponent() { return null; }
    public android.content.Intent createSetupIntent() { return null; }
    @java.lang.Deprecated
    public android.content.Intent createSettingsIntent() { return null; }
    public int getType() { return 0; }
    public int getTunerCount() { return 0; }
    public boolean canRecord() { return false; }
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.SystemApi
    public android.hardware.hdmi.HdmiDeviceInfo getHdmiDeviceInfo() { return null; }
    public boolean isPassthroughInput() { return false; }
    @android.annotation.SystemApi
    public boolean isHardwareInput() { return false; }
    @android.annotation.SystemApi
    public boolean isConnectedToHdmiSwitch() { return false; }
    public int getHdmiConnectionRelativePosition() { return 0; }
    public boolean isHidden(android.content.Context p0) { return false; }
    public java.lang.CharSequence loadLabel(android.content.Context p0) { return null; }
    public java.lang.CharSequence loadCustomLabel(android.content.Context p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.Context p0) { return null; }
    @android.annotation.SystemApi
    public android.graphics.drawable.Drawable loadIcon(android.content.Context p0, int p1) { return null; }
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private android.graphics.drawable.Drawable loadServiceIcon(android.content.Context p0) { return null; }
    private TvInputInfo(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }

    @android.annotation.SystemApi
    public static final class TvInputSettings {
        private static final java.lang.String TV_INPUT_SEPARATOR = ":";
        private static final java.lang.String CUSTOM_NAME_SEPARATOR = ",";
        private TvInputSettings() {}
        private static boolean isHidden(android.content.Context p0, java.lang.String p1, int p2) { return false; }
        private static java.lang.String getCustomLabel(android.content.Context p0, java.lang.String p1, int p2) { return null; }
        @android.annotation.SystemApi
        public static java.util.Set<java.lang.String> getHiddenTvInputIds(android.content.Context p0, int p1) { return null; }
        @android.annotation.SystemApi
        public static java.util.Map<java.lang.String, java.lang.String> getCustomLabels(android.content.Context p0, int p1) { return null; }
        @android.annotation.SystemApi
        public static void putHiddenTvInputs(android.content.Context p0, java.util.Set<java.lang.String> p1, int p2) {}
        @android.annotation.SystemApi
        public static void putCustomLabels(android.content.Context p0, java.util.Map<java.lang.String, java.lang.String> p1, int p2) {}
        private static void ensureValidField(java.lang.String p0) {}
    }

    public static final class Builder {
        private static final int LENGTH_HDMI_PHYSICAL_ADDRESS = 4;
        private static final int LENGTH_HDMI_DEVICE_ID = 2;
        private static final java.lang.String XML_START_TAG_NAME = "tv-input";
        private static final java.lang.String DELIMITER_INFO_IN_ID = "/";
        private static final java.lang.String PREFIX_HDMI_DEVICE = "HDMI";
        private static final java.lang.String PREFIX_HARDWARE_DEVICE = "HW";
        private static final android.util.SparseIntArray sHardwareTypeToTvInputType = null;
        private final android.content.Context mContext = null;
        private final android.content.pm.ResolveInfo mResolveInfo = null;
        private java.lang.CharSequence mLabel;
        private int mLabelResId;
        private android.graphics.drawable.Icon mIcon;
        private android.graphics.drawable.Icon mIconStandby;
        private android.graphics.drawable.Icon mIconDisconnected;
        private java.lang.String mSetupActivity;
        private java.lang.Boolean mCanRecord;
        private java.lang.Integer mTunerCount;
        private android.media.tv.TvInputHardwareInfo mTvInputHardwareInfo;
        private android.hardware.hdmi.HdmiDeviceInfo mHdmiDeviceInfo;
        private java.lang.String mParentId;
        private android.os.Bundle mExtras;
        public Builder(android.content.Context p0, android.content.ComponentName p1) {}
        public Builder(android.content.Context p0, android.content.pm.ResolveInfo p1) {}
        @android.annotation.SystemApi
        public android.media.tv.TvInputInfo.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.SystemApi
        public android.media.tv.TvInputInfo.Builder setIcon(android.graphics.drawable.Icon p0, int p1) { return null; }
        @android.annotation.SystemApi
        public android.media.tv.TvInputInfo.Builder setLabel(java.lang.CharSequence p0) { return null; }
        @android.annotation.SystemApi
        public android.media.tv.TvInputInfo.Builder setLabel(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.tv.TvInputInfo.Builder setHdmiDeviceInfo(android.hardware.hdmi.HdmiDeviceInfo p0) { return null; }
        @android.annotation.SystemApi
        public android.media.tv.TvInputInfo.Builder setParentId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.tv.TvInputInfo.Builder setTvInputHardwareInfo(android.media.tv.TvInputHardwareInfo p0) { return null; }
        public android.media.tv.TvInputInfo.Builder setTunerCount(int p0) { return null; }
        public android.media.tv.TvInputInfo.Builder setCanRecord(boolean p0) { return null; }
        public android.media.tv.TvInputInfo.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.media.tv.TvInputInfo build() { return null; }
        private static java.lang.String generateInputId(android.content.ComponentName p0) { return null; }
        private static java.lang.String generateInputId(android.content.ComponentName p0, android.hardware.hdmi.HdmiDeviceInfo p1) { return null; }
        private static java.lang.String generateInputId(android.content.ComponentName p0, android.media.tv.TvInputHardwareInfo p1) { return null; }
        private static int getRelativePosition(android.content.Context p0, android.hardware.hdmi.HdmiDeviceInfo p1) { return 0; }
        private void parseServiceMetadata(int p0) {}
    }
}
