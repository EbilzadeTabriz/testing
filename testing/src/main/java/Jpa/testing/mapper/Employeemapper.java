package Jpa.testing.mapper;

import Jpa.testing.Dto.EmployeeDto;
import Jpa.testing.entity.Employee;

public class Employeemapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto(
                employee.getId(),
                employee.getName(),
                employee.getSurname(),
                employee.getEmail()
        );
        return employeeDto;
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee  = new Employee(
                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getSurname(),
                employeeDto.getEmail()
        );
        return employee;
    }

}
