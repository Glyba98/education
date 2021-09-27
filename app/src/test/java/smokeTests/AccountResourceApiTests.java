package smokeTests;

import controller.AppController;
import education.app.model.AdminUserDTO;

public class AccountResourceApiTests {

    public void smokeAccountTest () {
        AdminUserDTO response = AppController.getAccountController().getAccountUsingGET();
    }
}
