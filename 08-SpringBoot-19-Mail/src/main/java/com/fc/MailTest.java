package com.fc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@SpringBootTest
public class MailTest {
    //从容器中获取邮件发送对象
    @Autowired
    private JavaMailSender sender;

    @Test
    void testHtmlMail(){
        //创建一个邮件对象
        MimeMessage mimeMessage=sender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        try {
            helper.setFrom("1808791639@qq.com");
            //设置发生的时间(定时邮件)
            mimeMessage.setSentDate(new Date());

            helper.setTo(new String[]{
                    "3255757442@qq.com",
                    "1808791639@qq.com",
                    "877875806@qq.com",
                    "3022941680@qq.com"
            });

            helper.setCc(new String[]{
                    "3022941680@qq.com",
                    "2084145913@qq.com"
            });

            helper.setBcc("3513972901@qq.com");

            helper.setSubject("重金求子");

            helper.setText("给你一个大嘴巴子",true);

            sender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testSimple() {
        //简单的邮件消息（信息）
        SimpleMailMessage message = new SimpleMailMessage();
        //发送人
        message.setFrom("1808791639@qq.com");
        //接收者
        message.setTo("3255757442@qq.com",
                "1808791639@qq.com",
                "877875806@qq.com",
                "3022941680@qq.com");
        //抄送人
        message.setCc("3022941680@qq.com",
                "2084145913@qq.com");
        //秘密抄送，只有发送人和密抄者能够看到
        message.setBcc("1808791639@qq.com");
        //邮件主题
        message.setSubject("sorry，您的手机已欠费，请您去交话费！");

        message.setText("由于您不交话费，您已成为失信人员，我们将注销您的号码！");
        //发送邮件
        sender.send(message);
    }
}
