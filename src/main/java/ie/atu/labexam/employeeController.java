package ie.atu.labexam;

import org.springframework.web.bind.annotation.*;

@RestController
public class employeeController {
    @PostMapping("/employees")
    public String addEmployee() {
        return "Employee details";
    }

    @GetMapping("/employees/{employeeCode}")
    public String getEmployee() {
        // Get employee details from ID
        return "Employee details";
    }

    @PutMapping("/employees/{employeeCode}")
    public String updateEmployee() {
        // Delete employee
        // Add employee
        return "Employee details";
    }

    @DeleteMapping("/employees/{employeeCode}")
    public String deleteEmplolyee() {
        // Delete employee
        return "Employee details";
    }
}
