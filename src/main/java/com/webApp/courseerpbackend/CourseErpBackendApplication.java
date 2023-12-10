package com.webApp.courseerpbackend;

import com.webApp.courseerpbackend.models.enums.user.UserStatus;
import com.webApp.courseerpbackend.models.user.User;
import com.webApp.courseerpbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseErpBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CourseErpBackendApplication.class, args);
	}


	private  UserRepository userRepository;

	public CourseErpBackendApplication(UserRepository userRepository){
		this.userRepository=userRepository;

	}

	@Override
	public void run(String... args) throws Exception {
		User user=User.builder()
				.email("ashraf.shukurow@gmail.com")
				.name("ashraf")
				.surname("Shukurow")
				.status(UserStatus.ACTIVE)
				.roleId(2L)
				.password("ashraf2004")
				.phoneNumber("0775231232")
				.build();
		userRepository.save(user);
		System.out.println(String.format("%s id is inserted",user.getId()));
	}
}
