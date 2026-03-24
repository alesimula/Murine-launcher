package android.media;

class Tokenizer {
    Tokenizer(android.media.Tokenizer.OnTokenListener p0) {}
    void reset() {}
    void tokenize(java.lang.String p0) {}

    class DataTokenizer implements android.media.Tokenizer.TokenizerPhase {
        DataTokenizer(android.media.Tokenizer p0) {}
        public android.media.Tokenizer.TokenizerPhase start() { return null; }
        public void tokenize() {}
    }

    static interface OnTokenListener {
        public void onData(java.lang.String p0);
        public void onStart(java.lang.String p0, java.lang.String[] p1, java.lang.String p2);
        public void onEnd(java.lang.String p0);
        public void onTimeStamp(long p0);
        public void onLineEnd();
    }

    class TagTokenizer implements android.media.Tokenizer.TokenizerPhase {
        TagTokenizer(android.media.Tokenizer p0) {}
        public android.media.Tokenizer.TokenizerPhase start() { return null; }
        public void tokenize() {}
    }

    static interface TokenizerPhase {
        public android.media.Tokenizer.TokenizerPhase start();
        public void tokenize();
    }
}
