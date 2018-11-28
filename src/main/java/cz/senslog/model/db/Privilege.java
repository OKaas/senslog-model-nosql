package cz.senslog.model.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@NoArgsConstructor
public class Privilege {

    @Id
	private String uid;

    @DBRef
    private UnitGroup unitGroup;

    private String privileges;
}
