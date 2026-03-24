package android.view.textservice;

public class SpellCheckerSession {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    public static final java.lang.String SERVICE_META_DATA = "android.view.textservice.scs";
    private static final int MSG_ON_GET_SUGGESTION_MULTIPLE = 1;
    private static final int MSG_ON_GET_SUGGESTION_MULTIPLE_FOR_SENTENCE = 2;
    private final android.view.textservice.SpellCheckerSession.InternalListener mInternalListener = null;
    private final android.view.textservice.TextServicesManager mTextServicesManager = null;
    private final android.view.textservice.SpellCheckerInfo mSpellCheckerInfo = null;
    private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener mSpellCheckerSessionListener = null;
    private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl mSpellCheckerSessionListenerImpl = null;
    private final java.util.concurrent.Executor mExecutor = null;
    public SpellCheckerSession(android.view.textservice.SpellCheckerInfo p0, android.view.textservice.TextServicesManager p1, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener p2, java.util.concurrent.Executor p3) {}
    public boolean isSessionDisconnected() { return false; }
    public android.view.textservice.SpellCheckerInfo getSpellChecker() { return null; }
    public void cancel() {}
    public void close() {}
    public void getSentenceSuggestions(android.view.textservice.TextInfo[] p0, int p1) {}
    @java.lang.Deprecated
    public void getSuggestions(android.view.textservice.TextInfo p0, int p1) {}
    @java.lang.Deprecated
    public void getSuggestions(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
    void handleOnGetSuggestionsMultiple(android.view.textservice.SuggestionsInfo[] p0) {}
    void handleOnGetSentenceSuggestionsMultiple(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public com.android.internal.textservice.ITextServicesSessionListener getTextServicesSessionListener() { return null; }
    public com.android.internal.textservice.ISpellCheckerSessionListener getSpellCheckerSessionListener() { return null; }

    private static final class InternalListener extends com.android.internal.textservice.ITextServicesSessionListener.Stub {
        private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl mParentSpellCheckerSessionListenerImpl = null;
        public InternalListener(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl p0) { super(); }
        public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) {}
    }

    public static interface SpellCheckerSessionListener {
        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0);
        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0);
    }

    private static final class SpellCheckerSessionListenerImpl extends com.android.internal.textservice.ISpellCheckerSessionListener.Stub {
        private static final int TASK_CANCEL = 1;
        private static final int TASK_GET_SUGGESTIONS_MULTIPLE = 2;
        private static final int TASK_CLOSE = 3;
        private static final int TASK_GET_SUGGESTIONS_MULTIPLE_FOR_SENTENCE = 4;
        private final java.util.Queue<android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl.SpellCheckerParams> mPendingTasks = null;
        private android.view.textservice.SpellCheckerSession mSpellCheckerSession;
        private static final int STATE_WAIT_CONNECTION = 0;
        private static final int STATE_CONNECTED = 1;
        private static final int STATE_CLOSED_AFTER_CONNECTION = 2;
        private static final int STATE_CLOSED_BEFORE_CONNECTION = 3;
        private int mState;
        private com.android.internal.textservice.ISpellCheckerSession mISpellCheckerSession;
        private android.os.HandlerThread mThread;
        private android.os.Handler mAsyncHandler;
        private static java.lang.String taskToString(int p0) { return null; }
        private static java.lang.String stateToString(int p0) { return null; }
        SpellCheckerSessionListenerImpl(android.view.textservice.SpellCheckerSession p0) { super(); }
        private void processTask(com.android.internal.textservice.ISpellCheckerSession p0, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl.SpellCheckerParams p1, boolean p2) {}
        private void processCloseLocked() {}
        public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) {}
        public void cancel() {}
        public void getSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
        public void getSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) {}
        public void close() {}
        public boolean isDisconnected() { return false; }
        private void processOrEnqueueTask(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl.SpellCheckerParams p0) {}
        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) {}
        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
        private android.view.textservice.SpellCheckerSession getSpellCheckerSession() { return null; }

        private static class SpellCheckerParams {
            public final int mWhat = 0;
            public final android.view.textservice.TextInfo[] mTextInfos = null;
            public final int mSuggestionsLimit = 0;
            public final boolean mSequentialWords = false;
            public com.android.internal.textservice.ISpellCheckerSession mSession;
            public SpellCheckerParams(int p0, android.view.textservice.TextInfo[] p1, int p2, boolean p3) {}
        }
    }

    public static class SpellCheckerSessionParams {
        private final java.util.Locale mLocale = null;
        private final boolean mShouldReferToSpellCheckerLanguageSettings = false;
        private final int mSupportedAttributes = 0;
        private final android.os.Bundle mExtras = null;
        private SpellCheckerSessionParams(java.util.Locale p0, boolean p1, int p2, android.os.Bundle p3) {}
        @android.annotation.SuppressLint("UseIcu")
        public java.util.Locale getLocale() { return null; }
        public boolean shouldReferToSpellCheckerLanguageSettings() { return false; }
        public int getSupportedAttributes() { return 0; }
        public android.os.Bundle getExtras() { return null; }

        public static final class Builder {
            private java.util.Locale mLocale;
            private boolean mShouldReferToSpellCheckerLanguageSettings;
            private int mSupportedAttributes;
            private android.os.Bundle mExtras;
            public Builder() {}
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams build() { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setLocale(java.util.Locale p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setShouldReferToSpellCheckerLanguageSettings(boolean p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setSupportedAttributes(int p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setExtras(android.os.Bundle p0) { return null; }
        }
    }
}
