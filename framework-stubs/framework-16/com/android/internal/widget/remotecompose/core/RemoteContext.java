package com.android.internal.widget.remotecompose.core;

public abstract class RemoteContext {
    @android.annotation.NonNull
    protected com.android.internal.widget.remotecompose.core.CoreDocument mDocument;
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.RemoteComposeState mRemoteComposeState;
    @android.annotation.Nullable
    protected com.android.internal.widget.remotecompose.core.PaintContext mPaintContext;
    protected float mDensity;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode mMode;
    int mDebug;
    public float mWidth;
    public float mHeight;
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.Component mLastComponent;
    public long currentTime;
    public static final int ID_CONTINUOUS_SEC = 1;
    public static final int ID_TIME_IN_SEC = 2;
    public static final int ID_TIME_IN_MIN = 3;
    public static final int ID_TIME_IN_HR = 4;
    public static final int ID_WINDOW_WIDTH = 5;
    public static final int ID_WINDOW_HEIGHT = 6;
    public static final int ID_COMPONENT_WIDTH = 7;
    public static final int ID_COMPONENT_HEIGHT = 8;
    public static final int ID_CALENDAR_MONTH = 9;
    public static final int ID_OFFSET_TO_UTC = 10;
    public static final int ID_WEEK_DAY = 11;
    public static final int ID_DAY_OF_MONTH = 12;
    public static final int ID_TOUCH_POS_X = 13;
    public static final int ID_TOUCH_POS_Y = 14;
    public static final int ID_TOUCH_VEL_X = 15;
    public static final int ID_TOUCH_VEL_Y = 16;
    public static final int ID_ACCELERATION_X = 17;
    public static final int ID_ACCELERATION_Y = 18;
    public static final int ID_ACCELERATION_Z = 19;
    public static final int ID_GYRO_ROT_X = 20;
    public static final int ID_GYRO_ROT_Y = 21;
    public static final int ID_GYRO_ROT_Z = 22;
    public static final int ID_MAGNETIC_X = 23;
    public static final int ID_MAGNETIC_Y = 24;
    public static final int ID_MAGNETIC_Z = 25;
    public static final int ID_LIGHT = 26;
    public static final int ID_DENSITY = 27;
    public static final int ID_API_LEVEL = 28;
    public static final int ID_TOUCH_EVENT_TIME = 29;
    public static final int ID_ANIMATION_TIME = 30;
    public static final int ID_ANIMATION_DELTA_TIME = 31;
    public static final int ID_EPOCH_SECOND = 32;
    public static final int ID_FONT_SIZE = 33;
    public static final float FLOAT_DENSITY = Float.valueOf(0.0f);
    public static final float FLOAT_CONTINUOUS_SEC = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_SEC = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_MIN = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_HR = Float.valueOf(0.0f);
    public static final float FLOAT_CALENDAR_MONTH = Float.valueOf(0.0f);
    public static final float FLOAT_WEEK_DAY = Float.valueOf(0.0f);
    public static final float FLOAT_DAY_OF_MONTH = Float.valueOf(0.0f);
    public static final float FLOAT_WINDOW_WIDTH = Float.valueOf(0.0f);
    public static final float FLOAT_WINDOW_HEIGHT = Float.valueOf(0.0f);
    public static final float FLOAT_COMPONENT_WIDTH = Float.valueOf(0.0f);
    public static final float FLOAT_COMPONENT_HEIGHT = Float.valueOf(0.0f);
    public static final float FLOAT_OFFSET_TO_UTC = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_POS_X = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_POS_Y = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_VEL_X = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_VEL_Y = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_EVENT_TIME = Float.valueOf(0.0f);
    public static final float FLOAT_ANIMATION_TIME = Float.valueOf(0.0f);
    public static final float FLOAT_ANIMATION_DELTA_TIME = Float.valueOf(0.0f);
    public static final float FLOAT_ACCELERATION_X = Float.valueOf(0.0f);
    public static final float FLOAT_ACCELERATION_Y = Float.valueOf(0.0f);
    public static final float FLOAT_ACCELERATION_Z = Float.valueOf(0.0f);
    public static final float FLOAT_GYRO_ROT_X = Float.valueOf(0.0f);
    public static final float FLOAT_GYRO_ROT_Y = Float.valueOf(0.0f);
    public static final float FLOAT_GYRO_ROT_Z = Float.valueOf(0.0f);
    public static final float FLOAT_MAGNETIC_X = Float.valueOf(0.0f);
    public static final float FLOAT_MAGNETIC_Y = Float.valueOf(0.0f);
    public static final float FLOAT_MAGNETIC_Z = Float.valueOf(0.0f);
    public static final float FLOAT_LIGHT = Float.valueOf(0.0f);
    public static final float FLOAT_API_LEVEL = Float.valueOf(0.0f);
    public static final float FLOAT_FONT_SIZE = Float.valueOf(0.0f);
    public static final long INT_EPOCH_SECOND = 4294967328L;
    public RemoteContext() {}
    public boolean supportsVersion(int p0, int p1, int p2) { return false; }
    public float getDensity() { return 0.0f; }
    public void setDensity(float p0) {}
    public long getDocLoadTime() { return 0L; }
    public void setDocLoadTime() {}
    public boolean isAnimationEnabled() { return false; }
    public void setAnimationEnabled(boolean p0) {}
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess getCollectionsAccess() { return null; }
    public abstract void loadPathData(int p0, float[] p1);
    @android.annotation.Nullable
    public abstract float[] getPathData(int p0);
    public abstract void loadVariableName(java.lang.String p0, int p1, int p2);
    public abstract void loadColor(int p0, int p1);
    public void setAnimationTime(float p0) {}
    public float getAnimationTime() { return 0.0f; }
    public abstract void setNamedColorOverride(java.lang.String p0, int p1);
    public abstract void setNamedStringOverride(java.lang.String p0, java.lang.String p1);
    public abstract void clearNamedStringOverride(java.lang.String p0);
    public abstract void setNamedIntegerOverride(java.lang.String p0, int p1);
    public abstract void clearNamedIntegerOverride(java.lang.String p0);
    public abstract void setNamedFloatOverride(java.lang.String p0, float p1);
    public abstract void clearNamedFloatOverride(java.lang.String p0);
    public abstract void setNamedLong(java.lang.String p0, long p1);
    public abstract void setNamedDataOverride(java.lang.String p0, java.lang.Object p1);
    public abstract void clearNamedDataOverride(java.lang.String p0);
    public abstract void addCollection(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess p1);
    public abstract void putDataMap(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.DataMap p1);
    @android.annotation.Nullable
    public abstract com.android.internal.widget.remotecompose.core.operations.utilities.DataMap getDataMap(int p0);
    public abstract void runAction(int p0, java.lang.String p1);
    public abstract void runNamedAction(int p0, java.lang.Object p1);
    public abstract void putObject(int p0, java.lang.Object p1);
    @android.annotation.Nullable
    public abstract java.lang.Object getObject(int p0);
    public void addTouchListener(com.android.internal.widget.remotecompose.core.TouchListener p0) {}
    public abstract void hapticEffect(int p0);
    public void needsRepaint() {}
    public boolean useChoreographer() { return false; }
    public void setUseChoreographer(boolean p0) {}
    public int getTheme() { return 0; }
    public void setTheme(int p0) {}
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode getMode() { return null; }
    public void setMode(com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode p0) {}
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.PaintContext getPaintContext() { return null; }
    public void setPaintContext(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.CoreDocument getDocument() { return null; }
    public boolean isDebug() { return false; }
    public boolean isVisualDebug() { return false; }
    public void setDebug(int p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public void header(int p0, int p1, int p2, int p3, int p4, long p5, com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> p6) {}
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void setDocumentContentDescription(int p0) {}
    public abstract void loadBitmap(int p0, short p1, short p2, int p3, int p4, byte[] p5);
    public abstract void loadText(int p0, java.lang.String p1);
    @android.annotation.Nullable
    public abstract java.lang.String getText(int p0);
    public abstract void loadFloat(int p0, float p1);
    public abstract void overrideFloat(int p0, float p1);
    public abstract void loadInteger(int p0, int p1);
    public abstract void overrideInteger(int p0, int p1);
    public abstract void overrideText(int p0, int p1);
    public abstract void loadAnimatedFloat(int p0, com.android.internal.widget.remotecompose.core.operations.FloatExpression p1);
    public abstract void loadShader(int p0, com.android.internal.widget.remotecompose.core.operations.ShaderData p1);
    public abstract float getFloat(int p0);
    public abstract int getInteger(int p0);
    public abstract long getLong(int p0);
    public abstract int getColor(int p0);
    public abstract void listensTo(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1);
    public abstract int updateOps();
    @android.annotation.Nullable
    public abstract com.android.internal.widget.remotecompose.core.operations.ShaderData getShader(int p0);
    public static boolean isTime(float p0) { return false; }
    public static float getTime(float p0) { return 0.0f; }
    public abstract void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6);
    public void incrementOpCount() {}
    public int getLastOpCount() { return 0; }
    public void clearLastOpCount() {}

    public static enum ContextMode {
        UNSET,
        DATA,
        PAINT;
    }
}
