package writer.string;

import writer.Writer;

public class StringWriter implements Writer {
    private final StringBuilder sb;

    public StringWriter() {
        this.sb = new StringBuilder();
    }

    @Override
    public void writeChar(char ch) {
        sb.append(ch);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    @Override
    public void close() throws Exception {

    }
}
