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
    private final android.os.Handler mHandler = null;
    public SpellCheckerSession(android.view.textservice.SpellCheckerInfo p0, android.view.textservice.TextServicesManager p1, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener p2) {}
    public boolean isSessionDisconnected() { return false; }
    public android.view.textservice.SpellCheckerInfo getSpellChecker() { return null; }
    public void cancel() {}
    public void close() {}
    public void getSentenceSuggestions(android.view.textservice.TextInfo[] p0, int p1) {}
    @java.lang.Deprecated
    public void getSuggestions(android.view.textservice.TextInfo p0, int p1) {}
    @java.lang.Deprecated
    public void getSuggestions(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
    private void handleOnGetSuggestionsMultiple(android.view.textservice.SuggestionsInfo[] p0) {}
    private void handleOnGetSentenceSuggestionsMultiple(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
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
        private android.os.Handler mHandler;
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
        public SpellCheckerSessionListenerImpl(android.os.Handler p0) { super(); }
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

        private static class SpellCheckerParams {
            public final int mWhat = 0;
            public final android.view.textservice.TextInfo[] mTextInfos = null;
            public final int mSuggestionsLimit = 0;
            public final boolean mSequentialWords = false;
            public com.android.internal.textservice.ISpellCheckerSession mSession;
            public SpellCheckerParams(int p0, android.view.textservice.TextInfo[] p1, int p2, boolean p3) {}
        }
    }
}
