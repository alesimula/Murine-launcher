package android.telephony;

public class PhoneNumberFormattingTextWatcher implements android.text.TextWatcher {
    private boolean mSelfChange;
    private boolean mStopFormatting;
    public PhoneNumberFormattingTextWatcher() {}
    public PhoneNumberFormattingTextWatcher(java.lang.String p0) {}
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public synchronized void afterTextChanged(android.text.Editable p0) {}
    private java.lang.String reformat(java.lang.CharSequence p0, int p1) { return null; }
    private java.lang.String getFormattedNumber(char p0, boolean p1) { return null; }
    private void stopFormatting() {}
    private boolean hasSeparator(java.lang.CharSequence p0, int p1, int p2) { return false; }
}
