package cz.senslog.model.dto;

import cz.senslog.model.util.PrivilegeBitSet;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
public class Privilege {

	private ObjectId uid;

	private ObjectId userGroupId;

	private ObjectId unitGroupId;

	private PrivilegeBitSet privileges;
}
