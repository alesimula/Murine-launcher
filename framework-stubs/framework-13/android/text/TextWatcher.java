package android.text;

public interface TextWatcher extends android.text.NoCopySpan {
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3);
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3);
    public void afterTextChanged(android.text.Editable p0);
}
