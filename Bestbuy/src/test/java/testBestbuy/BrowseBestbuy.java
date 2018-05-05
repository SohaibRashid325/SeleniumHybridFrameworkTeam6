package testBestbuy;

import base.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import org.testng.annotations.Test;

public class BrowseBestbuy extends CommonAPI {

    @Test
    public void browseBestbuy(){
        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();

    }
}
