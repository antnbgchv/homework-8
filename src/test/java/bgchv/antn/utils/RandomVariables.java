package bgchv.antn.utils;


import static bgchv.antn.utils.RandomMethods.*;

public class RandomVariables {
    public static String firstNameValue = getRandomFirstName(),
            lastNameValue = getRandomLastName(),
            emailValue = getRandomEmail(),
            genderValue = getRandomGender(),
            phoneNumber = getRandomMobileNumber(),
            monthValue = getRandomMonth(),
            yearValue = getRandomYear(),
            dayValue = getRandomDay(),
            subjectValue = getRandomSubject(),
            hobbyValue = getRandomHobie(),
            pictureNameValue = "coolPic.jpg",
            addressValue = getRandomAddress(),
            stateValue = getRandomState(),
            cityValue = getRandomCity(stateValue);
}
