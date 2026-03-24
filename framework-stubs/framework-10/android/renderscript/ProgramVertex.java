package android.renderscript;

public class ProgramVertex extends android.renderscript.Program {
    ProgramVertex(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public int getInputCount() { return 0; }
    public android.renderscript.Element getInput(int p0) { return null; }

    public static class Builder extends android.renderscript.Program.BaseProgramBuilder {
        @android.annotation.UnsupportedAppUsage
        public Builder(android.renderscript.RenderScript p0) { super(null); }
        @android.annotation.UnsupportedAppUsage
        public android.renderscript.ProgramVertex.Builder addInput(android.renderscript.Element p0) throws java.lang.IllegalStateException { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.renderscript.ProgramVertex create() { return null; }
    }
}
