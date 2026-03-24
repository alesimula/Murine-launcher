package android.filterfw.io;

public class TextGraphReader extends android.filterfw.io.GraphReader {
    public TextGraphReader() { super(); }
    public android.filterfw.core.FilterGraph readGraphString(java.lang.String p0) throws android.filterfw.io.GraphIOException { return null; }
    public android.filterfw.core.KeyValueMap readKeyValueAssignments(java.lang.String p0) throws android.filterfw.io.GraphIOException { return null; }

    private class AddLibraryCommand implements android.filterfw.io.TextGraphReader.Command {
        public AddLibraryCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1) {}
        public void execute(android.filterfw.io.TextGraphReader p0) {}
    }

    private class AllocateFilterCommand implements android.filterfw.io.TextGraphReader.Command {
        public AllocateFilterCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1, java.lang.String p2) {}
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException {}
    }

    private static interface Command {
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException;
    }

    private class ConnectCommand implements android.filterfw.io.TextGraphReader.Command {
        public ConnectCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
        public void execute(android.filterfw.io.TextGraphReader p0) {}
    }

    private class ImportPackageCommand implements android.filterfw.io.TextGraphReader.Command {
        public ImportPackageCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1) {}
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException {}
    }

    private class InitFilterCommand implements android.filterfw.io.TextGraphReader.Command {
        public InitFilterCommand(android.filterfw.io.TextGraphReader p0, android.filterfw.core.KeyValueMap p1) {}
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException {}
    }
}
