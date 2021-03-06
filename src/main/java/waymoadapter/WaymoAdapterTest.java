package waymoadapter;

import org.swrlapi.drools.owl.literals.L;
import waymoadapter.model.lidar.Box;
import waymoadapter.model.lidar.Label;
import waymoadapter.model.lidar.Metadata;
import waymoadapter.model.lidar.Type;

public class WaymoAdapterTest {

    public static void main(String[] args) throws Exception {

        String resPath = "src\\main\\resources\\";

        WaymoScenarioBuilder builder = new WaymoScenarioBuilder(
                resPath + "traffic_ontology.owl",
                resPath + "waymo\\ontology_with_scenario.owl",
                "ALPHA");

        Label label = new Label();
        label.metadata = new Metadata();
        label.box = new Box();
        label.type = Type.TYPE_PEDESTRIAN;
        label.box.centerX = 12.5;
        label.box.centerY = 12.5;
        label.box.width = 2.5;
        label.box.length = 3.45;
        label.metadata.accelX = 0.321;
        label.metadata.accelY = 0.132;
        label.metadata.speedX = 0.231;
        label.metadata.speedY = 0.123;

        builder.addPedestrian(label)
                .buildAndSave();
    }

}
