package cz.senslog.model.db;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "unit_group")
@CompoundIndexes({
        @CompoundIndex(name = "unit_group_unit_idx", def = "{'units._id': 1}"),
})
public class UnitGroup {

    @Id
    private String uid;
	private String description;
	private List<Unit> units;
}
