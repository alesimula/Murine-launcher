package com.android.internal.widget.remotecompose.accessibility;

public interface SemanticNodeApplier<N extends java.lang.Object> {
    public static final java.lang.String VIRTUAL_VIEW_ID_KEY = "VirtualViewId";
    public void applyComponent(com.android.internal.widget.remotecompose.accessibility.RemoteComposeDocumentAccessibility p0, N p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, java.util.List<com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics> p3);
    public void addChildren(N p0, java.util.List<java.lang.Integer> p1);
}
