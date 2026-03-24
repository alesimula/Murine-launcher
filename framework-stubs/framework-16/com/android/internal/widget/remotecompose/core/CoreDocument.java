package com.android.internal.widget.remotecompose.core;

public class CoreDocument implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public static final int MAJOR_VERSION = 1;
    public static final int MINOR_VERSION = 0;
    public static final int PATCH_VERSION = 0;
    public static final int DOCUMENT_API_LEVEL = 6;
    static final float BUILD = 0.0f;
    @android.annotation.NonNull
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mOperations;
    @android.annotation.Nullable
    com.android.internal.widget.remotecompose.core.operations.layout.RootLayoutComponent mRootLayoutComponent;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.RemoteComposeState mRemoteComposeState;
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.TimeVariables mTimeVariables;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.CoreDocument.Version mVersion;
    @android.annotation.Nullable
    java.lang.String mContentDescription;
    long mRequiredCapabilities;
    int mWidth;
    int mHeight;
    int mContentScroll;
    int mContentSizing;
    int mContentMode;
    int mContentAlignment;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.RemoteComposeBuffer mBuffer;
    boolean mFirstPaint;
    com.android.internal.widget.remotecompose.core.CoreDocument.HapticEngine mHapticEngine;
    @android.annotation.NonNull
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.ActionCallback> mActionListeners;
    @android.annotation.NonNull
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.IdActionCallback> mIdActionListeners;
    @android.annotation.NonNull
    java.util.HashSet<com.android.internal.widget.remotecompose.core.TouchListener> mTouchListeners;
    @android.annotation.NonNull
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.ClickAreaRepresentation> mClickAreas;
    public CoreDocument() {}
    public static int getDocumentApiLevel() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getContentDescription() { return null; }
    public void setContentDescription(java.lang.String p0) {}
    public long getRequiredCapabilities() { return 0L; }
    public void setRequiredCapabilities(long p0) {}
    public int getWidth() { return 0; }
    public void setWidth(int p0) {}
    public int getHeight() { return 0; }
    public void setHeight(int p0) {}
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.RemoteComposeBuffer getBuffer() { return null; }
    public void setBuffer(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0) {}
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.RemoteComposeState getRemoteComposeState() { return null; }
    public void setRemoteComposeState(com.android.internal.widget.remotecompose.core.RemoteComposeState p0) {}
    public int getContentScroll() { return 0; }
    public int getContentSizing() { return 0; }
    public int getContentMode() { return 0; }
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void computeScale(float p0, float p1, float[] p2) {}
    @android.annotation.NonNull
    public java.util.Set<com.android.internal.widget.remotecompose.core.CoreDocument.ClickAreaRepresentation> getClickAreas() { return null; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.RootLayoutComponent getRootLayoutComponent() { return null; }
    public void invalidateMeasure() {}
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.Component getComponent(int p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String displayHierarchy() { return null; }
    public void evaluateIntExpression(long p0, int p1, com.android.internal.widget.remotecompose.core.RemoteContext p2) {}
    public void evaluateFloatExpression(int p0, int p1, com.android.internal.widget.remotecompose.core.RemoteContext p2) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setProperties(com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> p0) {}
    public java.lang.Object getProperty(short p0) { return null; }
    public void applyUpdate(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public void setHapticEngine(com.android.internal.widget.remotecompose.core.CoreDocument.HapticEngine p0) {}
    public void haptic(int p0) {}
    public void appliedTouchOperation(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void runNamedAction(java.lang.String p0, java.lang.Object p1) {}
    public void addActionCallback(com.android.internal.widget.remotecompose.core.CoreDocument.ActionCallback p0) {}
    public void clearActionCallbacks() {}
    public void initFromBuffer(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0) {}
    public void initializeContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean canBeDisplayed(int p0, int p1, long p2) { return false; }
    public void setVersion(int p0, int p1, int p2) {}
    public void addClickArea(int p0, java.lang.String p1, float p2, float p3, float p4, float p5, java.lang.String p6) {}
    public void addTouchListener(com.android.internal.widget.remotecompose.core.TouchListener p0) {}
    public void addIdActionListener(com.android.internal.widget.remotecompose.core.CoreDocument.IdActionCallback p0) {}
    @android.annotation.NonNull
    public java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.IdActionCallback> getIdActionListeners() { return null; }
    public void onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    public void performClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1, java.lang.String p2) {}
    public boolean hasTouchListener() { return false; }
    public boolean touchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public void touchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    public void touchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4) {}
    public void touchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getNamedColors() { return null; }
    public java.lang.String[] getNamedVariables(int p0) { return null; }
    public int getOpsPerFrame() { return 0; }
    public int needsRepaint() { return 0; }
    public void paint(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) {}
    public int getNumberOfOps() { return 0; }
    @android.annotation.NonNull
    public java.lang.String[] getStats() { return null; }
    @android.annotation.NonNull
    public java.lang.String toNestedString() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.widget.remotecompose.core.Operation> getOperations() { return null; }
    public void checkShaders(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl p1) {}
    public void setUpdateDoc(boolean p0) {}
    public boolean isUpdateDoc() { return false; }

    public static interface ActionCallback {
        public void onAction(java.lang.String p0, java.lang.Object p1);
    }

    public static class ClickAreaRepresentation {
        int mId;
        @android.annotation.Nullable
        final java.lang.String mContentDescription = null;
        float mLeft;
        float mTop;
        float mRight;
        float mBottom;
        @android.annotation.Nullable
        final java.lang.String mMetadata = null;
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public ClickAreaRepresentation(int p0, java.lang.String p1, float p2, float p3, float p4, float p5, java.lang.String p6) {}
        public boolean contains(float p0, float p1) { return false; }
        public float getLeft() { return 0.0f; }
        public float getTop() { return 0.0f; }
        public float width() { return 0.0f; }
        public float height() { return 0.0f; }
        public int getId() { return 0; }
        @android.annotation.Nullable
        public java.lang.String getContentDescription() { return null; }
        @android.annotation.Nullable
        public java.lang.String getMetadata() { return null; }
    }

    public static interface HapticEngine {
        public void haptic(int p0);
    }

    public static interface IdActionCallback {
        public void onAction(int p0, java.lang.String p1);
    }

    public static interface ShaderControl {
        public boolean isShaderValid(java.lang.String p0);
    }

    static class Version {
        public final int major = 0;
        public final int minor = 0;
        public final int patchLevel = 0;
        Version(int p0, int p1, int p2) {}
        public boolean supportsVersion(int p0, int p1, int p2) { return false; }
    }

    private static interface Visitor {
        public void visit(com.android.internal.widget.remotecompose.core.Operation p0);
    }
}
