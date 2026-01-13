package Repositories;

import Models.User;
import Tools.CsvFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {

    private ArrayList<User> usersArrayList;

    public UsersRepository() throws FileNotFoundException {
        this.usersArrayList = CsvFileReader.readUsersCsvFile("files/login_grandesNegocios.csv");
    }

    public ArrayList<User> getUsersArrayList() {
        return usersArrayList;
    }
}
