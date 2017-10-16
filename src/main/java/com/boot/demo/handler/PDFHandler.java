/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.handler;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ali Mujthaba
 */
@Configuration
public class PDFHandler {

    public static final String IMG = "src/main/resources/static/arms.png";

    public byte[] createPDF() throws DocumentException, BadElementException, IOException {
        Document document = new Document();

        Image image = Image.getInstance(IMG);
        image.setAlignment(Image.ALIGN_CENTER);
        image.scaleToFit(50, 50);

        Font tfont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font tfont2 = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PdfWriter.getInstance(document, byteArrayOutputStream);

        //open
        document.open();

        document.add(image);

        Paragraph p = new Paragraph();
        p.add("Department of Higher Education");
        p.setAlignment(Element.ALIGN_LEFT);
        p.add(new Phrase("Payment Receipt", tfont2));

        document.add(Chunk.NEWLINE);

        document.add(new Phrase("Department of Higher Education"));
        document.add(Chunk.NEWLINE);
        document.add(new Phrase("Republic of Maldives"));
        document.add(Chunk.NEWLINE);

        PdfPTable table2 = new PdfPTable(new float[]{1, 2, 1, 2});
        table2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

        table2.setWidthPercentage(100);
        table2.addCell(new Phrase("Student Name:", tfont));
        table2.addCell(new Phrase("Ali Mujuthaba Saeed Ahmed", tfont2));
        table2.addCell(new Phrase("Loan Scheme", tfont));
        table2.addCell(new Phrase("New Student Loan Scheme", tfont2));

        document.add(table2);
        document.add(Chunk.NEWLINE);

        table2 = new PdfPTable(new float[]{2, 1});
        table2.getDefaultCell().setPadding(3);
        table2.setWidthPercentage(100);
        table2.addCell(new Phrase("Detail", tfont));
        table2.addCell(new Phrase("Total", tfont));
        PdfPCell cell = new PdfPCell(new Phrase("Menge", tfont));
        cell.setRowspan(2);
        table2.addCell(cell);
        cell = new PdfPCell(new Phrase("AAA", tfont));
        cell.setRowspan(2);
        table2.addCell(cell);

        document.add(table2);

        Paragraph p2 = new Paragraph();
        //p2.add("This is my paragraph 2"); //no alignment

        document.add(p2);

        Font f = new Font();
        f.setStyle(Font.BOLD);
        f.setSize(8);

        //document.add(new Paragraph("This is my paragraph 3", f));
        //close
        document.close();

        return byteArrayOutputStream.toByteArray();

    }

}
