package by.ganevich.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

    private Long id;

    @Pattern(regexp = "[A-Z][a-z]*", message = "Client name must start with a capital letter")
    @Size(min = 2, max = 25, message = "Name length must be between 2 and 25")
    @NotEmpty(message = "Client name must not be empty")
    private String name;

    @Pattern(regexp = "[A-Z][a-z]*", message = "Client surname must start with a capital letter")
    @Size(min = 2, max = 25, message = "Surname length must be between 2 and 25")
    @NotEmpty(message = "Client surname must not be empty")
    private String surname;

    @Pattern(regexp = "^INDIVIDUAL$|^INDUSTRIAL$")
    @NotEmpty(message = "Type must not be empty")
    private String type;

}
