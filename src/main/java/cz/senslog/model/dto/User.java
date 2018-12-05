package cz.senslog.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
public class User {

    private ObjectId uid;
    private String name;
    private String email;
    private String password;
}
