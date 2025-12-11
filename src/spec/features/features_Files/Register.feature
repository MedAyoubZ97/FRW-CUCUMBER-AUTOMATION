Feature: Je verifie la page registration 
  En tant que utilisateur je souhaite m inscrire au site Mercury

  @register
  Scenario: Je verifie la page registration
    Given je me connecte sur l application Mercury register
    When je saisie le first name "test"
    And je saisie le last name "test"
    And je saisie le numero "test"
    And je saisie le email "test"
    And je saisie l adresse "test"
    And je saisie le city "test"
    And je saisie la provence "test"
    And je saisie le code postal "test"
    And je saisie le country "test"
    And je saisie le user name "test"
    And je saisie le password register "test"
    And je saisie le confirm password register "test"
    And je clique sur le bouton submit register
    Then je me redirige vers la page register success "Thank you for registering.You may now "