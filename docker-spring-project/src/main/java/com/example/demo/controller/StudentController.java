package com.example.demo.controller;

import java.net.URI;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.annotation.security.RolesAllowed;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.slf4j.Slf4j;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path ="/api/v1")
@Slf4j
public class StudentController {

//	@Autowired
//	private Student student;
	
//	@Autowired
//	private Student anotherstudent;
	
	@Autowired
	private StudentService service;
	
//	@GetMapping(path ="/students/{id}")
//public Student getStudentById(@PathVariable("id") int rollNumber) {
//
//		return this.service.findById(rollNumber)
//				.orElseThrow(()->new IdNotFoundException("Element With "+rollNumber+" not present"));
//	}

	@GetMapping(path ="/students")
	public List<Student> findAll(Principal principal) {
		return service.findAll();
	}
	@PostMapping(path="/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		URI uri=ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/id")
				.buildAndExpand(student.getRollNumber())
				.toUri();
		Student addedEntity=this.service.add(student);
		return ResponseEntity.created(uri).body(addedEntity);
		
	}
//	@DeleteMapping(path="/students")
//	public ResponseEntity<Student> remove(@RequestBody Student entity){
//		Student delete=this.service.remove(entity)
//				.orElseThrow(()-> new RuntimeException("Element With "+entity.getRollNumber()+" not present"));
//		return ResponseEntity.status(200).body(delete);
//		
//	}
//	@DeleteMapping(path="/students/delete/{id}")
//	@ResponseStatus(code=HttpStatus.NO_CONTENT)//204 No Content
//	public void removeById(@PathVariable("id") int id){
//		this.service.removeById(id)
//				.orElseThrow(()-> new RuntimeException("Element With "+id+" not present"));
//	}
//	@PutMapping(path="/students")
//	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
//		Student updated=this.service.updateStudent(student);
//		return ResponseEntity.status(HttpStatus.OK).body(updated);
//		
//	}
//	@PatchMapping(path="/students/{rollNumber}/{latestMark}")
//	public ResponseEntity<String> updateMark(@PathVariable("rollNumber") int rollNumber,@PathVariable("latestMark") double latestMark) {
//		int rowsUpdated=this.service.updateMark(rollNumber, latestMark);
//		String message=rowsUpdated+":=Row(s) updated";
//		return ResponseEntity.ok(message);
//	}
//	@GetMapping(path ="/students/sort")
//	public List<Student> getSortedStudentList(@RequestParam String proName){//(default = "markScored")
//		return this.service.sortByProperty(proName);
//	}
//	@GetMapping(path ="/students/pageable/{pageNum}/{size}")
//	public List<Student> getStudentsPaged(@PathVariable int pageNum,@PathVariable int size){
//		return this.service.findByPage(pageNum,size);
//	}
}
