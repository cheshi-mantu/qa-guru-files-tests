package helpers;

public class Environment {
    public static String
        selenoid_url = System.getProperty("selenoid_url","localhost"),
        url = System.getProperty("url","https://www.tinkoff.ru");
}

