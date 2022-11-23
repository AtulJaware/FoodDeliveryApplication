package com.fooddeliveryapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Optional;

import com.fooddeliveryapp.entity.RestaurantOwner;
import com.fooddeliveryapp.exception.OwnerNotFoundException;
import com.fooddeliveryapp.exception.UserAlreadyExistsException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RestaurantOwnerTests {

	@Mock
	RestaurantService iRestaurantService;

	@Test
	void addRestaurantOwnerTest() throws UserAlreadyExistsException {
		RestaurantOwner restaurantOwner = new RestaurantOwner(1,"name1","name2","8790012308","name1","name2","name1","name2");
		when(iRestaurantService.addRestaurant(restaurantOwner)).thenReturn(restaurantOwner);
		assertEquals(iRestaurantService.addRestaurant(restaurantOwner),restaurantOwner);
	}
	
	@Test
	void getRestaurantOwnerTest() throws OwnerNotFoundException {
		RestaurantOwner restaurantOwner = new RestaurantOwner(1,"name1","name2","8790012308","name1","name2","name1","name2");
		Optional<RestaurantOwner> OUserEntity = Optional.of(restaurantOwner);
		when(iRestaurantService.getRestaurant(1L)).thenReturn(OUserEntity);
		assertEquals(iRestaurantService.getRestaurant(1L).get(),restaurantOwner);
	}
	
	@Test
	void updateRestaurantOwnerTest() throws OwnerNotFoundException {
		RestaurantOwner restaurantOwner = new RestaurantOwner(1,"name1","name2","8790012308","name1","name2","name1","name2");
		when(iRestaurantService.updateOwner(1L,restaurantOwner)).thenReturn(restaurantOwner);
		assertEquals(iRestaurantService.updateOwner(1L,restaurantOwner),restaurantOwner);
	}
	
	@Test
	void deleteRestaurantOwnerTest() throws OwnerNotFoundException {
		RestaurantOwner restaurantOwner = new RestaurantOwner(1,"name1","name2","8790012308","name1","name2","name1","name2");
		Optional<RestaurantOwner> OUserEntity = Optional.of(restaurantOwner);
		when(iRestaurantService.deleteOwner(1L)).thenReturn(OUserEntity);
		assertEquals(iRestaurantService.deleteOwner(1L).get(),restaurantOwner);
	}

}

