package di;

/**
 * Created by jcanogal on 03/06/2016.
 */
public class SystemPropertyConfiguration implements Configuration {

    @Override
    public String getConfig(String key) {
        return System.getProperty(key);
    }
}
