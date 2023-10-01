package Jpa.testing.service;

import Jpa.testing.Dto.EmployeeDto;
import Jpa.testing.entity.Employee;

import java.util.List;

public interface EmployeeService {
  List<EmployeeDto> getAll();
  EmployeeDto createEmployee(EmployeeDto employee);
  void deleteById(Long id);
  EmployeeDto updateEmployee(EmployeeDto employee);



}
