package com.dispatcher.services;

import com.dispatcher.model.IdCardFormData;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class PdfGeneratorService {

    private final TemplateEngine templateEngine;

    public PdfGeneratorService(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public byte[] generatePdfFromTemplate(String templateName, IdCardFormData idCardFormData) throws Exception {
        Context context = new Context();
        context.setVariable("name",idCardFormData.getName());
        context.setVariable("address",idCardFormData.getAddress());
        context.setVariable("dob",idCardFormData.getDob());
        context.setVariable("employeeId",idCardFormData.getEmployeeId());

        String htmlContent = templateEngine.process(templateName, context);
        return generatePdfFromHtml(htmlContent);
    }

    private byte[] generatePdfFromHtml(String htmlContent) throws IOException, com.lowagie.text.DocumentException {
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(htmlContent);
        renderer.layout();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        renderer.createPDF(outputStream);
        renderer.finishPDF();

        return outputStream.toByteArray();
    }
}