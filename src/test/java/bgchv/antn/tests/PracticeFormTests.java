package bgchv.antn.tests;

import bgchv.antn.pages.PracticeFormPage;
import org.junit.jupiter.api.Test;

public class PracticeFormTests extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillRegistrationFormTest() {

        practiceFormPage.openPage()
                .setFirstName("Homer")
                .setLastName("Simpson")
                .setPracticeFormEmail("mr.plow@gmail.com")
                .setGender("Male")
                .setUserMobileNumber("1234567890")
                .setBirthDate("1956", "May", "12")
                .setSubjects("Physics")
                .setHobbies("Sports")
                .uploadPic("coolPic.jpg")
                .setCurrentAddress("742 Evergreen Terrace")
                .setState("Haryana")
                .setCity("Karnal")
                .submitPracticeForm();

        practiceFormPage.formAppearanceCheck()
                .labelValueCheck("Student Name", "Homer Simpson")
                .labelValueCheck("Student Email", "mr.plow@gmail.com")
                .labelValueCheck("Gender", "Male")
                .labelValueCheck("Mobile", "1234567890")
                .labelValueCheck("Date of Birth", "12 May,1956")
                .labelValueCheck("Subjects", "Physics")
                .labelValueCheck("Hobbies", "Sports")
                .labelValueCheck("Picture", "coolPic.jpg")
                .labelValueCheck("Address", "742 Evergreen Terrace")
                .labelValueCheck("State and City", "Haryana Karnal");


    }
}
