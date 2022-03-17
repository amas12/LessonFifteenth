package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.FruitsConfig;
import qa.guru.owner.config.TypesConfig;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class FruitsTest {
    @Test
    public void testArray() {
        System.setProperty("array" , "apple,banana,orange");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray())
                .contains("apple","banana","orange");
    }
    @Test
    public void testList() {
        System.setProperty("list" , "orange,apple,banana");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList())
                .contains("orange","apple","banana");
    }
    @Test
    public void testListWithDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithDefault())
                .contains("orange","apple");
    }
}
