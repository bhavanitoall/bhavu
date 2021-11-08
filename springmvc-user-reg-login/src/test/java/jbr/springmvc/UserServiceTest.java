package jbr.springmvc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void testRegister() {
    User user = new User();
    user.setUsername("Bhavani");
    user.setPassword("amma");
    user.setFirstname("Bhavani");
    user.setLastname("Chakkaravarthy");
    user.setAddress("chennai, t.nagar");
    user.setEmail("bhavunayaki362@gmail.com");
    user.setPhone(222);

    int result = userService.register(user);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testValidateUser() {
    Login login = new Login();
    login.setUsername("Bhavani");
    login.setPassword("amma");

    User user = userService.validateUser(login);
    Assert.assertEquals("Bhavani", user.getFirstname());
  }

}
