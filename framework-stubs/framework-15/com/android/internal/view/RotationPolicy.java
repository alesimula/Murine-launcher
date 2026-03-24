package com.android.internal.view;

public final class RotationPolicy {
    public static final int NATURAL_ROTATION = 0;
    public static boolean isRotationSupported(android.content.Context p0) { return false; }
    public static int getRotationLockOrientation(android.content.Context p0) { return 0; }
    public static boolean isRotationLockToggleVisible(android.content.Context p0) { return false; }
    public static boolean isRotationLocked(android.content.Context p0) { return false; }
    public static void setRotationLock(android.content.Context p0, boolean p1, java.lang.String p2) {}
    public static void setRotationLockAtAngle(android.content.Context p0, boolean p1, int p2, java.lang.String p3) {}
    public static void setRotationLockForAccessibility(android.content.Context p0, boolean p1, java.lang.String p2) {}
    public static void registerRotationPolicyListener(android.content.Context p0, com.android.internal.view.RotationPolicy.RotationPolicyListener p1) {}
    public static void registerRotationPolicyListener(android.content.Context p0, com.android.internal.view.RotationPolicy.RotationPolicyListener p1, int p2) {}
    public static void unregisterRotationPolicyListener(android.content.Context p0, com.android.internal.view.RotationPolicy.RotationPolicyListener p1) {}

    public static abstract class RotationPolicyListener {
        final android.database.ContentObserver mObserver = null;
        public RotationPolicyListener() {}
        public abstract void onChange();
    }
}
