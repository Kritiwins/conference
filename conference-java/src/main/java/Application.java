import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.service.SpeakerService;
import com.springdemo.service.SpeakerServiceImpl;

public class Application {
	
	public static void main(String args[]) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpeakerService service = appContext.getBean(SpeakerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
		//System.out.println(service.findAll().get(0).getLastName());
	}
}
