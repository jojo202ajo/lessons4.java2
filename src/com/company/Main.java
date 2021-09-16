package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> nameA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("вводите имя (Если вы в списке А)");
        while (nameA.size() <= 4) {
            String Nameuser  = scanner.nextLine();
            nameA.add(Nameuser);
        }
        ArrayList<String> nameB = new ArrayList<>();
        System.out.println("вводите имя (Если вы  в списке В)");
        while (nameB.size() <= 4){
            String Nameuser  = scanner.nextLine();
            nameB.add(Nameuser);
        }
        Collections.reverse(nameB);

        ArrayList<String> spisocC = new ArrayList();
        int zero = 0;
        while (spisocC.size()< nameA.size() + nameB.size()){
            spisocC.add(nameA.get(zero));
            spisocC.add(nameB.get(zero));
            zero++;
        }

        System.out.println(spisocC);
        spisocC.sort(Comparator.comparing(String::length));
        System.out.println(spisocC);


    }
}
