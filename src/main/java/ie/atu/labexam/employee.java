package ie.atu.labexam;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class employee {
    // @Pattern()
    private String employeeCode;

    @NotBlank
    @Size(max = 100, message = "Name cannot be greater than 100 characters")
    private String name;

    @Email
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @Min(0)
    private Float salary;

    @DateTimeFormat
    @PastOrPresent
    private Date dateOfJoining;
}
