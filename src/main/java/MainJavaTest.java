import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by new on 18-08-2018.
 */


public class MainJavaTest {

private static Logger logger = Logger.getLogger(MainJavaTest.class);

    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("H:\\GitProjects\\log4j\\src\\main\\resources\\log4j.properties");

        //Log in console in and log file
        logger.warn("Log4j appender configuration is successful !!");
    }
}
