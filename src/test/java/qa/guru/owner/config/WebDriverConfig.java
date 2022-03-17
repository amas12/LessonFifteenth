package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("baseUrl")
    @DefaultValue("https://onlcmarket.ru")
    String getBaseUrl();

}
