package tn.esprit.springbootautoloc.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Employee;
import tn.esprit.springbootautoloc.service.EmployeeService;
import java.util.List;

@Tag(name = "Gestion des employés", description = "CRUD employés")
@RestController
@RequestMapping("/Employees")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
            this.employeeService = employeeService;
    }

    @Operation(summary = "Ajouter un employé")
    @PostMapping("/ajouterEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/getById/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee>getAllemployee(){
        return employeeService.getAllEmployee();
    }
}
