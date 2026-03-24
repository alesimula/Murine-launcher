package android.speech.tts;

abstract class AbstractSynthesisCallback implements android.speech.tts.SynthesisCallback {
    protected final boolean mClientIsUsingV2 = false;
    AbstractSynthesisCallback(boolean p0) {}
    abstract void stop();
    int errorCodeOnStop() { return 0; }
}
