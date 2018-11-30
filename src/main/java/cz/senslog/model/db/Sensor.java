package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "sensor")
@CompoundIndexes({
        @CompoundIndex(name = "sensor_unit_group_idx", def = "{'unitGroup': 1}"),
        @CompoundIndex(name = "sensor_unit_idx", def = "{'unit': 1}")
})
public class Sensor {

    @Id
    private ObjectId uid;

    private String description;

    private ObjectId phenomenonId;

    private ObjectId unitGroupId;

    private ObjectId unitId;
}
