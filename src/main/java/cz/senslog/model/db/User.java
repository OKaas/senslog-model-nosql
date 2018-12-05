package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private ObjectId uid;
    private String name;
    private String email;
    private String password;
    //Computed privileges from UserGroup. Full and more precise privileges are in UserGroup.
    private List<UserPrivilege> privileges = new ArrayList<>();
}
