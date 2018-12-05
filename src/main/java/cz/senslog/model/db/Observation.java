package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "observation")
@CompoundIndexes({
        @CompoundIndex(name = "observation_sensor_idx", def = "{'sensorId': 1, 'timestamp': 1}")
})
public class Observation {

    @Id
    private ObjectId uid;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date timestamp;

    private String value;

    private ObjectId sensorId;
}
