package android.speech.tts;

public final class SynthesisRequest {
    private final java.lang.CharSequence mText = null;
    private final android.os.Bundle mParams = null;
    private java.lang.String mVoiceName;
    private java.lang.String mLanguage;
    private java.lang.String mCountry;
    private java.lang.String mVariant;
    private int mSpeechRate;
    private int mPitch;
    private int mCallerUid;
    public SynthesisRequest(java.lang.String p0, android.os.Bundle p1) {}
    public SynthesisRequest(java.lang.CharSequence p0, android.os.Bundle p1) {}
    @java.lang.Deprecated
    public java.lang.String getText() { return null; }
    public java.lang.CharSequence getCharSequenceText() { return null; }
    public java.lang.String getVoiceName() { return null; }
    public java.lang.String getLanguage() { return null; }
    public java.lang.String getCountry() { return null; }
    public java.lang.String getVariant() { return null; }
    public int getSpeechRate() { return 0; }
    public int getPitch() { return 0; }
    public android.os.Bundle getParams() { return null; }
    public int getCallerUid() { return 0; }
    void setLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    void setVoiceName(java.lang.String p0) {}
    void setSpeechRate(int p0) {}
    void setPitch(int p0) {}
    void setCallerUid(int p0) {}
}
