package cz.senslog.model.db;

import cz.senslog.model.util.PrivilegeBitSet;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Privilege {

    @Id
    private ObjectId uid;

    private ObjectId unitGroupId;

    private ObjectId userGroupId;

    private PrivilegeBitSet privileges;
}
