package SpringBoot_PO_01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class SpringBootPo01Application implements CommandLineRunner {
	private final Notification notification;

	public SpringBootPo01Application(Notification notification){
		this.notification=notification;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPo01Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		notification.notifyUser();
	}
}
