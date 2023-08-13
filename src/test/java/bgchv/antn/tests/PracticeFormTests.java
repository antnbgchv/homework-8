package bgchv.antn.tests;

import bgchv.antn.pages.PracticeFormPage;
import org.junit.jupiter.api.Test;

import static bgchv.antn.utils.RandomVariables.*;

public class PracticeFormTests extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillRegistrationFormTest() {

        practiceFormPage.openPage()
                .setFirstName(firstNameValue)
                .setLastName(lastNameValue)
                .setPracticeFormEmail(emailValue)
                .setGender(genderValue)
                .setUserMobileNumber(phoneNumber)
                .setBirthDate(yearValue, monthValue, dayValue)
                .setSubjects(subjectValue)
                .setHobbies(hobbyValue)
                .uploadPic(pictureNameValue)
                .setCurrentAddress(addressValue)
                .setState(stateValue)
                .setCity(cityValue)
                .submitPracticeForm();

        practiceFormPage.formAppearanceCheck()
                .labelValueCheck("Student Name", firstNameValue + " " + lastNameValue)
                .labelValueCheck("Student Email", emailValue)
                .labelValueCheck("Gender", genderValue)
                .labelValueCheck("Mobile", phoneNumber)
                .labelValueCheck("Date of Birth", dayValue + " " + monthValue + "," + yearValue)
                .labelValueCheck("Subjects", subjectValue)
                .labelValueCheck("Hobbies", hobbyValue)
                .labelValueCheck("Picture", pictureNameValue)
                .labelValueCheck("Address", addressValue)
                .labelValueCheck("State and City", stateValue + " " + cityValue);


    }
}
