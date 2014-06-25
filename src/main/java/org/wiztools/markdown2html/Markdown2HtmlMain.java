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
    
    public static void main(String[] args) throws IOException {
        for(String arg: args) {
            switch(arg) {
                case "-h":
                case "--help":
                    printHelp(System.out);
                    System.exit(0);
            }
        }

        // Do the conversion:
        Reader in = new InputStreamReader(System.in);
        String out = new Markdown4jProcessor().process(in);
        System.out.print(out);
    }
}
