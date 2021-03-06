package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider() {
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.clickOnSlider();
        sliderPage.moveSlider("4");
        assertEquals(sliderPage.getRange(), "4");
    }
}
