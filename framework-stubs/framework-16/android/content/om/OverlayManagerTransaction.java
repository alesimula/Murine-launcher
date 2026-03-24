package android.content.om;

public final class OverlayManagerTransaction implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.om.OverlayManagerTransaction> CREATOR = null;
    @android.annotation.NonNull
    public static android.content.om.OverlayManagerTransaction newInstance() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.SYSTEM_SERVER)
    @android.annotation.SuppressLint("ReferencesHidden")
    @android.annotation.NonNull
    public java.util.Iterator<android.content.om.OverlayManagerTransaction.Request> getRequests() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public void registerFabricatedOverlay(android.content.om.FabricatedOverlay p0) {}
    @android.annotation.NonNull
    public void unregisterFabricatedOverlay(android.content.om.OverlayIdentifier p0) {}
    boolean isSelfTargeting() { return false; }

    public static final class Builder {
        public Builder() {}
        public android.content.om.OverlayManagerTransaction.Builder setEnabled(android.content.om.OverlayIdentifier p0, boolean p1) { return null; }
        public android.content.om.OverlayManagerTransaction.Builder setEnabled(android.content.om.OverlayIdentifier p0, boolean p1, java.util.List<android.content.om.OverlayConstraint> p2) { return null; }
        public android.content.om.OverlayManagerTransaction.Builder setEnabled(android.content.om.OverlayIdentifier p0, boolean p1, int p2) { return null; }
        public android.content.om.OverlayManagerTransaction.Builder setEnabled(android.content.om.OverlayIdentifier p0, boolean p1, int p2, java.util.List<android.content.om.OverlayConstraint> p3) { return null; }
        public android.content.om.OverlayManagerTransaction.Builder setSelfTargeting(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.om.OverlayManagerTransaction.Builder registerFabricatedOverlay(android.content.om.FabricatedOverlay p0) { return null; }
        @android.annotation.NonNull
        public android.content.om.OverlayManagerTransaction.Builder unregisterFabricatedOverlay(android.content.om.OverlayIdentifier p0) { return null; }
        @android.annotation.NonNull
        public android.content.om.OverlayManagerTransaction build() { return null; }
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.SYSTEM_SERVER)
    public static final class Request {
        public static final int TYPE_SET_ENABLED = 0;
        public static final int TYPE_SET_DISABLED = 1;
        public static final int TYPE_REGISTER_FABRICATED = 2;
        public static final int TYPE_UNREGISTER_FABRICATED = 3;
        public static final java.lang.String BUNDLE_FABRICATED_OVERLAY = "fabricated_overlay";
        public final int type = 0;
        @android.annotation.NonNull
        public final android.content.om.OverlayIdentifier overlay = null;
        public final int userId = 0;
        @android.annotation.SuppressLint("NullableCollection")
        @android.annotation.Nullable
        public final android.os.Bundle extras = null;
        @android.annotation.NonNull
        public final java.util.List<android.content.om.OverlayConstraint> constraints = null;
        public Request(int p0, android.content.om.OverlayIdentifier p1, int p2) {}
        public Request(int p0, android.content.om.OverlayIdentifier p1, int p2, android.os.Bundle p3) {}
        public Request(int p0, android.content.om.OverlayIdentifier p1, int p2, java.util.List<android.content.om.OverlayConstraint> p3) {}
        public Request(int p0, android.content.om.OverlayIdentifier p1, int p2, android.os.Bundle p3, java.util.List<android.content.om.OverlayConstraint> p4) {}
        public java.lang.String toString() { return null; }
        public java.lang.String typeToString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface RequestType {
        }
    }
}
