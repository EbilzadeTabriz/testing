package Jpa.testing.manager;


import Jpa.testing.Dto.EmployeeDto;
import Jpa.testing.entity.Employee;
import Jpa.testing.mapper.Employeemapper;
import Jpa.testing.repository.EmployeeRepository;
import Jpa.testing.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class EmployeeManager implements EmployeeService {
  private final EmployeeRepository repository;




    @Override
    public List<EmployeeDto> getAll() {
        List<Employee> employees = repository.findAll();
        return employees.stream().map(Employeemapper::mapToEmployeeDto).collect(Collectors.toList());


    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
     Employee employee = Employeemapper.mapToEmployee(employeeDto);
     Employee savedEmployee = repository.save(employee);
    EmployeeDto savedEmployeeDto = Employeemapper.mapToEmployeeDto(savedEmployee);
    return savedEmployeeDto;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employee) {
        Employee existingEmployee = repository.findById(employee.getId()).get();
        existingEmployee.setName(existingEmployee.getName());
        existingEmployee.setSurname(existingEmployee.getSurname());
        existingEmployee.setEmail(employee.getEmail());
        Employee updated = repository.save(existingEmployee);
         return Employeemapper.mapToEmployeeDto(updated);
     }
}
