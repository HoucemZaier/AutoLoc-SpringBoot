package tn.esprit.springbootautoloc.service;

import lombok.AllArgsConstructor;
import tn.esprit.springbootautoloc.models.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.repository.EmployeeRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long idEmploye) {
        employeeRepository.deleteById(idEmploye);
    }

    @Override
    public Employee getEmployeeById(Long idEmploye) {
        return employeeRepository.findById(idEmploye).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
