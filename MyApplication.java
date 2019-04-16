package My.application.My.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {
	private static final Logger log = LoggerFactory.getLogger(MyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner myapplication(MyapplicationRepository mrepository) {
			log.info("save a couple of weeks");
			mrepository.save(new Week("Working"));
			mrepository.save(new Week("Freetime"));
			
			mrepository.save(new Week("Working", mrepository.findByName("Working").get(0)));
			mrepository.save(new Week("Freetime", mrepository.findByName("Freetime").get(0)));	
			
			// Create weeks: working/working freetime/freetime
			Week week1 = new Week("week", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "WEEK");
			Week week2 = new Week("week", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "WEEK");
			mrepository.save(week1);
			mrepository.save(week2);
			
			log.info("fetch all weeks");
			for (Week week : mrepository.findAll()) {
				log.info(week.toString());
				
				@RunWith
				(SpringRunner.class)
				@DataJpaTest
				public class MyApplicationRepositoryTest{
				@Autowired
				private MyApplicationRepository repository;
				
				@Test
				public void findByLastnameShouldReturnUser() {
				List<User>users=repository.findByLastName("Kavantsaari");
				assertThat(users).hasSize(1);
				assertThat(users.get(0).getFirstName()).isEqualTo("Christoffer");
				}
				
				@Test
				public void createNewWeek() {
				Week week= new Week("Working", "Freetime", "christoffer.kavantsaari@gmail.com", new Week("Working Freetime"));
				repository.save(week);
				assertThat(week.getId()).isNotNull();
				
			}
		}
				
			}

		};
	}

