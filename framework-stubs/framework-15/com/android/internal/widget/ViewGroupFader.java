package com.android.internal.widget;

class ViewGroupFader {
    protected final android.view.ViewGroup mParent = null;
    ViewGroupFader(android.view.ViewGroup p0, com.android.internal.widget.ViewGroupFader.AnimationCallback p1, com.android.internal.widget.ViewGroupFader.ChildViewBoundsProvider p2) {}
    com.android.internal.widget.ViewGroupFader.AnimationCallback getAnimationCallback() { return null; }
    void setScaleLowerBound(float p0) {}
    void setAlphaLowerBound(float p0) {}
    void setTopInterpolator(android.view.animation.BaseInterpolator p0) {}
    void setBottomInterpolator(android.view.animation.BaseInterpolator p0) {}
    void setContainerBoundsProvider(com.android.internal.widget.ViewGroupFader.ContainerBoundsProvider p0) {}
    void updateFade() {}

    static interface AnimationCallback {
        public boolean shouldFadeFromTop(android.view.View p0);
        public boolean shouldFadeFromBottom(android.view.View p0);
        public void viewHasBecomeFullSize(android.view.View p0);
    }

    static interface ChildViewBoundsProvider {
        public void provideBounds(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2);
    }

    static interface ContainerBoundsProvider {
        public void provideBounds(android.view.ViewGroup p0, android.graphics.Rect p1);
    }

    static final class DefaultViewBoundsProvider implements com.android.internal.widget.ViewGroupFader.ChildViewBoundsProvider {
        DefaultViewBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2) {}
    }

    static final class GlobalVisibleViewBoundsProvider implements com.android.internal.widget.ViewGroupFader.ChildViewBoundsProvider {
        GlobalVisibleViewBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2) {}
    }

    static final class ParentContainerBoundsProvider implements com.android.internal.widget.ViewGroupFader.ContainerBoundsProvider {
        ParentContainerBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    }

    static final class ScreenContainerBoundsProvider implements com.android.internal.widget.ViewGroupFader.ContainerBoundsProvider {
        ScreenContainerBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    }
}
