package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class TestsHovers extends BaseTests {

    @Test
    public void testHoversOnUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOnFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption Title incorrect");
        assertEquals(caption.getProfileLinkText(), "View profile", "Caption LInk text incorrect");
        assertTrue(caption.getProfileLink().endsWith("/users/1"), "link incorrect");

    }
}
