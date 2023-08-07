package bgchv.antn.pages;

import bgchv.antn.pages.components.CalendarComponent;
import bgchv.antn.pages.components.CurrentAddressComponent;
import bgchv.antn.pages.components.SubmitButtonComponent;
import bgchv.antn.pages.components.UserEmailComponent;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    UserEmailComponent userEmailComponent = new UserEmailComponent();
    CurrentAddressComponent currentAddressComponent = new CurrentAddressComponent();
    SubmitButtonComponent submitButtonComponent = new SubmitButtonComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            genderSelection = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDayInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsContainer input"),
            hobbiesInput = $("#hobbiesWrapper"),
            picUpload = $("#uploadPicture"),
            stateDropDown = $("#state"),
            cityDropDown = $("#city"),
            filledForm = $(".modal-content"),
            formFields = $(".table-responsive");


    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;

    }

    public PracticeFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public PracticeFormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public PracticeFormPage setPracticeFormEmail(String value) {
        userEmailComponent.setUserEmail(value);

        return this;
    }

    public PracticeFormPage setGender(String value) {
        genderSelection.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setUserMobileNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public PracticeFormPage setBirthDate(String year, String month, String day) {
        birthDayInput.click();
        calendarComponent.setDate(year, month, day);

        return this;
    }

    public PracticeFormPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public PracticeFormPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage uploadPic(String value) {
        picUpload.uploadFromClasspath(value);

        return this;
    }

    public PracticeFormPage setCurrentAddress(String value) {
        currentAddressComponent.setCurrentAddress(value);

        return this;
    }

    public PracticeFormPage setState(String value) {
        stateDropDown.click();
        stateDropDown.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setCity(String value) {
        cityDropDown.click();
        cityDropDown.$(byText(value)).click();

        return this;
    }

    public void  submitPracticeForm() {
        submitButtonComponent.clickSubmitButton();

    }

    public PracticeFormPage formAppearanceCheck() {
        filledForm.should(appear);

        return this;
    }

    public PracticeFormPage labelValueCheck(String label, String value) {
        formFields.$(byText(label)).parent().shouldHave(text(value));

        return this;
    }


}
