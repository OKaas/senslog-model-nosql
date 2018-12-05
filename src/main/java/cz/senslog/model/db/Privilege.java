package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.BitSet;

@Data
@NoArgsConstructor
public class Privilege {

    @Id
    private ObjectId uid;

    private ObjectId unitGroupId;

    private ObjectId userGroupId;

    private BitSet privileges;
}
