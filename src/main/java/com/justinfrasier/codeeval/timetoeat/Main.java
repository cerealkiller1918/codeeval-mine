package com.justinfrasier.codeeval.timetoeat;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException, ParseException {
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(sort(line.trim()));
        }
    }

    public static String sort(String input) throws ParseException{
        String[] strings = input.split(" ");
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        List<Date> dates = new ArrayList<Date>();
        for (String s:strings) dates.add(format.parse(s));

        StringBuilder output = new StringBuilder();
        while(dates.size()>0) {
            int largeIndex = 0;
            long larger = dates.get(0).getTime();
            for (int i = 1; i < dates.size(); i++) {
                if (dates.get(i).getTime() > larger) {
                    largeIndex = i;
                    larger = dates.get(i).getTime();
                }
            }
            if(dates.size()>1) output.append(format.format(larger)+" ");
            else output.append(format.format(larger));
            dates.remove(largeIndex);
        }
        return output.toString();
    }
}
