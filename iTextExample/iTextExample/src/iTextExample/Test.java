/*
 * Test.java
 *
 * created at Jul 13, 2015 by g.lengarski <YOURMAILADDRESS>
 * 
 * $Id: eclipse-seeburger-codetemplates.xml,v 1.1 2005/03/04 15:02:28 UllrichPollaehne Exp www-data $
 *
 * Copyright (c) 2015 SEEBURGER AG, Germany. All Rights Reserved.
 */
package iTextExample;


import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.ElementFactory;
import com.itextpdf.text.pdf.PdfWriter;


public class Test
{
    /** Path to the resulting PDF file. */
    public static final String RESULT = "hello.pdf";


    /**
     * Creates a PDF file: hello.pdf
     * 
     * @param args no arguments needed
     */
    public static void main(String[] args)
        throws DocumentException, IOException
    {
        new Test().createPdf(RESULT);
        System.out.println("Done");
    }


    /**
     * Creates a PDF document.
     * 
     * @param filename the path to the new PDF document
     * @throws DocumentException
     * @throws IOException
     */
    public void createPdf(String filename)
        throws DocumentException, IOException
    {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3

        document.addTitle("Hello World example");
        document.addSubject("This example shows how to add metadata");
        document.addKeywords("Metadata, iText, step 3, tutorial");
        document.addCreator("My program using iText");
        document.addAuthor("Bruno Lowagie");
        document.addHeader("Expires", "0");

        document.open();
        // step 4
        Paragraph p = new Paragraph();

        p = new Paragraph("Hello World!");
        p.add("qwe");

        document.add(p);
        // step 5
        document.close();
    }
}
