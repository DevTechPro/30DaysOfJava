package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        readFromFile();
        workingWithCollection();
    }

    private static void readFromFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("students.text"));
        List<String> students = new ArrayList<String>();
        while (in.hasNextLine()) {
            students.add(in.nextLine());
        }

        for (String student : students) {
            System.out.println(student);
        }

        in.close();
    }

    private static void workingWithCollection(){
        LinkedList<String> names = new LinkedList<String>();
        names.push("David");
        names.push("Beatrice");

        System.out.println(names.remove());
        System.out.println(names.remove());
    }
}
