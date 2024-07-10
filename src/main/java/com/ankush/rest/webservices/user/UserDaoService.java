package com.ankush.rest.webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 0;

	static {
		users.add(new User(++userCount, "Ankush", LocalDate.now().minusYears(80), null));
		users.add(new User(++userCount, "Adarsh", LocalDate.now().minusYears(70), null));
		users.add(new User(++userCount, "Tilak", LocalDate.now().minusYears(60), null));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);

	}

	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}

	public void deleteById(int id) {
		users.removeIf(user->user.getId().equals(id));
		
	}

}
