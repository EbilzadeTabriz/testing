package Jpa.testing.repository;

import Jpa.testing.entity.Employee;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepositoryImplementation<Employee,Long> {
}
