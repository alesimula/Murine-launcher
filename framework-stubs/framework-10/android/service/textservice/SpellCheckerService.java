package android.service.textservice;

public abstract class SpellCheckerService extends android.app.Service {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.textservice.SpellCheckerService";
    private final android.service.textservice.SpellCheckerService.SpellCheckerServiceBinder mBinder = null;
    public SpellCheckerService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.service.textservice.SpellCheckerService.Session createSession();

    private static class SpellCheckerServiceBinder extends com.android.internal.textservice.ISpellCheckerService.Stub {
        private final java.lang.ref.WeakReference<android.service.textservice.SpellCheckerService> mInternalServiceRef = null;
        public SpellCheckerServiceBinder(android.service.textservice.SpellCheckerService p0) { super(); }
        public void getISpellCheckerSession(java.lang.String p0, com.android.internal.textservice.ISpellCheckerSessionListener p1, android.os.Bundle p2, com.android.internal.textservice.ISpellCheckerServiceCallback p3) {}
    }

    public static abstract class Session {
        private android.service.textservice.SpellCheckerService.InternalISpellCheckerSession mInternalSession;
        private volatile android.service.textservice.SpellCheckerService.SentenceLevelAdapter mSentenceLevelAdapter;
        public Session() {}
        public final void setInternalISpellCheckerSession(android.service.textservice.SpellCheckerService.InternalISpellCheckerSession p0) {}
        public abstract void onCreate();
        public abstract android.view.textservice.SuggestionsInfo onGetSuggestions(android.view.textservice.TextInfo p0, int p1);
        public android.view.textservice.SuggestionsInfo[] onGetSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) { return null; }
        public android.view.textservice.SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) { return null; }
        public void onCancel() {}
        public void onClose() {}
        public java.lang.String getLocale() { return null; }
        public android.os.Bundle getBundle() { return null; }
    }

    private static class SentenceLevelAdapter {
        public static final android.view.textservice.SentenceSuggestionsInfo[] EMPTY_SENTENCE_SUGGESTIONS_INFOS = null;
        private static final android.view.textservice.SuggestionsInfo EMPTY_SUGGESTIONS_INFO = null;
        private final android.text.method.WordIterator mWordIterator = null;
        public SentenceLevelAdapter(java.util.Locale p0) {}
        private android.service.textservice.SpellCheckerService.SentenceLevelAdapter.SentenceTextInfoParams getSplitWords(android.view.textservice.TextInfo p0) { return null; }
        public static android.view.textservice.SentenceSuggestionsInfo reconstructSuggestions(android.service.textservice.SpellCheckerService.SentenceLevelAdapter.SentenceTextInfoParams p0, android.view.textservice.SuggestionsInfo[] p1) { return null; }

        public static class SentenceWordItem {
            public final android.view.textservice.TextInfo mTextInfo = null;
            public final int mStart = 0;
            public final int mLength = 0;
            public SentenceWordItem(android.view.textservice.TextInfo p0, int p1, int p2) {}
        }

        public static class SentenceTextInfoParams {
            final android.view.textservice.TextInfo mOriginalTextInfo = null;
            final java.util.ArrayList<android.service.textservice.SpellCheckerService.SentenceLevelAdapter.SentenceWordItem> mItems = null;
            final int mSize = 0;
            public SentenceTextInfoParams(android.view.textservice.TextInfo p0, java.util.ArrayList<android.service.textservice.SpellCheckerService.SentenceLevelAdapter.SentenceWordItem> p1) {}
        }
    }

    private static class InternalISpellCheckerSession extends com.android.internal.textservice.ISpellCheckerSession.Stub {
        private com.android.internal.textservice.ISpellCheckerSessionListener mListener;
        private final android.service.textservice.SpellCheckerService.Session mSession = null;
        private final java.lang.String mLocale = null;
        private final android.os.Bundle mBundle = null;
        public InternalISpellCheckerSession(java.lang.String p0, com.android.internal.textservice.ISpellCheckerSessionListener p1, android.os.Bundle p2, android.service.textservice.SpellCheckerService.Session p3) { super(); }
        public void onGetSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
        public void onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) {}
        public void onCancel() {}
        public void onClose() {}
        public java.lang.String getLocale() { return null; }
        public android.os.Bundle getBundle() { return null; }
    }
}
