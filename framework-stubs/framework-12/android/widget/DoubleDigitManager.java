package android.widget;

class DoubleDigitManager {
    private final long timeoutInMillis = 0L;
    private final android.widget.DoubleDigitManager.CallBack mCallBack = null;
    private java.lang.Integer intermediateDigit;
    public DoubleDigitManager(long p0, android.widget.DoubleDigitManager.CallBack p1) {}
    public void reportDigit(int p0) {}

    static interface CallBack {
        public boolean singleDigitIntermediate(int p0);
        public void singleDigitFinal(int p0);
        public boolean twoDigitsFinal(int p0, int p1);
    }
}
