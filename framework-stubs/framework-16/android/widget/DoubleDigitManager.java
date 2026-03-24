package android.widget;

class DoubleDigitManager {
    public DoubleDigitManager(long p0, android.widget.DoubleDigitManager.CallBack p1) {}
    public void reportDigit(int p0) {}

    static interface CallBack {
        public boolean singleDigitIntermediate(int p0);
        public void singleDigitFinal(int p0);
        public boolean twoDigitsFinal(int p0, int p1);
    }
}
