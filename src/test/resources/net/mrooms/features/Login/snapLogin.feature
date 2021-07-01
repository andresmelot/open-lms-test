Feature: Login into OpenLMS site with Snap theme

  Scenario Outline: Successful login
    Given <name> can access the site
    When It sends its credentials <username> and <password>
    Then it should be able to verify its <name> on profile page

    Examples:
      | username      | password | name   |
      | andres        | password | andres |
      | andres_student| password | Student|