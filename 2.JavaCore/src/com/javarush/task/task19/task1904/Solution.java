package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {


    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String person = fileScanner.nextLine();
            String[] personAttrib = person.split(" ", 4);
            String firstName = personAttrib[1];
            String lastName = personAttrib[0];
            String middleName = personAttrib[2];
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date dob = new Date();
            try {

                dob = sdf.parse(personAttrib[3]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(firstName, middleName, lastName, dob);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
