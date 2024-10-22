package com.krillinator.Enterprise_Lektion_6_Spring_Security_Intro;

import com.krillinator.Enterprise_Lektion_6_Spring_Security_Intro.authorities.UserRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnterpriseLektion6SpringSecurityIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseLektion6SpringSecurityIntroApplication.class, args);

		System.out.println("--ADMIN--");
		System.out.println(
				UserRole.ADMIN.getPermission());

		System.out.println("--USER--");
		System.out.println(UserRole.USER);

		System.out.println("--GUEST--");
		System.out.println(UserRole.GUEST);

		System.out.println("--GetAuthorities--");
		System.out.println(UserRole.ADMIN.name()); // Should not return ROLE + name
		System.out.println(UserRole.ADMIN.getAuthorities());

	}

}
