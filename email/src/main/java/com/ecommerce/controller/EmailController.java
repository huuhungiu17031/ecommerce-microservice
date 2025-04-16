package com.ecommerce.controller;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    private final JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String systemEmail;

    @Autowired
    public EmailController(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @GetMapping("/test")
    public String sendTestEmail() {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(systemEmail);
            helper.setTo("user@example.com");
            helper.setSubject("Order Successfully Placed");
            String htmlContent = "<html>" +
                    "<head>" +
                    "<style>" +
                    "body { font-family: Arial, sans-serif; background-color: #f4f4f9; color: #333; padding: 20px; }" +
                    "h1 { color: #4CAF50; font-size: 24px; }" +
                    "p { font-size: 16px; line-height: 1.6; }" +
                    ".container { background-color: #ffffff; padding: 30px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); }" +
                    ".order-id { font-weight: bold; color: #4CAF50; }" +
                    ".footer { font-size: 14px; color: #777; text-align: center; padding-top: 20px; }" +
                    ".button { background-color: #4CAF50; color: white; padding: 12px 20px; border-radius: 5px; text-decoration: none; }" +
                    ".button:hover { background-color: #45a049; }" +
                    "</style>" +
                    "</head>" +
                    "<body>" +
                    "<div class=\"container\">" +
                    "<h1>Order Successful</h1>" +
                    "<p>Dear Customer,</p>" +
                    "<p>Thank you for your order! We are pleased to inform you that your order has been successfully placed.</p>" +
                    "<p><b>Order ID:</b> <span class=\"order-id\">123456789</span></p>" +
                    "<p>Your items will be shipped soon, and you will be notified once they are on their way.</p>" +
                    "<p>If you have any questions, feel free to contact our support team.</p>" +
                    "<a href=\"https://www.yoursite.com/orders\" class=\"button\">View Your Order</a>" +
                    "</div>" +
                    "<div class=\"footer\">" +
                    "<p>&copy; 2025 Your Company | All Rights Reserved</p>" +
                    "</div>" +
                    "</body>" +
                    "</html>";
            helper.setText(htmlContent, true);
            mailSender.send(mimeMessage);
            return "Email Sent Successfully!";
        } catch (MessagingException e) {
            return "Failed to send email: " + e.getMessage();
        }
    }
}
