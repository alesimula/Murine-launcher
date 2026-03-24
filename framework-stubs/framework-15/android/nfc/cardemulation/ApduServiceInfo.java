package android.nfc.cardemulation;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
public final class ApduServiceInfo implements android.os.Parcelable {
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.ApduServiceInfo> CREATOR = null;
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p3, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p4, boolean p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10) {}
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p3, java.util.ArrayList<android.nfc.cardemulation.AidGroup> p4, boolean p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, boolean p11) {}
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.nfc.cardemulation.AidGroup> p3, java.util.List<android.nfc.cardemulation.AidGroup> p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, boolean p12) {}
    public ApduServiceInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.nfc.cardemulation.AidGroup> p3, java.util.List<android.nfc.cardemulation.AidGroup> p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, boolean p12, java.util.Map<java.lang.String, java.lang.Boolean> p13, java.util.Map<java.util.regex.Pattern, java.lang.Boolean> p14) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public ApduServiceInfo(android.content.pm.PackageManager p0, android.content.pm.ResolveInfo p1, boolean p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public android.content.ComponentName getComponent() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.Nullable
    public java.lang.String getOffHostSecureElement() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAids() { return null; }
    @android.annotation.FlaggedApi("android.nfc.nfc_read_polling_loop")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPollingLoopFilters() { return null; }
    @android.annotation.FlaggedApi("android.nfc.nfc_read_polling_loop")
    public boolean getShouldAutoTransact(java.lang.String p0) { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_read_polling_loop")
    @android.annotation.NonNull
    public java.util.List<java.util.regex.Pattern> getPollingLoopPatternFilters() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPrefixAids() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSubsetAids() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public android.nfc.cardemulation.AidGroup getDynamicAidGroupForCategory(java.lang.String p0) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public boolean removeDynamicAidGroupForCategory(java.lang.String p0) { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.util.List<android.nfc.cardemulation.AidGroup> getAidGroups() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.lang.String getCategoryForAid(java.lang.String p0) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public boolean hasCategory(java.lang.String p0) { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public boolean isOnHost() { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public boolean requiresUnlock() { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public boolean requiresScreenOn() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_observe_mode")
    public boolean shouldDefaultToObserveMode() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_observe_mode")
    public void setShouldDefaultToObserveMode(boolean p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.lang.String getDescription() { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public int getUid() { return 0; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void setDynamicAidGroup(android.nfc.cardemulation.AidGroup p0) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_read_polling_loop")
    public void addPollingLoopFilter(java.lang.String p0, boolean p1) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_read_polling_loop")
    public void removePollingLoopFilter(java.lang.String p0) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_read_polling_loop")
    public void addPollingLoopPatternFilter(java.lang.String p0, boolean p1) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_read_polling_loop")
    public void removePollingLoopPatternFilter(java.lang.String p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void setOffHostSecureElement(java.lang.String p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void resetOffHostSecureElement() {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.lang.CharSequence loadAppLabel(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public android.graphics.drawable.Drawable loadBanner(android.content.pm.PackageManager p0) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.lang.String getSettingsActivityName() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void dump(android.os.ParcelFileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void setCategoryOtherServiceEnabled(boolean p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public boolean isCategoryOtherServiceEnabled() { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
}
