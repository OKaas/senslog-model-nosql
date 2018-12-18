package cz.senslog.model.dto.output;

import cz.senslog.model.util.PrivilegeBitSet;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PrivilegeOut {

	private String uid;

	private String userGroupId;

	private String unitGroupId;

	private PrivilegeBitSet privileges;
}
