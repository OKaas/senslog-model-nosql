package cz.senslog.model.db;

import cz.senslog.model.util.PrivilegeBitSet;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "user_privilege")
public class UserPrivilege {

    @Id
    private ObjectId uid;

    private ObjectId unitGroupId;

    private ObjectId userId;

    private List<ObjectId> privilegesIds = new ArrayList<>();

    private PrivilegeBitSet privileges;
}
