package android.content.om;

public class OverlayManagerTransaction implements java.lang.Iterable<android.content.om.OverlayManagerTransaction.Request>, android.os.Parcelable {
    private final java.util.List<android.content.om.OverlayManagerTransaction.Request> mRequests = null;
    public static final android.os.Parcelable.Creator<android.content.om.OverlayManagerTransaction> CREATOR = null;
    OverlayManagerTransaction(java.util.List<android.content.om.OverlayManagerTransaction.Request> p0) {}
    private OverlayManagerTransaction(android.os.Parcel p0) {}
    public java.util.Iterator<android.content.om.OverlayManagerTransaction.Request> iterator() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private final java.util.List<android.content.om.OverlayManagerTransaction.Request> mRequests = null;
        public Builder() {}
        public android.content.om.OverlayManagerTransaction.Builder setEnabled(android.content.om.OverlayIdentifier p0, boolean p1) { return null; }
        public android.content.om.OverlayManagerTransaction.Builder setEnabled(android.content.om.OverlayIdentifier p0, boolean p1, int p2) { return null; }
        public android.content.om.OverlayManagerTransaction.Builder registerFabricatedOverlay(android.content.om.FabricatedOverlay p0) { return null; }
        public android.content.om.OverlayManagerTransaction.Builder unregisterFabricatedOverlay(android.content.om.OverlayIdentifier p0) { return null; }
        public android.content.om.OverlayManagerTransaction build() { return null; }
    }

    public static class Request {
        public static final int TYPE_SET_ENABLED = 0;
        public static final int TYPE_SET_DISABLED = 1;
        public static final int TYPE_REGISTER_FABRICATED = 2;
        public static final int TYPE_UNREGISTER_FABRICATED = 3;
        public static final java.lang.String BUNDLE_FABRICATED_OVERLAY = "fabricated_overlay";
        public final int type = 0;
        public final android.content.om.OverlayIdentifier overlay = null;
        public final int userId = 0;
        public final android.os.Bundle extras = null;
        public Request(int p0, android.content.om.OverlayIdentifier p1, int p2) {}
        public Request(int p0, android.content.om.OverlayIdentifier p1, int p2, android.os.Bundle p3) {}
        public java.lang.String toString() { return null; }
        public java.lang.String typeToString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface RequestType {
        }
    }
}
