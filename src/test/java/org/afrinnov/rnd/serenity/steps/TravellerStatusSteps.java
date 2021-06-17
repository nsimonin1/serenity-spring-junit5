package org.afrinnov.rnd.serenity.steps;

import net.thucydides.core.annotations.Step;
import org.afrinnov.rnd.serenity.sample.FrequentFlyer;
import org.afrinnov.rnd.serenity.sample.Status;
import org.assertj.core.api.Assertions;

public class TravellerStatusSteps extends TravellerSteps {
    @Step
    public void a_traveller_joins_the_frequent_flyer_program() {
        frequentFlyer = FrequentFlyer.withInitialBalanceOf(0);
    }

    @Step("The traveller should have {0} status")
    public void traveller_should_have_a_status_of(Status expectedStatus) {
        Assertions.assertThat(frequentFlyer.getStatus()).isEqualTo(expectedStatus);
    }
}
