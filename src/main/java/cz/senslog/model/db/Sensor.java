package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
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
    private String uid;

    private String description;

    @DBRef
	private Phenomenon phenomenon;

    @DBRef
	private UnitGroup unitGroup;

    @DBRef
	private Unit unit;
}
