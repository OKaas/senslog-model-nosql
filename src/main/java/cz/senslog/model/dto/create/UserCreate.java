package cz.senslog.model.dto.create;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserCreate {

    private String name;
    private String email;
    private String password;
}
