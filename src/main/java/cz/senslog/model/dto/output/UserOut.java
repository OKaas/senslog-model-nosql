package cz.senslog.model.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserOut {

    private String uid;
    private String name;
    private String email;
    private String password;
}
