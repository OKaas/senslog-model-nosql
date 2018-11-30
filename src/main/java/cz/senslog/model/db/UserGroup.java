package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "user_group")
@CompoundIndexes({
        @CompoundIndex(name = "user_group_users_idx", def = "{'users': 1}"),
        @CompoundIndex(name = "user_unit_group_idx", def = "{'privileges.unitGroup': 1}")
})
public class UserGroup {

    @Id
    private ObjectId uid;

    private String name;

    private String description;

    private List<ObjectId> usersIds;

    private List<Privilege> privileges;
}
