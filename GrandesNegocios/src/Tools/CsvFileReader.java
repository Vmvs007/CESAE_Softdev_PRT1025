package Tools;

import Models.Sale;
import Models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvFileReader {

    public static ArrayList<User> readUsersCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<User> usersArray = new ArrayList<User>();

        File usersFile = new File(filePath);
        Scanner fileScanner = new Scanner(usersFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(";");

            String newUserType = separatedLine[0];
            String newUsername = separatedLine[1];
            String newUserPassword = separatedLine[2];

            User newUser = new User(newUserType,newUsername,newUserPassword);
            usersArray.add(newUser);

        }

        return usersArray;
    }

    public static ArrayList<Sale> readSalesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Sale> salesArray = new ArrayList<Sale>();

        File salesFile = new File(filePath);
        Scanner fileScanner = new Scanner(salesFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newProductCategory = separatedLine[0];
            String newProductName = separatedLine[1];
            double newProductQuantity = Double.parseDouble(separatedLine[2]);
            double newProductPrice = Double.parseDouble(separatedLine[3]);

            Sale newSale = new Sale(newProductCategory,newProductName,newProductQuantity,newProductPrice);
            salesArray.add(newSale);

        }

        return salesArray;
    }

}
