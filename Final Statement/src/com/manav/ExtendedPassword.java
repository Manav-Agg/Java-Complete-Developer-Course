package com.manav;

public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password){
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password is " + this.decryptedPassword);
//    }
}
