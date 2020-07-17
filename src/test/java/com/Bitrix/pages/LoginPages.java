package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    public LoginPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
