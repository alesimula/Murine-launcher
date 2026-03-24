package com.android.internal.widget.remotecompose.core.semantics;

public interface AccessibleComponent extends com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics {
    @android.annotation.Nullable
    default public java.lang.Integer getContentDescriptionId() { return null; }
    @android.annotation.Nullable
    default public java.lang.Integer getTextId() { return null; }
    @android.annotation.Nullable
    default public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role getRole() { return null; }
    default public boolean isClickable() { return false; }
    default public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode getMode() { return null; }

    public static enum Mode {
        SET,
        CLEAR_AND_SET,
        MERGE;
    }

    public static enum Role {
        BUTTON,
        CHECKBOX,
        SWITCH,
        RADIO_BUTTON,
        TAB,
        IMAGE,
        DROPDOWN_LIST,
        PICKER,
        CAROUSEL,
        UNKNOWN;
        @android.annotation.Nullable
        public java.lang.String getDescription() { return null; }
        public static com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role fromInt(int p0) { return null; }
    }
}
