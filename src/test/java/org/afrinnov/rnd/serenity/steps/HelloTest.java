package org.afrinnov.rnd.serenity.steps;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.junit5.SerenityTest;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.afrinnov.rnd.serenity.sample.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

@SerenityTest
@Slf4j
class HelloTest {

    @Managed
    WebDriver driver;
    @Steps
    TravellerStatusSteps travellerSteps;

    @Test
    void membersShouldStartWithBronzeStatus() {
        // GIVEN
        travellerSteps.a_traveller_joins_the_frequent_flyer_program();

        // THEN
        travellerSteps.traveller_should_have_a_status_of(Status.Bronze);
    }

    @Test
    void earnSilverAfter1000Points() {
        // GIVEN
        travellerSteps.a_traveller_joins_the_frequent_flyer_program();

        // WHEN
        travellerSteps.the_traveller_flies(10000);

        // THEN
        travellerSteps.traveller_should_have_a_status_of(Status.Silver);
    }
}
