package com.android.internal.pm.pkg.component;

public interface ParsedActivity extends com.android.internal.pm.pkg.component.ParsedMainComponent {
    public int getColorMode();
    public int getConfigChanges();
    public int getDocumentLaunchMode();
    public int getLaunchMode();
    public int getLockTaskLaunchMode();
    public int getMaxRecents();
    public float getMaxAspectRatio();
    public float getMinAspectRatio();
    @android.annotation.Nullable
    public java.lang.String getParentActivityName();
    @android.annotation.Nullable
    public java.lang.String getPermission();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts();
    public int getPersistableMode();
    public int getPrivateFlags();
    @android.annotation.Nullable
    public java.lang.String getRequestedVrComponent();
    public int getRotationAnimation();
    public int getResizeMode();
    public int getScreenOrientation();
    public int getSoftInputMode();
    @android.annotation.Nullable
    public java.lang.String getTargetActivity();
    @android.annotation.Nullable
    public java.lang.String getTaskAffinity();
    public int getTheme();
    public int getUiOptions();
    @android.annotation.Nullable
    public android.content.pm.ActivityInfo.WindowLayout getWindowLayout();
    public boolean isSupportsSizeChanges();
    @android.annotation.Nullable
    public java.lang.String getRequiredDisplayCategory();
    public int getRequireContentUriPermissionFromCaller();
}
