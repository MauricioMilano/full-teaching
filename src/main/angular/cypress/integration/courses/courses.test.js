describe('Teste Curso', function() {

  it('deve testar o curso', function() {

     cy.viewport(1440, 719)

     cy.visit('https://localhost:5000')

     cy.get('#navigation-bar > .nav-wrapper > .right > li:nth-child(2) > .navbar-button').click()
      // Fazendo login
     cy.get('.row > .col > .row > .input-field > #email').click()

     cy.get('.row > .col > .row > .input-field > #email').type('teacher@gmail.com')

     cy.get('.row > .col > .row > .input-field > #password').click()

     cy.get('.row > .col > .row > .input-field > #password').type('pass')

     cy.get('.modal-content > .row > .col > .row > #log-in-btn').click()

     cy.get('.row > .col > .dashboard-title > #add-new-course-btn > #add-course-icon').click()

     cy.get('.col > .row > .row > .input-field > #input-post-course-name').click()

     cy.get('.col > .row > .row > .input-field > #input-post-course-name').type('Teste Curso')
     cy.get('.modal-content > .row > .col > .row > #submit-post-course-btn').click()

     cy.get('.collection-item:nth-child(3) > .row > .col > .title').should('contain', 'Teste Curso')
     let cursoEditButton = cy.get('.collection-item:nth-child(3) > .row > .col > a > .material-icons')
     cursoEditButton.click()

     cy.get('.col > .row > .row > .input-field > #input-put-course-name').click()

     cy.get('.col > .row > .row > .input-field > #input-put-course-name').type(' - Curso com o nome alterado')

     cy.get('.modal-content > .row > .col > .row > #submit-put-course-btn').click()
     cy.get('.collection-item:nth-child(3) > .row > .col > .title').should('contain', 'Teste Curso - Curso com o nome alterado')
     cy.wait(1000)
     cy.get('.collection-item:nth-child(3) > .row > .col > a > .material-icons').click()

     cy.get('.col > .row > .row > .input-field > #input-put-course-name').type(' - Deletando o curso')
     cy.get('.col > .row > .valign-wrapper > .float-to-left > #label-delete-checkbox').click()

     cy.get('#delete-course-btn').click()
  })

 })
