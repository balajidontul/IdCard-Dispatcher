package com.dispatcher.controller;


import com.dispatcher.model.IdCardFormData;
import com.dispatcher.services.PdfGeneratorService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PdfController {

    private final PdfGeneratorService pdfGeneratorService;

    public PdfController(PdfGeneratorService pdfGeneratorService) {
        this.pdfGeneratorService = pdfGeneratorService;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("formData", new IdCardFormData());
        return "id-card-form";
    }

    @GetMapping("/generate-id-card")
    public ResponseEntity<byte[]> generatePdf(@ModelAttribute IdCardFormData idCardFormData ) throws Exception {

        byte[] pdfBytes = pdfGeneratorService.generatePdfFromTemplate("id-card-result", idCardFormData);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
//        headers.setContentDispositionFormData("inline", "sample.pdf");

        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
    }
}

