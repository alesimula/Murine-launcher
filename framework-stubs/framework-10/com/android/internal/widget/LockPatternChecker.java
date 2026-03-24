package com.android.internal.widget;

public final class LockPatternChecker {
    public LockPatternChecker() {}
    public static android.os.AsyncTask<?, ?, ?> verifyPattern(com.android.internal.widget.LockPatternUtils p0, java.util.List<com.android.internal.widget.LockPatternView.Cell> p1, long p2, int p3, com.android.internal.widget.LockPatternChecker.OnVerifyCallback p4) { return null; }
    public static android.os.AsyncTask<?, ?, ?> checkPattern(com.android.internal.widget.LockPatternUtils p0, java.util.List<com.android.internal.widget.LockPatternView.Cell> p1, int p2, com.android.internal.widget.LockPatternChecker.OnCheckCallback p3) { return null; }
    @java.lang.Deprecated
    public static android.os.AsyncTask<?, ?, ?> verifyPassword(com.android.internal.widget.LockPatternUtils p0, java.lang.String p1, long p2, int p3, com.android.internal.widget.LockPatternChecker.OnVerifyCallback p4) { return null; }
    public static android.os.AsyncTask<?, ?, ?> verifyPassword(com.android.internal.widget.LockPatternUtils p0, byte[] p1, long p2, int p3, com.android.internal.widget.LockPatternChecker.OnVerifyCallback p4) { return null; }
    public static android.os.AsyncTask<?, ?, ?> verifyTiedProfileChallenge(com.android.internal.widget.LockPatternUtils p0, byte[] p1, boolean p2, long p3, int p4, com.android.internal.widget.LockPatternChecker.OnVerifyCallback p5) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static android.os.AsyncTask<?, ?, ?> checkPassword(com.android.internal.widget.LockPatternUtils p0, java.lang.String p1, int p2, com.android.internal.widget.LockPatternChecker.OnCheckCallback p3) { return null; }
    public static android.os.AsyncTask<?, ?, ?> checkPassword(com.android.internal.widget.LockPatternUtils p0, byte[] p1, int p2, com.android.internal.widget.LockPatternChecker.OnCheckCallback p3) { return null; }

    public static interface OnVerifyCallback {
        public void onVerified(byte[] p0, int p1);
    }

    public static interface OnCheckCallback {
        default public void onEarlyMatched() {}
        public void onChecked(boolean p0, int p1);
        default public void onCancelled() {}
    }
}
