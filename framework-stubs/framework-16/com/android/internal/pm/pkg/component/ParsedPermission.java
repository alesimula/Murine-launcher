package com.android.internal.pm.pkg.component;

public interface ParsedPermission extends com.android.internal.pm.pkg.component.ParsedComponent {
    @android.annotation.Nullable
    public java.lang.String getBackgroundPermission();
    @android.annotation.Nullable
    public java.lang.String getGroup();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKnownCerts();
    @android.annotation.Nullable
    public com.android.internal.pm.pkg.component.ParsedPermissionGroup getParsedPermissionGroup();
    public int getProtectionLevel();
    public int getRequestRes();
    public boolean isPurposeRequired();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getValidPurposes();
    public boolean isTree();
}
