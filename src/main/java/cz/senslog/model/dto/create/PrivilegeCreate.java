package cz.senslog.model.dto.create;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.BitSet;

@Data
@NoArgsConstructor
public class PrivilegeCreate {

	private ObjectId userGroupId;

	private ObjectId unitGroupId;

	private BitSet privileges;
}
