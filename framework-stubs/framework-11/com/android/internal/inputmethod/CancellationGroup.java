package com.android.internal.inputmethod;

public final class CancellationGroup {
    private final java.lang.Object mLock = null;
    private java.util.ArrayList<java.util.concurrent.CountDownLatch> mLatchList;
    private boolean mCanceled;
    public CancellationGroup() {}
    public com.android.internal.inputmethod.CancellationGroup.Completable.Int createCompletableInt() { return null; }
    public com.android.internal.inputmethod.CancellationGroup.Completable.CharSequence createCompletableCharSequence() { return null; }
    public com.android.internal.inputmethod.CancellationGroup.Completable.ExtractedText createCompletableExtractedText() { return null; }
    private boolean registerLatch(java.util.concurrent.CountDownLatch p0) { return false; }
    private void unregisterLatch(java.util.concurrent.CountDownLatch p0) {}
    public void cancelAll() {}
    public boolean isCanceled() { return false; }

    public static final class Completable {
        private Completable() {}

        public static final class CharSequence extends com.android.internal.inputmethod.CancellationGroup.Completable.Values<java.lang.CharSequence> {
            private CharSequence(com.android.internal.inputmethod.CancellationGroup p0) { super(null); }
        }

        public static final class ExtractedText extends com.android.internal.inputmethod.CancellationGroup.Completable.Values<android.view.inputmethod.ExtractedText> {
            private ExtractedText(com.android.internal.inputmethod.CancellationGroup p0) { super(null); }
        }

        public static final class Int extends com.android.internal.inputmethod.CancellationGroup.Completable.ValueBase {
            private int mValue;
            private Int(com.android.internal.inputmethod.CancellationGroup p0) { super(null); }
            void onComplete(int p0) {}
            public int getValue() { return 0; }
        }

        protected static class ValueBase {
            private final java.util.concurrent.CountDownLatch mLatch = null;
            private final com.android.internal.inputmethod.CancellationGroup mParentGroup = null;
            protected final java.lang.Object mValueLock = null;
            protected boolean mHasValue;
            protected ValueBase(com.android.internal.inputmethod.CancellationGroup p0) {}
            public boolean hasValue() { return false; }
            protected void onComplete() {}
            public boolean await(int p0, java.util.concurrent.TimeUnit p1) { return false; }
        }

        public static class Values<T extends java.lang.Object> extends com.android.internal.inputmethod.CancellationGroup.Completable.ValueBase {
            private T mValue;
            protected Values(com.android.internal.inputmethod.CancellationGroup p0) { super(null); }
            void onComplete(T p0) {}
            public T getValue() { return null; }
        }
    }
}
