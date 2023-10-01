package Jpa.testing.controller;


import Jpa.testing.Dto.EmployeeDto;
import Jpa.testing.manager.EmployeeManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeManager manager;
@GetMapping
    public ResponseEntity<List<EmployeeDto>> getAll() {
        List<EmployeeDto> employee = manager.getAll();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employee) {
        EmployeeDto created = manager.createEmployee(employee);
        return new ResponseEntity<>(created,HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String > deleteById(@PathVariable("id") Long id) {
      manager.deleteById(id);
      return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long Empid,@RequestBody EmployeeDto employee) {
    employee.setId(Empid);
    EmployeeDto updated = manager.updateEmployee(employee);
    return new ResponseEntity<>(updated,HttpStatus.OK);


    }

}
