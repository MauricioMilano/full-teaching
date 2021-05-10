describe('Login', function() {

  it('deve testar o Login', function() {
     cy.viewport(1440, 719)

     cy.visit('https://localhost:5000/')

     cy.get('#navigation-bar > .nav-wrapper > .right > li:nth-child(2) > .navbar-button').click()
      // Fazendo login
     cy.get('.row > .col > .row > .input-field > #email').click()

     cy.get('.row > .col > .row > .input-field > #email').type('teacher@gmail.com')

     cy.get('.row > .col > .row > .input-field > #password').click()

     cy.get('.row > .col > .row > .input-field > #password').click()

     cy.get('.row > .col > .row > .input-field > #password').type('pass')

     cy.get('.modal-content > .row > .col > .row > #log-in-btn').click()


     cy.get('#navigation-bar > .nav-wrapper > .right > li > #settings-button').click()

     cy.get('.nav-wrapper > .right > li > .navbar-button > #arrow-drop-down').click()

     // fazendo logout
      let LogoutButton = cy.get('li > .navbar-button > #dropdown1 > .dropdown-menu-button > #logout-button')

      LogoutButton.should('contain', 'Logout')

      LogoutButton.click()

  })

 })
