package com.android.internal.content.om;

public class OverlayManagerImpl {
    public static final java.lang.String SELF_TARGET = ".self_target";
    public OverlayManagerImpl(android.content.Context p0) {}
    public void ensureBaseDir() {}
    public static java.lang.String checkOverlayNameValid(java.lang.String p0) { return null; }
    public void registerFabricatedOverlay(android.os.FabricatedOverlayInternal p0) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {}
    public void unregisterFabricatedOverlay(java.lang.String p0) {}
    public void commit(android.content.om.OverlayManagerTransaction p0) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {}
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0) { return null; }
}
