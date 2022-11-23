package com.fooddeliveryapp.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.fooddeliveryapp.entity.Login;
import com.fooddeliveryapp.exception.LoginAlreadyExistsException;
import com.fooddeliveryapp.exception.LoginNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class LoginTests {

	@Mock
	LoginService iLoginService;

	@Test
	void addLoginTest() throws LoginAlreadyExistsException {
		Login login = new Login("qaz@qaz.com","qwerty","user");
		when(iLoginService.addLogin(login)).thenReturn(login);
		assertEquals(iLoginService.addLogin(login),login);
	}
	
	@Test
	void getLoginTest() throws LoginNotFoundException {
		Login login = new Login("qaz@qaz.com","qwerty","user");
		Optional<Login> OLoginEntity = Optional.of(login);
		when(iLoginService.getLogin("qaz@qaz.com")).thenReturn(OLoginEntity);
		assertEquals(iLoginService.getLogin("qaz@qaz.com").get(),login);
	}
	
	@Test
	void updateLoginTest() throws LoginNotFoundException {
		Login login = new Login("qaz@qaz.com","qwerty","user");
		when(iLoginService.updateLogin("qaz@qaz.com",login)).thenReturn(login);
		assertEquals(iLoginService.updateLogin("qaz@qaz.com",login),login);
	}
	
	@Test
	void deleteLoginTest() throws LoginNotFoundException {
		Login login = new Login("qaz@qaz.com","qwerty","user");
		Optional<Login> OLoginEntity = Optional.of(login);
		when(iLoginService.deleteLogin("qaz@qaz.com")).thenReturn(OLoginEntity);
		assertEquals(iLoginService.deleteLogin("qaz@qaz.com").get(),login);
	}
}
