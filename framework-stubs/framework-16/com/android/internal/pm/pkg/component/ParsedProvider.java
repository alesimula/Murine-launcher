package com.android.internal.pm.pkg.component;

public interface ParsedProvider extends com.android.internal.pm.pkg.component.ParsedMainComponent {
    @android.annotation.Nullable
    public java.lang.String getAuthority();
    public int getInitOrder();
    public boolean isMultiProcess();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PathPermission> getPathPermissions();
    @android.annotation.Nullable
    public java.lang.String getReadPermission();
    @android.processor.immutability.Immutable.Ignore
    @android.annotation.NonNull
    public java.util.List<android.os.PatternMatcher> getUriPermissionPatterns();
    @android.annotation.Nullable
    public java.lang.String getWritePermission();
    public boolean isForceUriPermissions();
    public boolean isGrantUriPermissions();
    public boolean isSyncable();
}
