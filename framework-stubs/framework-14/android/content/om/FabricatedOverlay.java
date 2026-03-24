package android.content.om;

public class FabricatedOverlay {
    final android.os.FabricatedOverlayInternal mOverlay = null;
    public android.content.om.OverlayIdentifier getIdentifier() { return null; }
    public FabricatedOverlay(java.lang.String p0, java.lang.String p1) {}
    public void setTargetOverlayable(java.lang.String p0) {}
    public java.lang.String getTargetOverlayable() { return null; }
    public void setResourceValue(java.lang.String p0, int p1, int p2, java.lang.String p3) {}
    public void setResourceValue(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public void setResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public android.content.om.FabricatedOverlay.Builder setTargetOverlayable(java.lang.String p0) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, int p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, int p2, java.lang.String p3) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, java.lang.String p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) { return null; }
        public android.content.om.FabricatedOverlay build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringTypeOverlayResource {
    }
}
