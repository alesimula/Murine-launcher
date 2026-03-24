package android.renderscript;

public class Script extends android.renderscript.BaseObj {
    private final android.util.SparseArray<android.renderscript.Script.KernelID> mKIDs = null;
    private final android.util.SparseArray<android.renderscript.Script.InvokeID> mIIDs = null;
    private final android.util.SparseArray<android.renderscript.Script.FieldID> mFIDs = null;
    long[] mInIdsBuffer;
    protected android.renderscript.Script.KernelID createKernelID(int p0, int p1, android.renderscript.Element p2, android.renderscript.Element p3) { return null; }
    protected android.renderscript.Script.InvokeID createInvokeID(int p0) { return null; }
    protected android.renderscript.Script.FieldID createFieldID(int p0, android.renderscript.Element p1) { return null; }
    protected void invoke(int p0) {}
    protected void invoke(int p0, android.renderscript.FieldPacker p1) {}
    protected void forEach(int p0, android.renderscript.Allocation p1, android.renderscript.Allocation p2, android.renderscript.FieldPacker p3) {}
    protected void forEach(int p0, android.renderscript.Allocation p1, android.renderscript.Allocation p2, android.renderscript.FieldPacker p3, android.renderscript.Script.LaunchOptions p4) {}
    protected void forEach(int p0, android.renderscript.Allocation[] p1, android.renderscript.Allocation p2, android.renderscript.FieldPacker p3) {}
    protected void forEach(int p0, android.renderscript.Allocation[] p1, android.renderscript.Allocation p2, android.renderscript.FieldPacker p3, android.renderscript.Script.LaunchOptions p4) {}
    protected void reduce(int p0, android.renderscript.Allocation[] p1, android.renderscript.Allocation p2, android.renderscript.Script.LaunchOptions p3) {}
    Script(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public void bindAllocation(android.renderscript.Allocation p0, int p1) {}
    public void setVar(int p0, float p1) {}
    public float getVarF(int p0) { return 0.0f; }
    public void setVar(int p0, double p1) {}
    public double getVarD(int p0) { return 0.0; }
    public void setVar(int p0, int p1) {}
    public int getVarI(int p0) { return 0; }
    public void setVar(int p0, long p1) {}
    public long getVarJ(int p0) { return 0L; }
    public void setVar(int p0, boolean p1) {}
    public boolean getVarB(int p0) { return false; }
    public void setVar(int p0, android.renderscript.BaseObj p1) {}
    public void setVar(int p0, android.renderscript.FieldPacker p1) {}
    public void setVar(int p0, android.renderscript.FieldPacker p1, android.renderscript.Element p2, int[] p3) {}
    public void getVarV(int p0, android.renderscript.FieldPacker p1) {}
    public void setTimeZone(java.lang.String p0) {}

    public static class Builder {
        android.renderscript.RenderScript mRS;
        Builder(android.renderscript.RenderScript p0) {}
    }

    public static class FieldBase {
        protected android.renderscript.Element mElement;
        protected android.renderscript.Allocation mAllocation;
        protected void init(android.renderscript.RenderScript p0, int p1) {}
        protected void init(android.renderscript.RenderScript p0, int p1, int p2) {}
        protected FieldBase() {}
        public android.renderscript.Element getElement() { return null; }
        public android.renderscript.Type getType() { return null; }
        public android.renderscript.Allocation getAllocation() { return null; }
        public void updateAllocation() {}
    }

    public static final class FieldID extends android.renderscript.BaseObj {
        android.renderscript.Script mScript;
        int mSlot;
        FieldID(long p0, android.renderscript.RenderScript p1, android.renderscript.Script p2, int p3) { super(0L, null); }
    }

    public static final class InvokeID extends android.renderscript.BaseObj {
        android.renderscript.Script mScript;
        int mSlot;
        InvokeID(long p0, android.renderscript.RenderScript p1, android.renderscript.Script p2, int p3) { super(0L, null); }
    }

    public static final class KernelID extends android.renderscript.BaseObj {
        android.renderscript.Script mScript;
        int mSlot;
        int mSig;
        KernelID(long p0, android.renderscript.RenderScript p1, android.renderscript.Script p2, int p3, int p4) { super(0L, null); }
    }

    public static final class LaunchOptions {
        private int xstart;
        private int ystart;
        private int xend;
        private int yend;
        private int zstart;
        private int zend;
        private int strategy;
        public LaunchOptions() {}
        public android.renderscript.Script.LaunchOptions setX(int p0, int p1) { return null; }
        public android.renderscript.Script.LaunchOptions setY(int p0, int p1) { return null; }
        public android.renderscript.Script.LaunchOptions setZ(int p0, int p1) { return null; }
        public int getXStart() { return 0; }
        public int getXEnd() { return 0; }
        public int getYStart() { return 0; }
        public int getYEnd() { return 0; }
        public int getZStart() { return 0; }
        public int getZEnd() { return 0; }
    }
}
