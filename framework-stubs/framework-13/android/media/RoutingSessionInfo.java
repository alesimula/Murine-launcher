package android.media;

public final class RoutingSessionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.RoutingSessionInfo> CREATOR = null;
    final java.lang.String mId = null;
    final java.lang.CharSequence mName = null;
    final java.lang.String mOwnerPackageName = null;
    final java.lang.String mClientPackageName = null;
    final java.lang.String mProviderId = null;
    final java.util.List<java.lang.String> mSelectedRoutes = null;
    final java.util.List<java.lang.String> mSelectableRoutes = null;
    final java.util.List<java.lang.String> mDeselectableRoutes = null;
    final java.util.List<java.lang.String> mTransferableRoutes = null;
    final int mVolumeHandling = 0;
    final int mVolumeMax = 0;
    final int mVolume = 0;
    final android.os.Bundle mControlHints = null;
    final boolean mIsSystemSession = false;
    RoutingSessionInfo(android.media.RoutingSessionInfo.Builder p0) {}
    RoutingSessionInfo(android.os.Parcel p0) {}
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.lang.String getOriginalId() { return null; }
    public java.lang.String getOwnerPackageName() { return null; }
    public java.lang.String getClientPackageName() { return null; }
    public java.lang.String getProviderId() { return null; }
    public java.util.List<java.lang.String> getSelectedRoutes() { return null; }
    public java.util.List<java.lang.String> getSelectableRoutes() { return null; }
    public java.util.List<java.lang.String> getDeselectableRoutes() { return null; }
    public java.util.List<java.lang.String> getTransferableRoutes() { return null; }
    public int getVolumeHandling() { return 0; }
    public int getVolumeMax() { return 0; }
    public int getVolume() { return 0; }
    public android.os.Bundle getControlHints() { return null; }
    public boolean isSystemSession() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        final java.lang.String mId = null;
        java.lang.CharSequence mName;
        java.lang.String mOwnerPackageName;
        java.lang.String mClientPackageName;
        java.lang.String mProviderId;
        final java.util.List<java.lang.String> mSelectedRoutes = null;
        final java.util.List<java.lang.String> mSelectableRoutes = null;
        final java.util.List<java.lang.String> mDeselectableRoutes = null;
        final java.util.List<java.lang.String> mTransferableRoutes = null;
        int mVolumeHandling;
        int mVolumeMax;
        int mVolume;
        android.os.Bundle mControlHints;
        boolean mIsSystemSession;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public Builder(android.media.RoutingSessionInfo p0) {}
        public android.media.RoutingSessionInfo.Builder setName(java.lang.CharSequence p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setOwnerPackageName(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setClientPackageName(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setProviderId(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder clearSelectedRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder addSelectedRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder removeSelectedRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder clearSelectableRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder addSelectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder removeSelectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder clearDeselectableRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder addDeselectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder removeDeselectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder clearTransferableRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder addTransferableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder removeTransferableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setVolumeHandling(int p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setVolumeMax(int p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setVolume(int p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setControlHints(android.os.Bundle p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setSystemSession(boolean p0) { return null; }
        public android.media.RoutingSessionInfo build() { return null; }
    }
}
