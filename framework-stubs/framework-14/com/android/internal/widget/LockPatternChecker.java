package com.android.internal.widget;

public final class LockPatternChecker {
    public LockPatternChecker() {}
    public static android.os.AsyncTask<?, ?, ?> verifyCredential(com.android.internal.widget.LockPatternUtils p0, com.android.internal.widget.LockscreenCredential p1, int p2, int p3, com.android.internal.widget.LockPatternChecker.OnVerifyCallback p4) { return null; }
    public static android.os.AsyncTask<?, ?, ?> checkCredential(com.android.internal.widget.LockPatternUtils p0, com.android.internal.widget.LockscreenCredential p1, int p2, com.android.internal.widget.LockPatternChecker.OnCheckCallback p3) { return null; }
    public static android.os.AsyncTask<?, ?, ?> verifyTiedProfileChallenge(com.android.internal.widget.LockPatternUtils p0, com.android.internal.widget.LockscreenCredential p1, int p2, int p3, com.android.internal.widget.LockPatternChecker.OnVerifyCallback p4) { return null; }

    public static interface OnCheckCallback {
        default public void onEarlyMatched() {}
        public void onChecked(boolean p0, int p1);
        default public void onCancelled() {}
    }

    public static interface OnVerifyCallback {
        public void onVerified(com.android.internal.widget.VerifyCredentialResponse p0, int p1);
    }
}
