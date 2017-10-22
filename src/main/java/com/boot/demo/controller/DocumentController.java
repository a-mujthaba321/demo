/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.controller;

import com.boot.demo.handler.ExcelHandler;
import com.boot.demo.handler.PDFHandler;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ali Mujthaba
 */
@RestController
public class DocumentController {

    @Autowired
    private PDFHandler pdfHandler;
    
    @Autowired
    private ExcelHandler excelHandler;

    @RequestMapping(path = "documents", method = GET, produces = MediaType.APPLICATION_PDF_VALUE)
    ResponseEntity<?> submitPayment() throws DocumentException, BadElementException, IOException {

        byte[] file = pdfHandler.createPDF();

        return new ResponseEntity<>(file, HttpStatus.OK);
    }

    @RequestMapping(path = "documents/excel", method = GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    ResponseEntity<?> generateExcel()  {

        excelHandler.generateExcel();

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
