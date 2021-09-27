package client;

import education.app.ApiClient;
import education.app.auth.HttpBasicAuth;

public class AppClient extends ApiClient {

    public AppClient() {
        HttpBasicAuth httpBasicAuth = new HttpBasicAuth();

        String defaultUser = "user";
        String defaultPassword = "kMBc3Lb7iM3sd0Mt";
        httpBasicAuth.setCredentials(defaultUser, defaultPassword);
    }
}
