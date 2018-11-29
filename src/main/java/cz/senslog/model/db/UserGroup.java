package cz.senslog.model.db;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "user_group")
@CompoundIndexes({
    @CompoundIndex(name = "user_group_users_idx", def = "{'users': 1}"),
    @CompoundIndex(name = "user_unit_group_idx", def = "{'privileges.unitGroup': 1}")
})
public class UserGroup {

    @Id
    private String uid;

    private String name;

    private String description;

    @DBRef
	private List<User> users;

    private List<Privilege> privileges;
}
