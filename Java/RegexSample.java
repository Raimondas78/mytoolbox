package day5;

import com.ibm.dtfj.javacore.parser.framework.scanner.IScanner;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {

    public static void main(String[] args) {

        List<String> pinCodes = new ArrayList();
        pinCodes.add("1234");
        pinCodes.add("9999");

        //Invalid pins
        pinCodes.add("-1234");
        pinCodes.add("12345");
        pinCodes.add("99a9");

        String pinCodeRegex = "^[0-9][0-9][0-9][0-9]$";
        Pattern pattern = Pattern.compile(pinCodeRegex);

        for(String pin : pinCodes){
            Matcher matcher = pattern.matcher(pin);
            System.out.println(pin +" : "+ matcher.matches());
        }

        List<String> emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

        //Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

        pattern = Pattern.compile(emailRegex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
