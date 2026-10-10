package tn.esprit.springbootautoloc.service;
import tn.esprit.springbootautoloc.models.Employee;

import java.util.List;
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long idEmploye);
    Employee getEmployeeById(Long idEmploye);
    List<Employee> getAllEmployee();
}
