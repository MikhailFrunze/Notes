import java.awt.*;

public class TestTemplate {
    Taskbar.Feature: Customer Account Tests

    Scenario: Edit Customer Personal Info
    Given I am logged in
    And I see Customer Account page

    When I click on Ihre Kundendaten
    Then I see Kundendaten page

    When I click on Ihre persönlichen Daten dropdown
    And I click on Edit button
    And I change customer name
    And I click Save button
    Then I see new customer name

    Scenario: Check an order on Customer Orders page
    Given I am logged in as customer with 1 order
    And I see Customer Account page

    When I click on Ihre Bestellungen
    Then I see Bestellungen page

    When I check the orders list
    Then I see 1 order on the list

}
