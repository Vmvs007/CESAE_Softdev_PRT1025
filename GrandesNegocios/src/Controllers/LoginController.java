package Controllers;

import Models.User;
import Repositories.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UsersRepository usersRepository;

    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UsersRepository();
    }

    public String validateLogin(String usernameInput, String passwordInput){

        for(User userAtual: this.usersRepository.getUsersArrayList()){
            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                return userAtual.getUserType();
            }
        }

        return "ERROR";

    }
}
