package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DopDownTests extends BaseTests {

    @Test
    public void TestDropDown(){
        DropDownPage dropDownPage = homePage.dropDown();
        dropDownPage.selectFromDropDown("Option 1");

        var selectedOption = dropDownPage.getAllSelectedOptions();
        assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOption.contains("Option 1"), "Option not selected");
    }
}
