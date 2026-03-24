package android.text;

public interface GraphicsOperations extends java.lang.CharSequence {
    public void drawText(android.graphics.BaseCanvas p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5);
    public void drawTextRun(android.graphics.BaseCanvas p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8);
    public float measureText(int p0, int p1, android.graphics.Paint p2);
    public int getTextWidths(int p0, int p1, float[] p2, android.graphics.Paint p3);
    public float getTextRunAdvances(int p0, int p1, int p2, int p3, boolean p4, float[] p5, int p6, android.graphics.Paint p7);
    public int getTextRunCursor(int p0, int p1, boolean p2, int p3, int p4, android.graphics.Paint p5);
}
