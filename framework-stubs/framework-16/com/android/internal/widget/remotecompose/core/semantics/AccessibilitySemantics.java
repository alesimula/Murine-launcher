package com.android.internal.widget.remotecompose.core.semantics;

public interface AccessibilitySemantics {
    default public boolean isInterestingForSemantics() { return false; }
}
