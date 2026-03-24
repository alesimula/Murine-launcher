package com.android.internal.pm.pkg.component;

public interface ParsedUsesPermission {
    public static final int FLAG_NEVER_FOR_LOCATION = 65536;
    @android.annotation.NonNull
    public java.lang.String getName();
    public int getUsesPermissionFlags();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getPurposes();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsesPermissionFlags {
    }
}
