package cz.senslog.model.dto.output;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class UnitGroupOut {

    private String uid;
    private String description;
    private List<UnitInUnitGroupOut> units = new ArrayList<>();
}
