package cz.senslog.model.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.BitSet;

@Data
@NoArgsConstructor
public class PrivilegeOut {

	private String uid;

	private String userGroupId;

	private String unitGroupId;

	private BitSet privileges;
}
