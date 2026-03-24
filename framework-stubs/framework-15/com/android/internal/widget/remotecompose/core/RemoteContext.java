package com.android.internal.widget.remotecompose.core;

public abstract class RemoteContext {
    protected com.android.internal.widget.remotecompose.core.CoreDocument mDocument;
    public com.android.internal.widget.remotecompose.core.RemoteComposeState mRemoteComposeState;
    long mStart;
    protected com.android.internal.widget.remotecompose.core.PaintContext mPaintContext;
    com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode mMode;
    boolean mDebug;
    public float mWidth;
    public float mHeight;
    public static final int ID_CONTINUOUS_SEC = 1;
    public static final int ID_TIME_IN_SEC = 2;
    public static final int ID_TIME_IN_MIN = 3;
    public static final int ID_TIME_IN_HR = 4;
    public static final int ID_WINDOW_WIDTH = 5;
    public static final int ID_WINDOW_HEIGHT = 6;
    public static final int ID_COMPONENT_WIDTH = 7;
    public static final int ID_COMPONENT_HEIGHT = 8;
    public static final int ID_CALENDAR_MONTH = 9;
    public static final float FLOAT_CONTINUOUS_SEC = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_SEC = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_MIN = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_HR = Float.valueOf(0.0f);
    public static final float FLOAT_CALENDAR_MONTH = Float.valueOf(0.0f);
    public static final float FLOAT_WINDOW_WIDTH = Float.valueOf(0.0f);
    public static final float FLOAT_WINDOW_HEIGHT = Float.valueOf(0.0f);
    public static final float FLOAT_COMPONENT_WIDTH = Float.valueOf(0.0f);
    public static final float FLOAT_COMPONENT_HEIGHT = Float.valueOf(0.0f);
    public RemoteContext() {}
    public abstract void loadPathData(int p0, float[] p1);
    public abstract void loadVariableName(java.lang.String p0, int p1, int p2);
    public abstract void loadColor(int p0, int p1);
    public float getAnimationTime() { return 0.0f; }
    public int getTheme() { return 0; }
    public void setTheme(int p0) {}
    public com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode getMode() { return null; }
    public void setMode(com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode p0) {}
    public com.android.internal.widget.remotecompose.core.PaintContext getPaintContext() { return null; }
    public void setPaintContext(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public com.android.internal.widget.remotecompose.core.CoreDocument getDocument() { return null; }
    public boolean isDebug() { return false; }
    public void setDebug(boolean p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public void header(int p0, int p1, int p2, int p3, int p4, long p5) {}
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void setDocumentContentDescription(int p0) {}
    public abstract void loadBitmap(int p0, int p1, int p2, byte[] p3);
    public abstract void loadText(int p0, java.lang.String p1);
    public abstract java.lang.String getText(int p0);
    public abstract void loadFloat(int p0, float p1);
    public abstract void loadAnimatedFloat(int p0, com.android.internal.widget.remotecompose.core.operations.FloatExpression p1);
    public abstract void loadShader(int p0, com.android.internal.widget.remotecompose.core.operations.ShaderData p1);
    public abstract float getFloat(int p0);
    public abstract int getColor(int p0);
    public abstract void listensTo(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1);
    public abstract int updateOps();
    public abstract com.android.internal.widget.remotecompose.core.operations.ShaderData getShader(int p0);
    public abstract void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6);

    public static enum ContextMode {
        UNSET,
        DATA,
        PAINT;
    }
}
