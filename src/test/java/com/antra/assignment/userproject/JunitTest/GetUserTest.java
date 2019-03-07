package com.antra.assignment.userproject.JunitTest;


import com.antra.assignment.userproject.bean.UserEntity;
import com.antra.assignment.userproject.controller.FindUserController;
import com.antra.assignment.userproject.service.UserFindService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import javafx.beans.binding.When;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.mockito.Matchers.anyInt;


public class GetUserTest {

    @Mock
    UserFindService findService;

    @Before
    public void configMock() {
        MockitoAnnotations.initMocks(this);
        RestAssuredMockMvc.standaloneSetup(new FindUserController(findService));
    }

    @Test
    public void testGetUser() {
        given().accept("application/json").get("users/"+anyInt())
                .then().assertThat().statusCode(200).body("id",Matchers.equalTo(0))
                .body("UserAge", Matchers.equalTo(18))
                .body("UserName",Matchers.equalTo("ning"))
                .body("UserSalary", Matchers.comparesEqualTo(8000.0f));


    }


}
