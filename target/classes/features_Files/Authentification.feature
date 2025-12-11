Feature: Je verifie la page d authentification 
  En tant que utilisateur je souhaite m authentifier au site Mercury

  @connexion
  Scenario: Je verifie la page d authentification
    Given je me connecte sur l application Mercury
    When je saisie le username "test"
    And je saisie le password "test"
    And je clique sur le bouton submit
    Then je me redirige vers la page home "Login Successfully"
    