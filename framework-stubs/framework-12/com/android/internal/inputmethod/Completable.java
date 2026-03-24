package com.android.internal.inputmethod;

public final class Completable {
    private Completable() {}
    public static com.android.internal.inputmethod.Completable.Int createInt() { return null; }
    public static com.android.internal.inputmethod.Completable.Boolean createBoolean() { return null; }
    public static com.android.internal.inputmethod.Completable.CharSequence createCharSequence() { return null; }
    public static com.android.internal.inputmethod.Completable.ExtractedText createExtractedText() { return null; }
    public static com.android.internal.inputmethod.Completable.SurroundingText createSurroundingText() { return null; }
    public static com.android.internal.inputmethod.Completable.InputBindResult createInputBindResult() { return null; }
    public static com.android.internal.inputmethod.Completable.InputMethodSubtype createInputMethodSubtype() { return null; }
    public static com.android.internal.inputmethod.Completable.InputMethodSubtypeList createInputMethodSubtypeList() { return null; }
    public static com.android.internal.inputmethod.Completable.InputMethodInfoList createInputMethodInfoList() { return null; }
    public static com.android.internal.inputmethod.Completable.IInputContentUriToken createIInputContentUriToken() { return null; }
    public static com.android.internal.inputmethod.Completable.Void createVoid() { return null; }
    public static <T extends java.lang.Object> T getResult(com.android.internal.inputmethod.Completable.Values<T> p0) { return null; }
    public static int getIntResult(com.android.internal.inputmethod.Completable.Int p0) { return 0; }
    public static void getResult(com.android.internal.inputmethod.Completable.Void p0) {}
    public static int getResultOrZero(com.android.internal.inputmethod.Completable.Int p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, int p4) { return 0; }
    public static <T extends java.lang.Object> T getResultOrNull(com.android.internal.inputmethod.Completable.Values<T> p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, int p4) { return null; }
    private static void logInternal(java.lang.String p0, java.lang.String p1, boolean p2, int p3, java.lang.Object p4) {}

    public static final class Boolean extends com.android.internal.inputmethod.Completable.Values<java.lang.Boolean> {
        public Boolean() { super(); }
    }

    public static final class CharSequence extends com.android.internal.inputmethod.Completable.Values<java.lang.CharSequence> {
        public CharSequence() { super(); }
    }

    public static final class ExtractedText extends com.android.internal.inputmethod.Completable.Values<android.view.inputmethod.ExtractedText> {
        public ExtractedText() { super(); }
    }

    public static final class IInputContentUriToken extends com.android.internal.inputmethod.Completable.Values<com.android.internal.inputmethod.IInputContentUriToken> {
        public IInputContentUriToken() { super(); }
    }

    public static final class InputBindResult extends com.android.internal.inputmethod.Completable.Values<com.android.internal.view.InputBindResult> {
        public InputBindResult() { super(); }
    }

    public static final class InputMethodInfoList extends com.android.internal.inputmethod.Completable.Values<java.util.List<android.view.inputmethod.InputMethodInfo>> {
        public InputMethodInfoList() { super(); }
    }

    public static final class InputMethodSubtype extends com.android.internal.inputmethod.Completable.Values<android.view.inputmethod.InputMethodSubtype> {
        public InputMethodSubtype() { super(); }
    }

    public static final class InputMethodSubtypeList extends com.android.internal.inputmethod.Completable.Values<java.util.List<android.view.inputmethod.InputMethodSubtype>> {
        public InputMethodSubtypeList() { super(); }
    }

    public static final class Int extends com.android.internal.inputmethod.Completable.ValueBase {
        private int mValue;
        public Int() { super(); }
        void onComplete(int p0) {}
        public int getValue() { return 0; }
    }

    public static final class SurroundingText extends com.android.internal.inputmethod.Completable.Values<android.view.inputmethod.SurroundingText> {
        public SurroundingText() { super(); }
    }

    protected static class ValueBase {
        private final java.util.concurrent.CountDownLatch mLatch = null;
        protected final java.lang.Object mStateLock = null;
        protected int mState;
        protected java.lang.String mMessage;
        protected ValueBase() {}
        protected static java.lang.String stateToString(int p0) { return null; }
        public boolean hasValue() { return false; }
        protected void enforceGetValueLocked() {}
        protected void onComplete() {}
        protected void onError(com.android.internal.inputmethod.ThrowableHolder p0) {}
        public boolean await(int p0, java.util.concurrent.TimeUnit p1, com.android.internal.inputmethod.CancellationGroup p2) { return false; }
        private boolean awaitInner(int p0, java.util.concurrent.TimeUnit p1) { return false; }
        public void await() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        protected static @interface CompletionState {
            public static final int NOT_COMPLETED = 0;
            public static final int COMPLETED_WITH_VALUE = 1;
            public static final int COMPLETED_WITH_ERROR = 2;
        }
    }

    public static class Values<T extends java.lang.Object> extends com.android.internal.inputmethod.Completable.ValueBase {
        private T mValue;
        public Values() { super(); }
        void onComplete(T p0) {}
        public T getValue() { return null; }
    }

    public static final class Void extends com.android.internal.inputmethod.Completable.ValueBase {
        public Void() { super(); }
        protected void onComplete() {}
        public void getValue() {}
    }
}
