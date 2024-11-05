package ie.atu.labexam;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class employeeController {
    @PostMapping("/employees")
    public String addEmployee(@Valid @RequestBody employee employeeRequest) {
        return "Employee details";
    }

    @GetMapping("/employees/{employeeCode}")
    public String getEmployee(@Valid @PathVariable String employeeCode) {
        // Get employee details from ID
        return "Employee details";
    }

    @PutMapping("/employees/{employeeCode}")
    public String updateEmployee(@Valid @PathVariable String employeeCode) {
        // Delete employee
        // Add employee
        return "Employee details";
    }

    @DeleteMapping("/employees/{employeeCode}")
    public String deleteEmployee(@Valid @PathVariable String employeeCode) {
        // Delete employee
        return "Employee details";
    }
}
