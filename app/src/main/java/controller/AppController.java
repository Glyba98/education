package controller;

import client.AppClient;
import education.app.api.AccountResourceApi;
import education.app.api.CountryResourceApi;
import education.app.api.DepartmentResourceApi;
import education.app.api.EmployeeResourceApi;
import education.app.api.JobHistoryResourceApi;
import education.app.api.JobResourceApi;
import education.app.api.LocationResourceApi;
import education.app.model.AdminUserDTO;
import education.app.model.KeyAndPasswordVM;
import education.app.model.ManagedUserVM;
import education.app.model.PasswordChangeDTO;

import java.util.Map;

public class AppController {

    private static final AppClient client = new AppClient();
    private static AccountResourceApi accountResourceApi;
    private static CountryResourceApi countryResourceApi;
    private static DepartmentResourceApi departmentResourceApi;
    private static EmployeeResourceApi employeeResourceApi;
    private static JobHistoryResourceApi jobHistoryResourceApi;
    private static JobResourceApi jobResourceApi;
    private static LocationResourceApi locationResourceApi;


    public static AccountResourceApi getAccountController() {
        if (accountResourceApi == null) {
            accountResourceApi = client.buildClient(AccountResourceApi.class);
        }
        return accountResourceApi;
    }


}
