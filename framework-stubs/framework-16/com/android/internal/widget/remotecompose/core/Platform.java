package com.android.internal.widget.remotecompose.core;

public interface Platform {
    public static final com.android.internal.widget.remotecompose.core.Platform None = null;
    @android.annotation.Nullable
    public byte[] imageToByteArray(java.lang.Object p0);
    public int getImageWidth(java.lang.Object p0);
    public int getImageHeight(java.lang.Object p0);
    public boolean isAlpha8Image(java.lang.Object p0);
    @android.annotation.Nullable
    public float[] pathToFloatArray(java.lang.Object p0);
    public void log(com.android.internal.widget.remotecompose.core.Platform.LogCategory p0, java.lang.String p1);

    public static interface ComputedTextLayout {
        public float getWidth();
        public float getHeight();
    }

    public static enum LogCategory {
        DEBUG,
        INFO,
        WARN,
        ERROR,
        TODO;
    }
}
