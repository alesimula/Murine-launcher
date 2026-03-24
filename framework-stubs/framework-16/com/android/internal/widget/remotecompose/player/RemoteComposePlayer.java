package com.android.internal.widget.remotecompose.player;

public class RemoteComposePlayer extends android.widget.FrameLayout implements com.android.internal.widget.remotecompose.core.RemoteContextAware {
    android.hardware.SensorManager mSensorManager;
    android.hardware.Sensor mAcc;
    android.hardware.Sensor mGyro;
    android.hardware.Sensor mMag;
    android.hardware.Sensor mLight;
    android.hardware.SensorEventListener mListener;
    public RemoteComposePlayer(android.content.Context p0) { super((android.content.Context)null); }
    public RemoteComposePlayer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RemoteComposePlayer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public com.android.internal.widget.remotecompose.core.RemoteContext getRemoteContext() { return null; }
    public void requestLayout() {}
    public void invalidate() {}
    public boolean isDraggable() { return false; }
    public void setDebug(int p0) {}
    public com.android.internal.widget.remotecompose.player.RemoteComposeDocument getDocument() { return null; }
    public void updateDocument(com.android.internal.widget.remotecompose.player.RemoteComposeDocument p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.player.RemoteComposeDocument p0) {}
    public void setLocalString(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void clearLocalString(java.lang.String p0, java.lang.String p1) {}
    public void setUserLocalString(java.lang.String p0, java.lang.String p1) {}
    public void setUserLocalInt(java.lang.String p0, int p1) {}
    public void setUserLocalColor(java.lang.String p0, int p1) {}
    public void setUserLocalFloat(java.lang.String p0, float p1) {}
    public void setUserLocalBitmap(java.lang.String p0, android.graphics.Bitmap p1) {}
    public void clearUserLocalBitmap(java.lang.String p0) {}
    public void clearUserLocalString(java.lang.String p0) {}
    public void clearUserLocalInt(java.lang.String p0) {}
    public void clearUserLocalColor(java.lang.String p0) {}
    public void clearUserLocalFloat(java.lang.String p0) {}
    public void setSystemLocalString(java.lang.String p0, java.lang.String p1) {}
    public void clearSystemLocalString(java.lang.String p0) {}
    public int getOpsPerFrame() { return 0; }
    public void setUseChoreographer(boolean p0) {}
    public void addIdActionListener(com.android.internal.widget.remotecompose.player.RemoteComposePlayer.IdActionCallbacks p0) {}
    public void setTheme(int p0) {}
    public java.lang.String[] getNamedColors() { return null; }
    public java.lang.String[] getNamedFloats() { return null; }
    public java.lang.String[] getNamedStrings() { return null; }
    public java.lang.String[] getNamedImages() { return null; }
    public void setColor(java.lang.String p0, int p1) {}
    public void setLong(java.lang.String p0, long p1) {}
    protected void onDetachedFromWindow() {}
    public void registerListener() {}
    public void unregisterListener() {}
    public float getEvalTime() { return 0.0f; }
    public void setShaderControl(com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl p0) {}

    public static interface IdActionCallbacks {
        public void onAction(int p0, java.lang.String p1);
    }
}
