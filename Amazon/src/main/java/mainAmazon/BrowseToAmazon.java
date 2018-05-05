package mainAmazon;

import base.CommonAPI;

public class BrowseToAmazon extends CommonAPI {
    String amazonURL = "https://www.amazon.com";


    public void browseToAmazon(){
        wChromeDriver.get(amazonURL);
    }
}
