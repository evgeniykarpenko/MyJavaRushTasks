package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()) {
            String s = reader.readLine();
            String name;
            String digits;

            if (s.length() > 0 ) {
                int indexofDigit = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isDigit(s.charAt(i))) {
                        indexofDigit = i;
                        break;
                    }
                }
                name = s.substring(0, indexofDigit-1);
                digits = s.substring(indexofDigit);

                DateFormat df = new SimpleDateFormat("dd MM yyyy");
                PEOPLE.add(new Person(name,df.parse(digits)));



            }
        }


        reader.close();
    }
}
