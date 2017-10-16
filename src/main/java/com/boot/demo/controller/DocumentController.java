/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.demo.controller;

import com.boot.demo.handler.PDFHandler;
import com.itextpdf.text.DocumentException;
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
    
    	@RequestMapping(path = "documents", method = GET, produces = MediaType.APPLICATION_PDF_VALUE)
	ResponseEntity<?> submitPayment() throws DocumentException {

	        byte[] file = pdfHandler.createPDF();
                
		return new ResponseEntity<>(file, HttpStatus.OK);
	}
    
}
