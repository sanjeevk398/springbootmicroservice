package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;
import repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@GetMapping(value = "/retrieveall")
	public List<Student> retrieveAll() {
		return studentRepository.findAll();
	}

	@GetMapping("/retrieve/{id}")
	public Student retrieve(@PathVariable Integer id) {
		return studentRepository.findOne(id);
	}

	@PostMapping("/save")
	public String save(@RequestBody Student student) {
		studentRepository.save(student);
		if (studentRepository.findOne(student.getId()) != null) {
			return "Record inserted successfully";
		}
		return "Record insertation failed";
	}
}
