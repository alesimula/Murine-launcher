package android.content.om;

public final class OverlayInfo implements android.content.om.CriticalOverlayInfo, android.os.Parcelable {
    public static final int STATE_UNKNOWN = -1;
    public static final int STATE_MISSING_TARGET = 0;
    public static final int STATE_NO_IDMAP = 1;
    public static final int STATE_DISABLED = 2;
    public static final int STATE_ENABLED = 3;
    @java.lang.Deprecated
    public static final int STATE_TARGET_IS_BEING_REPLACED = 4;
    public static final int STATE_OVERLAY_IS_BEING_REPLACED = 5;
    @java.lang.Deprecated
    public static final int STATE_ENABLED_IMMUTABLE = 6;
    public static final int STATE_SYSTEM_UPDATE_UNINSTALL = 7;
    public static final java.lang.String CATEGORY_THEME = "android.theme";
    @android.annotation.NonNull
    public final java.lang.String packageName = null;
    @android.annotation.Nullable
    public final java.lang.String overlayName = null;
    @android.annotation.NonNull
    public final java.lang.String targetPackageName = null;
    @android.annotation.Nullable
    public final java.lang.String targetOverlayableName = null;
    @android.annotation.Nullable
    public final java.lang.String category = null;
    @android.annotation.NonNull
    public final java.lang.String baseCodePath = null;
    public final int state = 0;
    public final int userId = 0;
    public final int priority = 0;
    public final boolean isMutable = false;
    public final boolean isFabricated = false;
    @android.annotation.NonNull
    public final java.util.List<android.content.om.OverlayConstraint> constraints = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.om.OverlayInfo> CREATOR = null;
    public OverlayInfo(android.content.om.OverlayInfo p0, int p1) {}
    public OverlayInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, int p6, int p7, boolean p8) {}
    public OverlayInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8, boolean p9, boolean p10) {}
    public OverlayInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8, boolean p9, boolean p10, java.util.List<android.content.om.OverlayConstraint> p11) {}
    public OverlayInfo(android.os.Parcel p0) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getOverlayName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getTargetPackageName() { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public java.lang.String getCategory() { return null; }
    @android.annotation.SystemApi
    public int getUserId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getTargetOverlayableName() { return null; }
    public boolean isFabricated() { return false; }
    @android.annotation.NonNull
    public java.lang.String getBaseCodePath() { return null; }
    @android.annotation.NonNull
    public android.content.om.OverlayIdentifier getOverlayIdentifier() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.om.OverlayConstraint> getConstraints() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SystemApi
    public boolean isEnabled() { return false; }
    public static java.lang.String stateToString(int p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
