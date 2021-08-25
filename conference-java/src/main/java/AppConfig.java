import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springdemo.repository.HibernateSpeakerRepositoryImpl;
import com.springdemo.repository.SpeakerRepository;
import com.springdemo.service.SpeakerService;
import com.springdemo.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "speakerService")
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());//line 14&15 injects speaker repository bean into speaker service bean 
		//service.setRepository(getSpeakerRepository()); //and returns to application when we call it.
		return service;	
	}
	
	@Bean(name = "speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
		
	}
}
