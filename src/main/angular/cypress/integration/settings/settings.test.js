describe('Settings', function() {

  it('Deve testar as configurações', function() {

     cy.viewport(1440, 719)

     cy.visit('https://localhost:5000/')

     cy.get('#navigation-bar > .nav-wrapper > .right > li:nth-child(2) > .navbar-button').click()

     cy.get('.row > .col > .row > .input-field > #email').click()

     cy.get('.row > .col > .row > .input-field > #email').type('teacher@gmail.com')

     cy.get('.row > .col > .row > .input-field > #password').click()

     cy.get('.row > .col > .row > .input-field > #password').type('pass')

     cy.get('.modal-content > .row > .col > .row > #log-in-btn').click()

     cy.get('#navigation-bar > .nav-wrapper > .right > li > #settings-button').click()

     cy.get('.col:nth-child(1) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(1) > .card > .card-content > .switch > label > input')

     cy.get('.col:nth-child(2) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(2) > .card > .card-content > .switch > label > input')

     cy.get('.container > .row > .col:nth-child(3) > .card > .card-content').click()

     cy.get('.col:nth-child(3) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(3) > .card > .card-content > .switch > label > input')

     cy.get('.col:nth-child(4) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(4) > .card > .card-content > .switch > label > input')

     cy.get('.col:nth-child(5) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(5) > .card > .card-content > .switch > label > input')

     cy.get('.col:nth-child(1) > .card > .card-content > .switch > label').click()

     cy.get('.col:nth-child(1) > .card > .card-content > .switch > label > input')

     cy.get('.col:nth-child(2) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(2) > .card > .card-content > .switch > label > input')

     cy.get('.col:nth-child(3) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(3) > .card > .card-content > .switch > label > input')

     cy.get('.col:nth-child(4) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(4) > .card > .card-content > .switch > label > input')

     cy.get('.row > .col:nth-child(5) > .card > .card-content > .switch').click()

     cy.get('.col:nth-child(5) > .card > .card-content > .switch > label > .lever').click()

     cy.get('.col:nth-child(5) > .card > .card-content > .switch > label > input')

     cy.get('.container > .row > .col > .collection > .collection-item:nth-child(1) > #stng-user-mail').should(($email) => {
      expect($email).to.contain('teacher@gmail.com')
    })

     cy.get('.container > .row > .col > .collection > .collection-item > .setting-content').should(($email) => {
      expect($email).to.contain('Teacher Cheater')
    })


  })

 })
