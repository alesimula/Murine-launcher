package android.view.textservice;

public class SpellCheckerSession {
    public static final java.lang.String SERVICE_META_DATA = "android.view.textservice.scs";
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

    public static interface SpellCheckerSessionListener {
        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0);
        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0);
    }

    public static class SpellCheckerSessionParams {
        @android.annotation.SuppressLint("UseIcu")
        public java.util.Locale getLocale() { return null; }
        public boolean shouldReferToSpellCheckerLanguageSettings() { return false; }
        public int getSupportedAttributes() { return 0; }
        public android.os.Bundle getExtras() { return null; }

        public static final class Builder {
            public Builder() {}
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams build() { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setLocale(java.util.Locale p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setShouldReferToSpellCheckerLanguageSettings(boolean p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setSupportedAttributes(int p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setExtras(android.os.Bundle p0) { return null; }
        }
    }

    private static final class InternalListener extends com.android.internal.textservice.ITextServicesSessionListener.Stub {
        public InternalListener(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl p0) { super(); }
        public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) {}
    }

    private static final class SpellCheckerSessionListenerImpl extends com.android.internal.textservice.ISpellCheckerSessionListener.Stub {
        SpellCheckerSessionListenerImpl(android.view.textservice.SpellCheckerSession p0) { super(); }
        public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) {}
        public void cancel() {}
        public void getSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
        public void getSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) {}
        public void close() {}
        public boolean isDisconnected() { return false; }
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
