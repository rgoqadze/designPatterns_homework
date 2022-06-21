package DataObject;

import com.github.javafaker.Faker;

public interface StudentInfoData {
    Faker faker = new Faker();
    String
            FirstNameValue = faker.funnyName().name(),
            LastnameValue = faker.name().firstName(),
            PhoneNumberValue = faker.phoneNumber().subscriberNumber(10);


}
