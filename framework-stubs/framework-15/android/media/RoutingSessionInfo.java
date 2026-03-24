package android.media;

public final class RoutingSessionInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.RoutingSessionInfo> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public static final int TRANSFER_REASON_FALLBACK = 0;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public static final int TRANSFER_REASON_SYSTEM_REQUEST = 1;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public static final int TRANSFER_REASON_APP = 2;
    @android.annotation.NonNull
    final java.lang.String mId = null;
    @android.annotation.Nullable
    final java.lang.CharSequence mName = null;
    @android.annotation.Nullable
    final java.lang.String mOwnerPackageName = null;
    @android.annotation.NonNull
    final java.lang.String mClientPackageName = null;
    @android.annotation.Nullable
    final java.lang.String mProviderId = null;
    @android.annotation.NonNull
    final java.util.List<java.lang.String> mSelectedRoutes = null;
    @android.annotation.NonNull
    final java.util.List<java.lang.String> mSelectableRoutes = null;
    @android.annotation.NonNull
    final java.util.List<java.lang.String> mDeselectableRoutes = null;
    @android.annotation.NonNull
    final java.util.List<java.lang.String> mTransferableRoutes = null;
    final int mVolumeHandling = 0;
    final int mVolumeMax = 0;
    final int mVolume = 0;
    @android.annotation.Nullable
    final android.os.Bundle mControlHints = null;
    final boolean mIsSystemSession = false;
    final int mTransferReason = 0;
    @android.annotation.Nullable
    final android.os.UserHandle mTransferInitiatorUserHandle = null;
    @android.annotation.Nullable
    final java.lang.String mTransferInitiatorPackageName = null;
    RoutingSessionInfo(android.media.RoutingSessionInfo.Builder p0) {}
    RoutingSessionInfo(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getOriginalId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getOwnerPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getClientPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getProviderId() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSelectedRoutes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSelectableRoutes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getDeselectableRoutes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getTransferableRoutes() { return null; }
    public int getVolumeHandling() { return 0; }
    public int getVolumeMax() { return 0; }
    public int getVolume() { return 0; }
    @android.annotation.Nullable
    public android.os.Bundle getControlHints() { return null; }
    @android.annotation.Nullable
    public boolean isSystemSession() { return false; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public int getTransferReason() { return 0; }
    @android.annotation.Nullable
    public android.os.UserHandle getTransferInitiatorUserHandle() { return null; }
    @android.annotation.Nullable
    public java.lang.String getTransferInitiatorPackageName() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public Builder(android.media.RoutingSessionInfo p0) {}
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setName(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setOwnerPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setClientPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setProviderId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder clearSelectedRoutes() { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder addSelectedRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder removeSelectedRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder clearSelectableRoutes() { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder addSelectableRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder removeSelectableRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder clearDeselectableRoutes() { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder addDeselectableRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder removeDeselectableRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder clearTransferableRoutes() { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder addTransferableRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder removeTransferableRoute(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setVolumeHandling(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setVolumeMax(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setVolume(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setControlHints(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo.Builder setSystemSession(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
        public android.media.RoutingSessionInfo.Builder setTransferReason(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
        public android.media.RoutingSessionInfo.Builder setTransferInitiator(android.os.UserHandle p0, java.lang.String p1) { return null; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransferReason {
    }
}
