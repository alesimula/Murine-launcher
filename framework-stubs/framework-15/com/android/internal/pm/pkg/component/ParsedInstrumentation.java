package com.android.internal.pm.pkg.component;

public interface ParsedInstrumentation extends com.android.internal.pm.pkg.component.ParsedComponent {
    @android.annotation.Nullable
    public java.lang.String getTargetPackage();
    @android.annotation.Nullable
    public java.lang.String getTargetProcesses();
    public boolean isFunctionalTest();
    public boolean isHandleProfiling();
}
