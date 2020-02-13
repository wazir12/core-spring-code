package accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// TODO-01: Verify the presence of Spring security dependencies
// - See TO-DO-01 in the pom.xml for Maven or build.gradle for Gradle

// TODO-02a: Observe the default security behaviour of the Spring
//           Boot application using a browser
// - Run this application
// - Using Chrome Incognito browser, access "http://localhost:8080/accounts"
//   and observe that a login page gets displayed
// - Enter "user" in the Username field and Spring Boot generated
//   password into the Password field and verify that the accounts
//   get displayed
//   (If the browser keeps displaying the login page, make sure
//    to use Chrome Incognito browser.)
// - Access "http://localhost:8080/logout" and click "Log out" button

// TODO-02b: Observe the default security behaviour of the Spring
//           Boot application using "curl" command
// - Open a terminal window
// - Run "curl -i localhost:8080/accounts" and observe 401 response
// - Run "curl -i -u user:<Spring-Boot-Generated-Password> localhost:8080/accounts"
//   and observe the successful response

// TODO-12: Test the method security using browser or curl
// - Re-run this application
// - Using Chrome Incognito browser, access
//   http://localhost:8080/authorities?username=user
// - Enter "user"/"user" and verify that 403 failure occurs
// - If you want to use "curl", use
//   curl -i -u user:user http://localhost:8080/authorities?username=user
//
// - Close the Chrome Incognito browser and start a new one
// - Access http://localhost:8080/authorities?username=admin
// - Enter "admin"/"admin" and verify that the roles are displayed successfully
// - If you want to use "curl", use
//   curl -i -u admin:admin http://localhost:8080/authorities?username=admin
//
// - Close the Chrome Incognito browser and start a new one
// - Access http://localhost:8080/authorities?username=superadmin
// - Enter "superadmin"/"superadmin" and verify that the roles are displayed successfully
// - If you want to use "curl", use
//   curl -i -u superadmin:superadmin http://localhost:8080/authorities?username=superadmin

// TODO-17: Verify that the newly added authentication provider works
// - Re-run this application
// - Using Chrome Incognito browser, access
//   http://localhost:8080/accounts
// - Enter "mary"/"mary" and verify accounts data
// - If you want to use "curl", use
//   curl -i -u mary:mary http://localhost:8080/accounts
//
// - Close the Chrome Incognito browser and start a new one
// - Using Chrome Incognito browser, access
//   http://localhost:8080/accounts
// - Enter "joe"/"joe" and verify accounts data
// - If you want to use "curl", use
//   curl -i -u joe:joe http://localhost:8080/accounts

@SpringBootApplication
// TODO-03: Import security configuration
// - Uncomment the line below and go to SecurityConfig class
//@Import(SecurityConfig.class)
@EntityScan("rewards.internal")
public class RestWsApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestWsApplication.class, args);
    }

}