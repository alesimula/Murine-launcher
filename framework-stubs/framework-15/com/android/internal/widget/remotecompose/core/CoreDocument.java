package com.android.internal.widget.remotecompose.core;

public class CoreDocument {
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mOperations;
    com.android.internal.widget.remotecompose.core.RemoteComposeState mRemoteComposeState;
    com.android.internal.widget.remotecompose.core.TimeVariables mTimeVariables;
    com.android.internal.widget.remotecompose.core.CoreDocument.Version mVersion;
    java.lang.String mContentDescription;
    long mRequiredCapabilities;
    int mWidth;
    int mHeight;
    int mContentScroll;
    int mContentSizing;
    int mContentMode;
    int mContentAlignment;
    com.android.internal.widget.remotecompose.core.RemoteComposeBuffer mBuffer;
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.ClickCallbacks> mClickListeners;
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.ClickAreaRepresentation> mClickAreas;
    public CoreDocument() {}
    public java.lang.String getContentDescription() { return null; }
    public void setContentDescription(java.lang.String p0) {}
    public long getRequiredCapabilities() { return 0L; }
    public void setRequiredCapabilities(long p0) {}
    public int getWidth() { return 0; }
    public void setWidth(int p0) {}
    public int getHeight() { return 0; }
    public void setHeight(int p0) {}
    public com.android.internal.widget.remotecompose.core.RemoteComposeBuffer getBuffer() { return null; }
    public void setBuffer(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0) {}
    public com.android.internal.widget.remotecompose.core.RemoteComposeState getRemoteComposeState() { return null; }
    public void setRemoteComposeState(com.android.internal.widget.remotecompose.core.RemoteComposeState p0) {}
    public int getContentScroll() { return 0; }
    public int getContentSizing() { return 0; }
    public int getContentMode() { return 0; }
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void computeScale(float p0, float p1, float[] p2) {}
    public java.util.Set<com.android.internal.widget.remotecompose.core.CoreDocument.ClickAreaRepresentation> getClickAreas() { return null; }
    public void initFromBuffer(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0) {}
    public void initializeContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean canBeDisplayed(int p0, int p1, long p2) { return false; }
    void setVersion(int p0, int p1, int p2) {}
    public void addClickArea(int p0, java.lang.String p1, float p2, float p3, float p4, float p5, java.lang.String p6) {}
    public void addClickListener(com.android.internal.widget.remotecompose.core.CoreDocument.ClickCallbacks p0) {}
    public void onClick(float p0, float p1) {}
    public void performClick(int p0) {}
    public java.lang.String toString() { return null; }
    public int needsRepaint() { return 0; }
    public void paint(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) {}

    public static class ClickAreaRepresentation {
        int mId;
        java.lang.String mContentDescription;
        float mLeft;
        float mTop;
        float mRight;
        float mBottom;
        java.lang.String mMetadata;
        public ClickAreaRepresentation(int p0, java.lang.String p1, float p2, float p3, float p4, float p5, java.lang.String p6) {}
        public boolean contains(float p0, float p1) { return false; }
        public float getLeft() { return 0.0f; }
        public float getTop() { return 0.0f; }
        public float width() { return 0.0f; }
        public float height() { return 0.0f; }
        public int getId() { return 0; }
        public java.lang.String getContentDescription() { return null; }
        public java.lang.String getMetadata() { return null; }
    }

    public static interface ClickCallbacks {
        public void click(int p0, java.lang.String p1);
    }

    static class Version {
        public final int major = 0;
        public final int minor = 0;
        public final int patchLevel = 0;
        Version(int p0, int p1, int p2) {}
    }
}
