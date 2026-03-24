package android.view;

public final class ViewTreeObserver {
    ViewTreeObserver(android.content.Context p0) {}
    void merge(android.view.ViewTreeObserver p0) {}
    public void addOnWindowAttachListener(android.view.ViewTreeObserver.OnWindowAttachListener p0) {}
    public void removeOnWindowAttachListener(android.view.ViewTreeObserver.OnWindowAttachListener p0) {}
    public void addOnWindowFocusChangeListener(android.view.ViewTreeObserver.OnWindowFocusChangeListener p0) {}
    public void removeOnWindowFocusChangeListener(android.view.ViewTreeObserver.OnWindowFocusChangeListener p0) {}
    public void addOnWindowVisibilityChangeListener(android.view.ViewTreeObserver.OnWindowVisibilityChangeListener p0) {}
    public void removeOnWindowVisibilityChangeListener(android.view.ViewTreeObserver.OnWindowVisibilityChangeListener p0) {}
    public void addOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener p0) {}
    public void removeOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener p0) {}
    public void addOnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener p0) {}
    @java.lang.Deprecated
    public void removeGlobalOnLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener p0) {}
    public void removeOnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener p0) {}
    public void addOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener p0) {}
    public void removeOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener p0) {}
    public void addOnWindowShownListener(android.view.ViewTreeObserver.OnWindowShownListener p0) {}
    public void removeOnWindowShownListener(android.view.ViewTreeObserver.OnWindowShownListener p0) {}
    public void addOnDrawListener(android.view.ViewTreeObserver.OnDrawListener p0) {}
    public void removeOnDrawListener(android.view.ViewTreeObserver.OnDrawListener p0) {}
    public void registerFrameCommitCallback(java.lang.Runnable p0) {}
    java.util.ArrayList<java.lang.Runnable> captureFrameCommitCallbacks() { return null; }
    public boolean unregisterFrameCommitCallback(java.lang.Runnable p0) { return false; }
    public void addOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener p0) {}
    public void removeOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener p0) {}
    public void addOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener p0) {}
    public void removeOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener p0) {}
    public void addOnComputeInternalInsetsListener(android.view.ViewTreeObserver.OnComputeInternalInsetsListener p0) {}
    public void removeOnComputeInternalInsetsListener(android.view.ViewTreeObserver.OnComputeInternalInsetsListener p0) {}
    public void addOnEnterAnimationCompleteListener(android.view.ViewTreeObserver.OnEnterAnimationCompleteListener p0) {}
    public void removeOnEnterAnimationCompleteListener(android.view.ViewTreeObserver.OnEnterAnimationCompleteListener p0) {}
    public void addOnSystemGestureExclusionRectsChangedListener(java.util.function.Consumer<java.util.List<android.graphics.Rect>> p0) {}
    public void removeOnSystemGestureExclusionRectsChangedListener(java.util.function.Consumer<java.util.List<android.graphics.Rect>> p0) {}
    public boolean isAlive() { return false; }
    final void dispatchOnWindowAttachedChange(boolean p0) {}
    final void dispatchOnWindowFocusChange(boolean p0) {}
    void dispatchOnWindowVisibilityChange(int p0) {}
    final void dispatchOnGlobalFocusChange(android.view.View p0, android.view.View p1) {}
    public final void dispatchOnGlobalLayout() {}
    final boolean hasOnPreDrawListeners() { return false; }
    public final boolean dispatchOnPreDraw() { return false; }
    final java.lang.String getLastDispatchOnPreDrawCanceledReason() { return null; }
    public final void dispatchOnWindowShown() {}
    public final void dispatchOnDraw() {}
    final void dispatchOnTouchModeChanged(boolean p0) {}
    final void dispatchOnScrollChanged() {}
    final boolean hasComputeInternalInsetsListeners() { return false; }
    final void dispatchOnComputeInternalInsets(android.view.ViewTreeObserver.InternalInsetsInfo p0) {}
    public final void dispatchOnEnterAnimationComplete() {}
    void dispatchOnSystemGestureExclusionRectsChanged(java.util.List<android.graphics.Rect> p0) {}

    static class CopyOnWriteArray<T extends java.lang.Object> {
        CopyOnWriteArray() {}
        android.view.ViewTreeObserver.CopyOnWriteArray.Access<T> start() { return null; }
        void end() {}
        int size() { return 0; }
        void add(T p0) {}
        void addAll(android.view.ViewTreeObserver.CopyOnWriteArray<T> p0) {}
        void remove(T p0) {}
        void clear() {}

        static class Access<T extends java.lang.Object> {
            Access() {}
            T get(int p0) { return null; }
            int size() { return 0; }
        }
    }

    public static final class InternalInsetsInfo {
        public final android.graphics.Rect contentInsets = null;
        public final android.graphics.Rect visibleInsets = null;
        public final android.graphics.Region touchableRegion = null;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_VISIBLE = 2;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        int mTouchableInsets;
        public InternalInsetsInfo() {}
        public void setTouchableInsets(int p0) {}
        void reset() {}
        boolean isEmpty() { return false; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        void set(android.view.ViewTreeObserver.InternalInsetsInfo p0) {}
    }

    public static interface OnComputeInternalInsetsListener {
        public void onComputeInternalInsets(android.view.ViewTreeObserver.InternalInsetsInfo p0);
    }

    public static interface OnDrawListener {
        public void onDraw();
    }

    public static interface OnEnterAnimationCompleteListener {
        public void onEnterAnimationComplete();
    }

    public static interface OnGlobalFocusChangeListener {
        public void onGlobalFocusChanged(android.view.View p0, android.view.View p1);
    }

    public static interface OnGlobalLayoutListener {
        public void onGlobalLayout();
    }

    public static interface OnPreDrawListener {
        public boolean onPreDraw();
    }

    public static interface OnScrollChangedListener {
        public void onScrollChanged();
    }

    public static interface OnTouchModeChangeListener {
        public void onTouchModeChanged(boolean p0);
    }

    public static interface OnWindowAttachListener {
        public void onWindowAttached();
        public void onWindowDetached();
    }

    public static interface OnWindowFocusChangeListener {
        public void onWindowFocusChanged(boolean p0);
    }

    public static interface OnWindowShownListener {
        public void onWindowShown();
    }

    public static interface OnWindowVisibilityChangeListener {
        public void onWindowVisibilityChanged(int p0);
    }
}
