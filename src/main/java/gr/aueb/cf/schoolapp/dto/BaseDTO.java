package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class BaseDTO {

    @NotNull
    private Long id;
}
