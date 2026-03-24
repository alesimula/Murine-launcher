package android.service.textservice;

public abstract class SpellCheckerService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.textservice.SpellCheckerService";
    public SpellCheckerService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.service.textservice.SpellCheckerService.Session createSession();

    private static class InternalISpellCheckerSession extends com.android.internal.textservice.ISpellCheckerSession.Stub {
        public InternalISpellCheckerSession(java.lang.String p0, com.android.internal.textservice.ISpellCheckerSessionListener p1, android.os.Bundle p2, android.service.textservice.SpellCheckerService.Session p3, int p4) { super(); }
        public void onGetSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
        public void onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) {}
        public void onCancel() {}
        public void onClose() {}
        public java.lang.String getLocale() { return null; }
        public android.os.Bundle getBundle() { return null; }
        public int getSupportedAttributes() { return 0; }
    }

    private static class SentenceLevelAdapter {
        public static final android.view.textservice.SentenceSuggestionsInfo[] EMPTY_SENTENCE_SUGGESTIONS_INFOS = null;
        public SentenceLevelAdapter(java.util.Locale p0) {}
        public static android.view.textservice.SentenceSuggestionsInfo reconstructSuggestions(android.service.textservice.SpellCheckerService.SentenceLevelAdapter.SentenceTextInfoParams p0, android.view.textservice.SuggestionsInfo[] p1) { return null; }

        public static class SentenceTextInfoParams {
            final android.view.textservice.TextInfo mOriginalTextInfo = null;
            final java.util.ArrayList<android.service.textservice.SpellCheckerService.SentenceLevelAdapter.SentenceWordItem> mItems = null;
            final int mSize = 0;
            public SentenceTextInfoParams(android.view.textservice.TextInfo p0, java.util.ArrayList<android.service.textservice.SpellCheckerService.SentenceLevelAdapter.SentenceWordItem> p1) {}
        }

        public static class SentenceWordItem {
            public final android.view.textservice.TextInfo mTextInfo = null;
            public final int mStart = 0;
            public final int mLength = 0;
            public SentenceWordItem(android.view.textservice.TextInfo p0, int p1, int p2) {}
        }
    }

    public static abstract class Session {
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
        public int getSupportedAttributes() { return 0; }
    }

    private static class SpellCheckerServiceBinder extends com.android.internal.textservice.ISpellCheckerService.Stub {
        public SpellCheckerServiceBinder(android.service.textservice.SpellCheckerService p0) { super(); }
        public void getISpellCheckerSession(java.lang.String p0, com.android.internal.textservice.ISpellCheckerSessionListener p1, android.os.Bundle p2, int p3, com.android.internal.textservice.ISpellCheckerServiceCallback p4) {}
    }
}
