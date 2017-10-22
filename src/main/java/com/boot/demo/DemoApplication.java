package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args)  {
        SpringApplication.run(DemoApplication.class, args);
    }


}

//generatePDF();
//    public static void generatePDF() {
//        Document document = new Document();
//        String FILE_NAME = "C://Users/NCIT/Documents/pdfDocs/";
//        try {
//
//            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME + UUID.randomUUID() + ".pdf")));
//
//            //open
//            document.open();
//
//            Paragraph p = new Paragraph();
//            p.add("Hello James");
//            p.setAlignment(Element.ALIGN_CENTER);
//
//            document.add(p);
//
//            Paragraph p2 = new Paragraph();
//            p2.add("This is my paragraph 2"); //no alignment
//
//            document.add(p2);
//
//            Font f = new Font();
//            f.setStyle(Font.BOLD);
//            f.setSize(8);
//
//            document.add(new Paragraph("This is my paragraph 3", f));
//
//            //close
//            document.close();
//
//            System.out.println("Done");
//
//        } catch (FileNotFoundException | DocumentException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
