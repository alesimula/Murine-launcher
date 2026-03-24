package android.inputmethodservice;

@java.lang.Deprecated
public class Keyboard {
    static final java.lang.String TAG = "Keyboard";
    private static final java.lang.String TAG_KEYBOARD = "Keyboard";
    private static final java.lang.String TAG_ROW = "Row";
    private static final java.lang.String TAG_KEY = "Key";
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int EDGE_BOTTOM = 8;
    public static final int KEYCODE_SHIFT = -1;
    public static final int KEYCODE_MODE_CHANGE = -2;
    public static final int KEYCODE_CANCEL = -3;
    public static final int KEYCODE_DONE = -4;
    public static final int KEYCODE_DELETE = -5;
    public static final int KEYCODE_ALT = -6;
    private java.lang.CharSequence mLabel;
    private int mDefaultHorizontalGap;
    private int mDefaultWidth;
    private int mDefaultHeight;
    private int mDefaultVerticalGap;
    private boolean mShifted;
    private android.inputmethodservice.Keyboard.Key[] mShiftKeys;
    private int[] mShiftKeyIndices;
    private int mKeyWidth;
    private int mKeyHeight;
    private int mTotalHeight;
    private int mTotalWidth;
    private java.util.List<android.inputmethodservice.Keyboard.Key> mKeys;
    private java.util.List<android.inputmethodservice.Keyboard.Key> mModifierKeys;
    private int mDisplayWidth;
    private int mDisplayHeight;
    private int mKeyboardMode;
    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 5;
    private static final int GRID_SIZE = 50;
    private int mCellWidth;
    private int mCellHeight;
    private int[][] mGridNeighbors;
    private int mProximityThreshold;
    private static float SEARCH_DISTANCE;
    private java.util.ArrayList<android.inputmethodservice.Keyboard.Row> rows;
    public Keyboard(android.content.Context p0, int p1) {}
    public Keyboard(android.content.Context p0, int p1, int p2, int p3, int p4) {}
    public Keyboard(android.content.Context p0, int p1, int p2) {}
    public Keyboard(android.content.Context p0, int p1, java.lang.CharSequence p2, int p3, int p4) {}
    final void resize(int p0, int p1) {}
    public java.util.List<android.inputmethodservice.Keyboard.Key> getKeys() { return null; }
    public java.util.List<android.inputmethodservice.Keyboard.Key> getModifierKeys() { return null; }
    protected int getHorizontalGap() { return 0; }
    protected void setHorizontalGap(int p0) {}
    protected int getVerticalGap() { return 0; }
    protected void setVerticalGap(int p0) {}
    protected int getKeyHeight() { return 0; }
    protected void setKeyHeight(int p0) {}
    protected int getKeyWidth() { return 0; }
    protected void setKeyWidth(int p0) {}
    public int getHeight() { return 0; }
    public int getMinWidth() { return 0; }
    public boolean setShifted(boolean p0) { return false; }
    public boolean isShifted() { return false; }
    public int[] getShiftKeyIndices() { return null; }
    public int getShiftKeyIndex() { return 0; }
    private void computeNearestNeighbors() {}
    public int[] getNearestKeys(int p0, int p1) { return null; }
    protected android.inputmethodservice.Keyboard.Row createRowFromXml(android.content.res.Resources p0, android.content.res.XmlResourceParser p1) { return null; }
    protected android.inputmethodservice.Keyboard.Key createKeyFromXml(android.content.res.Resources p0, android.inputmethodservice.Keyboard.Row p1, int p2, int p3, android.content.res.XmlResourceParser p4) { return null; }
    private void loadKeyboard(android.content.Context p0, android.content.res.XmlResourceParser p1) {}
    private void skipToEndOfRow(android.content.res.XmlResourceParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void parseKeyboardAttributes(android.content.res.Resources p0, android.content.res.XmlResourceParser p1) {}
    static int getDimensionOrFraction(android.content.res.TypedArray p0, int p1, int p2, int p3) { return 0; }

    public static class Key {
        public int[] codes;
        public java.lang.CharSequence label;
        public android.graphics.drawable.Drawable icon;
        public android.graphics.drawable.Drawable iconPreview;
        public int width;
        public int height;
        public int gap;
        public boolean sticky;
        public int x;
        public int y;
        public boolean pressed;
        public boolean on;
        public java.lang.CharSequence text;
        public java.lang.CharSequence popupCharacters;
        public int edgeFlags;
        public boolean modifier;
        private android.inputmethodservice.Keyboard keyboard;
        public int popupResId;
        public boolean repeatable;
        private static final int[] KEY_STATE_NORMAL_ON = null;
        private static final int[] KEY_STATE_PRESSED_ON = null;
        private static final int[] KEY_STATE_NORMAL_OFF = null;
        private static final int[] KEY_STATE_PRESSED_OFF = null;
        private static final int[] KEY_STATE_NORMAL = null;
        private static final int[] KEY_STATE_PRESSED = null;
        public Key(android.inputmethodservice.Keyboard.Row p0) {}
        public Key(android.content.res.Resources p0, android.inputmethodservice.Keyboard.Row p1, int p2, int p3, android.content.res.XmlResourceParser p4) {}
        public void onPressed() {}
        public void onReleased(boolean p0) {}
        int[] parseCSV(java.lang.String p0) { return null; }
        public boolean isInside(int p0, int p1) { return false; }
        public int squaredDistanceFrom(int p0, int p1) { return 0; }
        public int[] getCurrentDrawableState() { return null; }
    }

    public static class Row {
        public int defaultWidth;
        public int defaultHeight;
        public int defaultHorizontalGap;
        public int verticalGap;
        java.util.ArrayList<android.inputmethodservice.Keyboard.Key> mKeys;
        public int rowEdgeFlags;
        public int mode;
        private android.inputmethodservice.Keyboard parent;
        public Row(android.inputmethodservice.Keyboard p0) {}
        public Row(android.content.res.Resources p0, android.inputmethodservice.Keyboard p1, android.content.res.XmlResourceParser p2) {}
    }
}
