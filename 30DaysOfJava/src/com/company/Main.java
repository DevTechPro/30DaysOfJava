package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       // readFromFile();
        //workingWithCollection();
        //twoDimensionArray();
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

    private static void twoDimensionArray(){
        int[][] numbers = {
                {12,23,67,32,6},
                {5,5,45,56,423,86,56,23,95},
                {45,1,52,89,54,3,0}
        };
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
