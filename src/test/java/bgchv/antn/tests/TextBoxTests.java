package bgchv.antn.tests;

import bgchv.antn.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillTextBoxPage() {

        textBoxPage.openPage()
                .setUserName("Homer Simpson")
                .setUserEmail("mr.plow@gmail.com")
                .setUserCurrentAddress("742 Evergreen Terrace")
                .setUserPermanentAddress("742 Evergreen Terrace")
                .clickSubmitButton();

        textBoxPage.outputAppearanceCheck()
                .outputNameCheck("Homer Simpson")
                .outputEmailCheck("mr.plow@gmail.com")
                .outputCurrentAddressCheck("742 Evergreen Terrace")
                .outputPermanentAddressCheck("742 Evergreen Terrace");

    }

}
