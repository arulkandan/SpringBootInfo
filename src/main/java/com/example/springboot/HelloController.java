package com.example.springboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Hello;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class HelloController {

	/**
	 * The class is flagged as a @RestController, meaning it is ready for use by
	 * Spring MVC to handle web requests. @GetMapping maps / to the index() method.
	 * When invoked from a browser or by using curl on the command line, the method
	 * returns pure text. That is because @RestController combines @Controller
	 * and @ResponseBody, two annotations that results in web requests returning
	 * data rather than a view.
	 * 
	 * @return
	 */
	@GetMapping("/index")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@ApiOperation(value = "getGreeting", nickname = "getGreeting")
	 @ApiResponses(value = {
		        @ApiResponse(code = 500, message = "Server error"),
		        @ApiResponse(code = 200, message = "Successful retrieval",
		            response = Hello.class) })
	@GetMapping("/index/{institutuionId}")
	public Hello sayHello(@ApiParam(value = "testId",
	        required = true, defaultValue = "111")  @PathVariable final int institutuionId1) {
		return new Hello();
	}

}