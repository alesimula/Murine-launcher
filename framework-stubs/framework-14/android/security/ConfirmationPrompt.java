package android.security;

public class ConfirmationPrompt {
    public void presentPrompt(java.util.concurrent.Executor p0, android.security.ConfirmationCallback p1) throws android.security.ConfirmationAlreadyPresentingException, android.security.ConfirmationNotAvailableException {}
    public void cancelPrompt() {}
    public static boolean isSupported(android.content.Context p0) { return false; }

    public static final class Builder {
        public Builder(android.content.Context p0) {}
        public android.security.ConfirmationPrompt.Builder setPromptText(java.lang.CharSequence p0) { return null; }
        public android.security.ConfirmationPrompt.Builder setExtraData(byte[] p0) { return null; }
        public android.security.ConfirmationPrompt build() { return null; }
    }
}
