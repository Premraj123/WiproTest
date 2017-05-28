package com.wipro.common.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.common.domain.Student;
import com.wipro.common.domain.Univ;
import com.wipro.service.StudentService;

@Controller
@RequestMapping("/service")
public class ServiceController {
	@Autowired
	public StudentService studentService;
	public static ObjectMapper mapper = new ObjectMapper();

	/*
	 * @Override protected ModelAndView handleRequestInternal(HttpServletRequest
	 * request, HttpServletResponse response) throws Exception {
	 *
	 * ModelAndView model = new ModelAndView("HelloWorldPage");
	 * model.addObject("msg", "hello world");
	 *
	 * return model; }
	 */
	@RequestMapping(value = "ping", method = RequestMethod.GET)
	public ModelAndView ping() throws Exception {
		final InputStream is = ServiceController.class.getResourceAsStream("/universities.json");
		final BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		final String line;
		final Univ[] car = mapper.readValue(is, Univ[].class);
		return new ModelAndView("viewemp", "list", car);
	}

	@RequestMapping(value = "enter", method = RequestMethod.GET)
	public String enter() throws Exception {
		return "final";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("command") Student student, BindingResult result) {
		studentService.addStudent(student);
		return new ModelAndView("redirect:/add.html");
	}


}