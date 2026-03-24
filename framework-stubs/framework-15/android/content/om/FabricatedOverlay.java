package android.content.om;

public class FabricatedOverlay {
    final android.os.FabricatedOverlayInternal mOverlay = null;
    @android.annotation.NonNull
    public android.content.om.OverlayIdentifier getIdentifier() { return null; }
    public FabricatedOverlay(java.lang.String p0, java.lang.String p1) {}
    public void setOwningPackage(java.lang.String p0) {}
    public void setTargetOverlayable(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getTargetOverlayable() { return null; }
    @android.annotation.NonNull
    public void setResourceValue(java.lang.String p0, int p1, int p2, java.lang.String p3) {}
    @android.annotation.NonNull
    public void setResourceValue(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.NonNull
    public void setResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) {}
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.content.res.nine_patch_frro")
    public void setNinePatchResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) {}
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.content.res.asset_file_descriptor_frro")
    public void setResourceValue(java.lang.String p0, android.content.res.AssetFileDescriptor p1, java.lang.String p2) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay.Builder setTargetOverlayable(java.lang.String p0) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, int p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, int p2, java.lang.String p3) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, java.lang.String p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, android.content.res.AssetFileDescriptor p1, java.lang.String p2) { return null; }
        @android.annotation.NonNull
        public android.content.om.FabricatedOverlay build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringTypeOverlayResource {
    }
}
