package android.speech.tts;

public interface ITextToSpeechService extends android.os.IInterface {
    public int speak(android.os.IBinder p0, java.lang.CharSequence p1, int p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException;
    public int synthesizeToFileDescriptor(android.os.IBinder p0, java.lang.CharSequence p1, android.os.ParcelFileDescriptor p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException;
    public int playAudio(android.os.IBinder p0, android.net.Uri p1, int p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException;
    public int playSilence(android.os.IBinder p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isSpeaking() throws android.os.RemoteException;
    public int stop(android.os.IBinder p0) throws android.os.RemoteException;
    public java.lang.String[] getLanguage() throws android.os.RemoteException;
    public java.lang.String[] getClientDefaultLanguage() throws android.os.RemoteException;
    public int isLanguageAvailable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String[] getFeaturesForLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int loadLanguage(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void setCallback(android.os.IBinder p0, android.speech.tts.ITextToSpeechCallback p1) throws android.os.RemoteException;
    public java.util.List<android.speech.tts.Voice> getVoices() throws android.os.RemoteException;
    public int loadVoice(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getDefaultVoiceNameFor(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechService {
        private static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechService";
        static final int TRANSACTION_speak = 1;
        static final int TRANSACTION_synthesizeToFileDescriptor = 2;
        static final int TRANSACTION_playAudio = 3;
        static final int TRANSACTION_playSilence = 4;
        static final int TRANSACTION_isSpeaking = 5;
        static final int TRANSACTION_stop = 6;
        static final int TRANSACTION_getLanguage = 7;
        static final int TRANSACTION_getClientDefaultLanguage = 8;
        static final int TRANSACTION_isLanguageAvailable = 9;
        static final int TRANSACTION_getFeaturesForLanguage = 10;
        static final int TRANSACTION_loadLanguage = 11;
        static final int TRANSACTION_setCallback = 12;
        static final int TRANSACTION_getVoices = 13;
        static final int TRANSACTION_loadVoice = 14;
        static final int TRANSACTION_getDefaultVoiceNameFor = 15;
        public Stub() { super(); }
        public static android.speech.tts.ITextToSpeechService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.speech.tts.ITextToSpeechService p0) { return false; }
        public static android.speech.tts.ITextToSpeechService getDefaultImpl() { return null; }

        private static class Proxy implements android.speech.tts.ITextToSpeechService {
            private android.os.IBinder mRemote;
            public static android.speech.tts.ITextToSpeechService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int speak(android.os.IBinder p0, java.lang.CharSequence p1, int p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public int synthesizeToFileDescriptor(android.os.IBinder p0, java.lang.CharSequence p1, android.os.ParcelFileDescriptor p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public int playAudio(android.os.IBinder p0, android.net.Uri p1, int p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public int playSilence(android.os.IBinder p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public boolean isSpeaking() throws android.os.RemoteException { return false; }
            public int stop(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public java.lang.String[] getLanguage() throws android.os.RemoteException { return null; }
            public java.lang.String[] getClientDefaultLanguage() throws android.os.RemoteException { return null; }
            public int isLanguageAvailable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.lang.String[] getFeaturesForLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int loadLanguage(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void setCallback(android.os.IBinder p0, android.speech.tts.ITextToSpeechCallback p1) throws android.os.RemoteException {}
            public java.util.List<android.speech.tts.Voice> getVoices() throws android.os.RemoteException { return null; }
            public int loadVoice(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public java.lang.String getDefaultVoiceNameFor(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.speech.tts.ITextToSpeechService {
        public Default() {}
        public int speak(android.os.IBinder p0, java.lang.CharSequence p1, int p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public int synthesizeToFileDescriptor(android.os.IBinder p0, java.lang.CharSequence p1, android.os.ParcelFileDescriptor p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public int playAudio(android.os.IBinder p0, android.net.Uri p1, int p2, android.os.Bundle p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public int playSilence(android.os.IBinder p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public boolean isSpeaking() throws android.os.RemoteException { return false; }
        public int stop(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public java.lang.String[] getLanguage() throws android.os.RemoteException { return null; }
        public java.lang.String[] getClientDefaultLanguage() throws android.os.RemoteException { return null; }
        public int isLanguageAvailable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.lang.String[] getFeaturesForLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int loadLanguage(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void setCallback(android.os.IBinder p0, android.speech.tts.ITextToSpeechCallback p1) throws android.os.RemoteException {}
        public java.util.List<android.speech.tts.Voice> getVoices() throws android.os.RemoteException { return null; }
        public int loadVoice(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public java.lang.String getDefaultVoiceNameFor(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
