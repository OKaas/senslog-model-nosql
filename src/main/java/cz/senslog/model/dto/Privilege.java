package cz.senslog.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.BitSet;

@Data
@NoArgsConstructor
public class Privilege {

	private ObjectId uid;

	private ObjectId userGroupId;

	private ObjectId unitGroupId;

	private BitSet privileges;
}
