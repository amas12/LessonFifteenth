package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.AndroidConfig;
import qa.guru.owner.config.AuthConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTest {
    @Test
    public void testRemoteFile() {

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("masgutova");
        assertThat(config.password()).isEqualTo("12345678");

    }
    @Test
    public void testLocalFile() {

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("masgutova");
        assertThat(config.password()).isEqualTo("12345678");

    }
}

