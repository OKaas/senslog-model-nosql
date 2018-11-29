package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.bson.types.BSONTimestamp;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "observation")
@CompoundIndexes({
    @CompoundIndex(name = "observation_sensor_idx", def = "{'sensor': 1, 'timestamp': 1}")
})
public class Observation {

    @Id
    private String uid;
	
	private BSONTimestamp timestamp;

	private String value;

	@DBRef
    private Sensor sensor;
}
