package com.android.internal.widget.remotecompose.core.operations.layout;

public interface ScrollDelegate {
    public float getScrollX(float p0);
    public float getScrollY(float p0);
    public boolean handlesHorizontalScroll();
    public boolean handlesVerticalScroll();
    public void reset();
}
