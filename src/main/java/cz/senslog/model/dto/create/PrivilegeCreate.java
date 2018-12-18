package cz.senslog.model.dto.create;

import cz.senslog.model.util.PrivilegeBitSet;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
public class PrivilegeCreate {

	private ObjectId userGroupId;

	private ObjectId unitGroupId;

	private String privileges;
}
