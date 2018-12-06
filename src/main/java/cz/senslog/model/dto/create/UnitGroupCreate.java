package cz.senslog.model.dto.create;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class UnitGroupCreate {

    private String description;
    private List<UnitCreate> units = new ArrayList<>();
}
