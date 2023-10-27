package pages;

import utils.GlobalVars;

public class HomePage extends BasePage{
    public void visit_homepage(){
        navigateTo_URL(GlobalVars.SAUCEDEMO_HOMEPAGE);
    }



}
