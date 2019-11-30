package io.medina.SpringBootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // this means that  the user will get something when requesting this url  as there will be an executed method 
public class HelloController {

	@RequestMapping ("/hello") // This annotation is used only with get method

	public String  hi() {
	 return"hi mohamed";
}	

}
