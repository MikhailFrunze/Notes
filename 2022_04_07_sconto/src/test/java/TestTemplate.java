import com.codeborne.selenide.conditions.And;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestTemplate {
    /*Feature: Customer Account Tests

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

    RemoteWebDriver.When I check the orders list
    Then I see 1 order on the list

    /*--------------------------------------------*/
   /* Scenario: Check the Merkliste
    Given I am on Schlafsofas page
    When I click on the heart icon near a product's name
    And I click on Merkliste
    Then I see the product added to the favourite list

    Given I am on Schlafsofas page
    When I click on weitere filter
    Then I see the filters dropdown

    When I click on weniger filter button
    Then the filters dropdown becomes shorter*/
}
