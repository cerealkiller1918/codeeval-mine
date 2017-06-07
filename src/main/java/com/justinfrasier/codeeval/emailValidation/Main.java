package com.justinfrasier.codeeval.emailValidation;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String test = line.trim();
            System.out.println(emailChecker(test));
        }
    }

    public static String emailChecker(String input) {
        String test = "^[_A-Za-z0-9-\\.\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$|" +
                "^\"[_A-Za-z0-9-\\.\\+@]+(\\.[_A-Za-z0-9-]+)*\"@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(test);
        return String.valueOf(pattern.matcher(input).matches());
    }
}
