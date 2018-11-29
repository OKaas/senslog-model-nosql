package cz.senslog.model.dto.create;

import org.bson.types.BSONTimestamp;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ObservationCreate {
	private BSONTimestamp timestamp;

	private String value;

    private String sensorId;
}
