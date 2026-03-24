package android.util;

public class StateSet {
    private static final int[][] VIEW_STATE_SETS = null;
    public static final int VIEW_STATE_WINDOW_FOCUSED = 1;
    public static final int VIEW_STATE_SELECTED = 2;
    public static final int VIEW_STATE_FOCUSED = 4;
    public static final int VIEW_STATE_ENABLED = 8;
    public static final int VIEW_STATE_PRESSED = 16;
    public static final int VIEW_STATE_ACTIVATED = 32;
    public static final int VIEW_STATE_ACCELERATED = 64;
    public static final int VIEW_STATE_HOVERED = 128;
    public static final int VIEW_STATE_DRAG_CAN_ACCEPT = 256;
    public static final int VIEW_STATE_DRAG_HOVERED = 512;
    static final int[] VIEW_STATE_IDS = null;
    public static final int[] WILD_CARD = null;
    public static final int[] NOTHING = null;
    public static int[] get(int p0) { return null; }
    public StateSet() {}
    public static boolean isWildCard(int[] p0) { return false; }
    public static boolean stateSetMatches(int[] p0, int[] p1) { return false; }
    public static boolean stateSetMatches(int[] p0, int p1) { return false; }
    public static boolean containsAttribute(int[][] p0, int p1) { return false; }
    public static int[] trimStateSet(int[] p0, int p1) { return null; }
    public static java.lang.String dump(int[] p0) { return null; }
}
