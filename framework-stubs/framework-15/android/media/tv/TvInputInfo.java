package android.media.tv;

public final class TvInputInfo implements android.os.Parcelable {
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
    @android.annotation.NonNull
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
    public java.lang.String getId() { return null; }
    public java.lang.String getParentId() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public android.content.Intent createSetupIntent() { return null; }
    @java.lang.Deprecated
    public android.content.Intent createSettingsIntent() { return null; }
    public int getType() { return 0; }
    public int getTunerCount() { return 0; }
    public boolean canRecord() { return false; }
    public boolean canPauseRecording() { return false; }
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

    public static final class Builder {
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
        @android.annotation.NonNull
        public android.media.tv.TvInputInfo.Builder setCanPauseRecording(boolean p0) { return null; }
        public android.media.tv.TvInputInfo.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.media.tv.TvInputInfo build() { return null; }
    }

    @android.annotation.SystemApi
    public static final class TvInputSettings {
        @android.annotation.SystemApi
        public static java.util.Set<java.lang.String> getHiddenTvInputIds(android.content.Context p0, int p1) { return null; }
        @android.annotation.SystemApi
        public static java.util.Map<java.lang.String, java.lang.String> getCustomLabels(android.content.Context p0, int p1) { return null; }
        @android.annotation.SystemApi
        public static void putHiddenTvInputs(android.content.Context p0, java.util.Set<java.lang.String> p1, int p2) {}
        @android.annotation.SystemApi
        public static void putCustomLabels(android.content.Context p0, java.util.Map<java.lang.String, java.lang.String> p1, int p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
