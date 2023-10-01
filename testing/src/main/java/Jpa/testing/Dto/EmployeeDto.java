package Jpa.testing.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
@AllArgsConstructor
public class EmployeeDto{
    public Long id;
    public String name;
    public String surname;
    public String email;


}
