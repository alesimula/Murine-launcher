package com.android.internal.widget.remotecompose.accessibility;

public class CoreDocumentAccessibility implements com.android.internal.widget.remotecompose.accessibility.RemoteComposeDocumentAccessibility {
    public CoreDocumentAccessibility(com.android.internal.widget.remotecompose.core.CoreDocument p0, com.android.internal.widget.remotecompose.core.RemoteContext p1) {}
    @android.annotation.Nullable
    public java.lang.Integer getComponentIdAt(android.graphics.PointF p0) { return null; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.layout.Component findComponentById(int p0) { return null; }
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode mergeMode(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    public boolean performAction(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, android.os.Bundle p2) { return false; }
    public int scrollByOffset(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, int p2) { return 0; }
    public boolean scrollDirection(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection p2) { return false; }
    public boolean performClick(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    @android.annotation.Nullable
    public java.lang.String stringValue(int p0) { return null; }
    public java.util.List<com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics> semanticModifiersForComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    public java.util.List<java.lang.Integer> semanticallyRelevantChildComponents(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, boolean p1) { return null; }
    static java.util.stream.Stream<com.android.internal.widget.remotecompose.core.operations.layout.Component> componentStream(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    static java.util.stream.Stream<com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation> modifiersStream(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    static boolean isInteresting(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    static boolean isModifierWithSemantics(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation p0) { return false; }
    static boolean isContainerWithSemantics(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
}
