package cz.senslog.model.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UnitOut {

    private String uid;
    private String unitGroupId;
    private String description;
}
