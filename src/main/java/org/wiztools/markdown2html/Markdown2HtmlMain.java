package org.wiztools.markdown2html;

import java.io.*;
import org.tautua.markdownpapers.Markdown;
import org.tautua.markdownpapers.parser.ParseException;

/**
 *
 * @author subwiz
 */
public class Markdown2HtmlMain {
    private static void printHelp(PrintStream out) {
        out.println("Usage: Input is read from STDIN and output written to STDOUT.");
        out.println();
    }
    
    public static void main(String[] arg) throws ParseException, IOException {
        printHelp(System.err);
        Reader in = new InputStreamReader(System.in);
        Writer out = new OutputStreamWriter(System.out);
        Markdown md = new Markdown();
        md.transform(in, out);
        out.flush();
        out.close();
    }
}
