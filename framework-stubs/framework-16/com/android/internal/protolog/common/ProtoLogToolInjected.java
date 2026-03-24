package com.android.internal.protolog.common;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER})
public @interface ProtoLogToolInjected {
    public com.android.internal.protolog.common.ProtoLogToolInjected.Value value();

    public static enum Value {
        VIEWER_CONFIG_PATH,
        LOG_GROUPS,
        CACHE_UPDATER;
    }
}
