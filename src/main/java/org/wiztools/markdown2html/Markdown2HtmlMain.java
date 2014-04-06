package org.wiztools.markdown2html;

import java.io.*;
import org.markdown4j.Markdown4jProcessor;

/**
 *
 * @author subwiz
 */
public class Markdown2HtmlMain {
    private static void printHelp(PrintStream out) {
        out.println("Usage: Input is read from STDIN and output written to STDOUT.");
        out.println();
    }
    
    public static void main(String[] arg) throws IOException {
        printHelp(System.err);
        Reader in = new InputStreamReader(System.in);
        String out = new Markdown4jProcessor().process(in);
        System.out.print(out);
    }
}
