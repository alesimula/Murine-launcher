package android.text.method;

public interface OffsetMapping {
    public static final int MAP_STRATEGY_CHARACTER = 0;
    public static final int MAP_STRATEGY_CURSOR = 1;
    public int originalToTransformed(int p0, int p1);
    public int transformedToOriginal(int p0, int p1);
    public void originalToTransformed(android.text.method.OffsetMapping.TextUpdate p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MapStrategy {
    }

    public static class TextUpdate {
        public int where;
        public int before;
        public int after;
        public TextUpdate(int p0, int p1, int p2) {}
    }
}
